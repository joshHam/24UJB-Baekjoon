package q2439;

import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 0; i < inp; i++) {
			// ' 'blank print
			for (int j = inp - i - 1; j > 0; j--) { // inp-1 (x)
				System.out.print(" ");
			}
			// ' * 'print
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			// print line
			System.out.println(" ");
		}
	}
}
