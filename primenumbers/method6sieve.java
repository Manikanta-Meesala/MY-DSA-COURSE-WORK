import java.util.*;

class SieveMethod {
    public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<>();
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
                al.add(i);
        }
		for(Integer t:al)
		{
			System.out.print(" as ayyar list : "+t);
		}
    }
}
