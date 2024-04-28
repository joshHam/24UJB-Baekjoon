package q2444;

import java.util.Scanner; 	//출력형식이잘못되었습니다.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i <= N; i++) {

			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}

//			for (int j = 0; j < N - i; j++) {
//				System.out.print(" ");
//			}

			System.out.println();
		}

		for(int i=N-1; i>0;i--) {
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}

//			for (int j = 0; j < N - i; j++) {
//				System.out.print(" ");
//			}

			System.out.println();
		}
		
		
	}

}
