public class Multiples {

    public static boolean IsDiv3(int i) {
        return i % 3 == 0;
    }

    public static boolean IsDiv5(int i) {
        return i % 5 == 0;
    }
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if (IsDiv3(i) || IsDiv5(i)) {
                count++;
            } //end if
        } //end for

        System.out.println(count);
    } //end main
} //end class
