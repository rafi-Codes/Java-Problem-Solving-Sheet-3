import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long x = sc.nextLong(); 
        for (int i = 0; i < n; i++) {
          if (arr[i] == x) {
            System.out.println(i); 
            return;
          }
        }
        System.out.println(-1); 
        sc.close();
    }
}
