package week1;

public class FromTo {
    public static void main(String[] args) {
        int from = 1;
        int to = 7;
        String reverse = "";
        char ch;

        while (from <= to) {
            String x = Integer.toString(from);
            for (int i =0; i<x.length(); i++) {
                ch = x.charAt(i);
                reverse = reverse+ch;
                System.out.println(reverse);
            }

            from++;

        }



    }

}




