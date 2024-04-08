package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i1 = sc.nextInt(); //ù��° ��� ����
//		int i2 = sc.nextInt(); 
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();
		
//		System.out.println(i1);
//		System.out.println(i2);		
		
		
		//ù��° ���
		//i1/10�� ���̳���
//		System.out.println(i1*(i2%10));//i1%10�� �������� ����
//		System.out.println(i1*((int)(i2*0.1)%10));
//		System.out.println(i1*((int)(i2*0.01)%10));
//		System.out.println(i1*i2);
		
		
		//�ι�°���
		
		
		
		
		
		
	//�ι�° Ǯ�̹��
		int inum1 = Integer.parseInt(num1);

		int inum2 = num2.charAt(2) - '0'; //�ڹ��ڿ��� ���� ���ڸ� -'0'���ָ� ���ڷ� ��ȯ�ȴ١�
		System.out.println(inum1 * inum2);//ASCCII�ڵ尪

		inum2 = num2.charAt(1) - '0';
		System.out.println(inum1 * inum2);
		
		inum2 = num2.charAt(0) - '0';
		System.out.println(inum1 * inum2);
		System.out.println(inum1 * Integer.parseInt(num2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
