public class Reduce {

    public static int Process(int n) {
        int k = n;
        if (k % 2 == 0) {
            k = k / 2;
        }
        else if (k % 2 == 1) {
            k = k - 1;
        }
        return k;
    }
    public static void main(String[] args) {
        int n = 100;
        int pc = 0;
        while (n != 0) {
            n = Process(n);
            pc++;
        }
        System.out.println(pc);
    }
}
