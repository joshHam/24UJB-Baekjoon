package q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();            //Integer������ ����� ���� Long���� ����
		sc.close();
		
		//1.while��
		int m =1;
		while(m <= inp) {
			System.out.println(m++);
		}
		
		
		
		
		//2.for��
//		for(int i=1; i<=inp; i++) {
//			System.out.println(i);
		}

	}


