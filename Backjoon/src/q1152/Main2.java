package q1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {			//박현옥코드
   public static void main(String args[]) throws IOException {
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//      System.out.println(st.countTokens());
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String list[] = str.trim().split("");
      if(list[0] == "") {
         System.out.println(list.length - 1);
      }else {
         System.out.println(list.length);
      }
      sc.close();
   }
}