import java.util.Scanner;
 
public class codeforces{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long sum = 0;
 
      for (int i = 0; i < n; i++){
        long x = sc.nextLong();
        sum += x;
      }
      sum = Math.abs(sum);
 
      System.out.println(sum);
      sc.close();
  }  
}
