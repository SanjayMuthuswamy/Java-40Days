package Day8 ;

import java.util.LinkedList;

public class LinkedListp {
    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<>();

        // ADDING ELEMENTS
        linkedlist.add("A");                 // add to end
        linkedlist.addFirst("B");           // add to front
        linkedlist.addLast("C");            // add to end (same as add)
        linkedlist.offer("D");              // add to end (queue-style)
        linkedlist.offerFirst("E");         // add to front (queue-style)
        linkedlist.offerLast("F");          // add to end (queue-style)

        System.out.println("Initial List: " + linkedlist);

        // ACCESS ELEMENTS
        System.out.println("First: " + linkedlist.getFirst());   // get front
        System.out.println("Last: " + linkedlist.getLast());     // get end
        System.out.println("Index 2: " + linkedlist.get(2));     // get by index

        // PEEK (like get but doesn't throw exception if empty)
        System.out.println("Peek: " + linkedlist.peek());        // same as peekFirst
        System.out.println("Peek First: " + linkedlist.peekFirst());
        System.out.println("Peek Last: " + linkedlist.peekLast());

        // REMOVE ELEMENTS
        linkedlist.remove();             // remove from front (same as removeFirst)
        linkedlist.removeFirst();        // remove first element
        linkedlist.removeLast();         // remove last element
        linkedlist.remove("C");          // remove by value
        System.out.println("After Removals: " + linkedlist);

        // POLL (like remove but returns null if empty)
        System.out.println("Poll: " + linkedlist.poll());
        System.out.println("Poll First: " + linkedlist.pollFirst());
        System.out.println("Poll Last: " + linkedlist.pollLast());

        // CHECKING
        System.out.println("Contains 'A'? " + linkedlist.contains("A"));
        System.out.println("Is Empty? " + linkedlist.isEmpty());
        System.out.println("Size: " + linkedlist.size());

        // CLEAR
        linkedlist.clear();
        System.out.println("After clear(): " + linkedlist);
    }
}

// | Method                                      | Purpose              |
// | ------------------------------------------- | -------------------- |
// | `add()`                                     | Adds to end          |
// | `addFirst()`                                | Adds to front        |
// | `addLast()`                                 | Adds to end          |
// | `offer()`, `offerFirst()`, `offerLast()`    | Queue-style adds     |
// | `get()`, `getFirst()`, `getLast()`          | Access elements      |
// | `peek()`, `peekFirst()`, `peekLast()`       | View without remove  |
// | `remove()`, `removeFirst()`, `removeLast()` | Remove elements      |
// | `poll()`, `pollFirst()`, `pollLast()`       | Remove (null-safe)   |
// | `contains()`                                | Checks for element   |
// | `clear()`                                   | Removes all elements |
// | `size()`                                    | List size            |
// | `isEmpty()`                                 | Check if empty       |
