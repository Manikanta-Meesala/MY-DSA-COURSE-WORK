import java.util.Scanner;

class PrevFib {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        while (n > 1) {
            n--;
            if (isFib(n)) {
                break;
            }
        }

        System.out.println("Previous Fibonacci number is: " + n);
    }

    static boolean isFib(int n) {
        int a = 0, b = 1, c;
        if (n == 0 || n == 1)
            return true;

        while (true) {
            c = a + b;
            if (c == n)
                return true;
            if (c > n)
                return false;
            a = b;
            b = c;
        }
    }
}
