import java.util.*;

class MoveZerosToEnd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }
        while (j < n) {
            a[j++] = 0;
        }

        System.out.println("Array after moving zeros to the end:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}