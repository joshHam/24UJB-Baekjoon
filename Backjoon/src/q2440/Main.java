package q2440;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = N; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 풀이 2
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
