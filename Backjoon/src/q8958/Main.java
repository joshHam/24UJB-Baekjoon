package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] ox = new String[N];

		for (int i = 0; i < ox.length; i++) {
			ox[i] = sc.next();
		}
		sc.close();

		// print
//		for(int i=0;i<ox.length;i++) {
//			System.out.println(ox[i]);
//		}

		char[] cal = new char[80];
		int p = 0;
		int sum = 0;
		int lineSum = 0;

		for (int i = 0; i < ox.length; i++) {
			for (int j = 0; j < ox[i].length(); j++) {
				cal[j] = ox[i].charAt(j);
				if (cal[j] == 'O') {
					p++;
					sum += p;
				} else{
					lineSum+=sum;
					sum = 0;
				}
			}
			System.out.println(lineSum);
			lineSum = 0;
		}

	}

}
