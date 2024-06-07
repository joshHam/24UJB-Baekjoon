package q2609;

import java.util.Scanner;
							//유클리드 호제법/박현옥풀이
public class Main2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n, m;
      n = sc.nextInt();
      m = sc.nextInt();

      int res = gcd(n, m);
      System.out.println(res);
      System.out.println((n * m) / res);
      sc.close();
   }

   public static int gcd(int a, int b) {
      while(b != 0) {
         int temp = b;
         b = a%b;
         a = temp;
      }
      return a;
   }

}