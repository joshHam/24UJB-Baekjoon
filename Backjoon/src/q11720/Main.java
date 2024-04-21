package q11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		int A = 0;
		for(int i = 0; i<N;i++) {
		A+=S.charAt(i)-'0';
		}
		
		System.out.println(A);
	}

}
