import java.util.*;

class SieveArrayMethod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean p[] = new boolean[n+1];
        Arrays.fill(p, true);

        p[0] = false;
        p[1] = false;

        for (int i = 2; i * i <= n;i++) {
            if (p[i]) {
                for (int j = i * i; j<= n; j=j+i) {
                    p[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (p[i])
                System.out.print(i + " ");
        }
    }
}
