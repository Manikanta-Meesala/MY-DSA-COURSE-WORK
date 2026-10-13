import java.util.Scanner;

class PrevFibUsingSqrtN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
		double denom = (1 + Math.sqrt(5)) / 2;
		double res=Math.round((n/denom));

        System.out.println("Previous Fibonacci number is: " + res);
    }
}
