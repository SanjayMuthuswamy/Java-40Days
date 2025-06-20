    package Day10;

    interface singlylinkedlistInterface<T>{
        void add(  T data);
        boolean delete( T data ) ; 
        void display( ) ;
    }

    //Add ,  Remove , Dispaly 
    class Node<T>{
        T data ;
        Node<T> next ; 
        // 
        
        public Node (T data){
            this.data =  data ;
            this.next = null ; 
        }
    }
    
    // T - generic Type parameter

    class singlylinkedlist<T> implements singlylinkedlistInterface<T> {
        private Node<T> head ;
        private int size ;
        
        public singlylinkedlist() {
            this.head =null ; 
            this.size =0 ; 
        }

        public void add(T data) {
            Node<T> newnode = new Node<T>(data) ; 


             if (head == null){
                head  =  newnode ; // headNode 
            }
            
            else{
                Node<T>currentnode  =  head ; 

                while(currentnode.next !=null) {
                    currentnode = currentnode.next ; 
                }
                currentnode.next = newnode ; 
            }
            size++ ; 
        }
        

        public boolean delete(T data){
            
            if (head ==null){
                return false; 
            }

            if(head.data.equals(data)){
                head = head.next ; 
                size -- ; 
                return true ;  
            }

            Node<T> currentnode =  head ; 
            while(currentnode.next != null) { //current.next.data.equals(data)
                if(currentnode.next.data.equals(data)) {
                    currentnode.next =  currentnode.next.next ; 
                    size -- ; 
                    return true ; 
                }
                currentnode = currentnode.next;     
            }
            return false ; 
        }

        public void display(){
            if (size == 0 ){
                System.out.println("The list is Empty");
                return ;
            }

            if(size == 1 ){
                System.out.println(head.data);
                return ;
            }

            Node<T> currentnode =  head ; 
            while (currentnode != null){
                // if (currentnode.next ==  null){
                //     System.out.println(currentnode.data + "-> null" );
                //     return ; 
                // }
                System.out.print(currentnode.data + "->");
                currentnode = currentnode.next;
            }
            System.out.println("Null");
            return  ;
        }
    }

    //MAIN  ::::: CLASS 
    public class singlylinkedlistMain {
        public static void main(String[] args) {
            singlylinkedlist<Object> list = new singlylinkedlist<>();

            list.add("sanjay");
            list.add(20);
            list.add(30);
            list.display();

            list.delete(20);
            list.display();

            list.delete(30) ; 
            list.display();
            list.delete("sanjay");  


            list.display();
        }
    }

    
