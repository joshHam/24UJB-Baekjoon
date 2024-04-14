package q2588;

import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i1 = sc.nextInt(); //첫占쏙옙째 占쏙옙占� 占쏙옙占쏙옙
//		int i2 = sc.nextInt(); 
		String num1 = sc.next(); 
		String num2 = sc.next();
		sc.close();
		
//		System.out.println(i1);  
//		System.out.println(i2);		
		
		
		//첫占쏙옙째 占쏙옙占�
		//i1/10占쏙옙 占쏙옙占싱놂옙占쏙옙
//		System.out.println(i1*(i2%10));//i1%10占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙
//		System.out.println(i1*((int)(i2*0.1)%10));
//		System.out.println(i1*((int)(i2*0.01)%10));
//		System.out.println(i1*i2);
		
		
		//占싸뱄옙째占쏙옙占�
		
		
		
		
		
		
	//占싸뱄옙째 풀占싱뱄옙占�
		int inum1 = Integer.parseInt(num1);

		int inum2 = num2.charAt(2) - '0'; //占쌘뱄옙占쌘울옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쌘몌옙 -'0'占쏙옙占쌍몌옙 占쏙옙占쌘뤄옙 占쏙옙환占싫다∽옙
		System.out.println(inum1 * inum2);//ASCCII占쌘드값

		inum2 = num2.charAt(1) - '0';
		System.out.println(inum1 * inum2);
		
		inum2 = num2.charAt(0) - '0';
		System.out.println(inum1 * inum2);
		System.out.println(inum1 * Integer.parseInt(num2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
