package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		int s = 1;

		for (int i = 0; i <= inp; i++) {
			s += 6 * i;

			if (inp <= s) {
				System.out.print(i + 1);
				break;
			}

			// °­»ç´Ô Ç®ÀÌ
			int r = 1, m = 1;
			while (true) {
				if (inp <= r) {
					break;
				}
				r = r + 6 * m++;
			}
			System.out.println(m);

		}

	}

}
