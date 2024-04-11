package q3040;
					//Wed Apr4 rePractice :OverTime
import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];

		for (int i = 0; i < hat.length; i++) {
			hat[i] = sc.nextInt();
			// print
//			System.out.println(hat[i]);
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < hat.length; i++) {
			sum += hat[i];
		}

		// print sum
		System.out.println(sum);

		// Random Num
		Random rand = new Random();
		int k = 0;
		int l = 0;

		while (true) {
			for (int i = 0; i < hat.length; i++) {
				int j = rand.nextInt(7);
				k = i;
				l = j;
			}
			if (sum - (hat[k] + hat[l]) == 100) {
				// Conclusion
				for (int i = 0; i < hat.length; i++) {
					if (hat[i] != hat[k] && hat[i] != hat[l]) {
						System.out.println(hat[i]);
					}
				}break;
				
			}
		}

		// print
//		System.out.println(hat[k]);
//		System.out.println(hat[l]);
//		System.out.println();



	}

}
