package q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		if (M >= 45) {
			System.out.println(H + " " + (M - 45));
		} else {
			if (H == 0) {
				System.out.println(23 + " " + (60 - (45 - M)));
			} else {
				System.out.println((H - 1) + " " + (60 - (45 - M)));
			}
		}

		
		// ����� Ǯ��
		if (M < 60) {
			H -= 1;
			M += 60;
		}
		M -= 45;
		if (M >= 60) {
			H += 1;
			M -= 60;
		}
		if (H <= 0) {
			H = 24 + H;
		}
		if (H >= 24) {
			H -= 24;
		}
		System.out.println(H + " " + M);
		
		
	}

}
