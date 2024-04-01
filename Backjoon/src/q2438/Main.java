package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		//첫번째for문 행의개수
		for(int i=1; i<=N; i++) {			
		//두번째for문 열의개수
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			//줄바꿈을 위해
			System.out.println(" ");
		}
	}
}