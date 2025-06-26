public class RunLengthDecoder {
    public static void main(String[] args) {
        String input = "a12b13c11x3";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); ) {
            char ch = input.charAt(i);
            i++;

            StringBuilder numStr = new StringBuilder();
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                numStr.append(input.charAt(i));
                i++;
            }

            int count = Integer.parseInt(numStr.toString());

            for (int j = 0; j < count; j++) {
                output.append(ch);
            }
        }

        System.out.println(output.toString());
    }
}
