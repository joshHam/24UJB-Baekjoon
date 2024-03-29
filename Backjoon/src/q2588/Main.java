package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i1 = sc.nextInt(); //첫번째 방법 선언
//		int i2 = sc.nextInt();
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();
		
//		System.out.println(i1);
//		System.out.println(i2);		
		
		
		//첫번째 방법
		//i1/10은 몫이나옴
//		System.out.println(i1*(i2%10));//i1%10은 나머지가 나옴
//		System.out.println(i1*((int)(i2*0.1)%10));
//		System.out.println(i1*((int)(i2*0.01)%10));
//		System.out.println(i1*i2);
		
		
		//두번째방법
		
		
		
		
		
		
	//두번째 풀이방법
		int inum1 = Integer.parseInt(num1);

		int inum2 = num2.charAt(2) - '0'; //★문자열로 받은 숫자를 -'0'해주면 숫자로 변환된다★
		System.out.println(inum1 * inum2);//ASCCII코드값

		inum2 = num2.charAt(1) - '0';
		System.out.println(inum1 * inum2);
		
		inum2 = num2.charAt(0) - '0';
		System.out.println(inum1 * inum2);
		System.out.println(inum1 * Integer.parseInt(num2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
