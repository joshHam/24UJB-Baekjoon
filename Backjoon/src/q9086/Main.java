package q9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
//		System.out.println(N);
		
		for(int i=0;i<N;i++) {
			String S=sc.next();
			
			System.out.print(S.charAt(0));
			System.out.println(S.charAt(S.length()-1));
		}sc.close();
	}

}
