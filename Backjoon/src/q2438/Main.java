package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		//ù��°for�� ���ǰ���
		for(int i=1; i<=N; i++) {			
		//�ι�°for�� ���ǰ���
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			//�ٹٲ��� ����
			System.out.println(" ");
		}
	}
}