package q1193;
import java.util.Scanner;
							//정기선 풀이
public class Main3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      int iMax = 1000000;
      
      sc.close();
      
      int count = 0;
      for(int i = 1; i < iMax; ++i)
      {
         for(int j = 1; j <= i; ++j)
         {
            int head = i - (j-1);
            int tail = j;
            
            ++count;
            
            //System.out.print(head + "/" + tail + " ");
            
            if(count == input)
            {
               if(i % 2 == 1)               
                  System.out.println(head + "/" + tail);   
               else
                  System.out.println(tail + "/" + head);
               return;
            }
         }
         //System.out.println();
      }
   }
}