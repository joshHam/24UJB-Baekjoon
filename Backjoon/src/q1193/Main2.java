package q1193;
						// 내풀이 통과안됨
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int s = 0;//규칙범위간 간격
		int k = 0;
		for (int i = 1; i < X; i++) {
			s += i;
			if (X > s) {
				k = i;
			}
		}

//		System.out.print(k);

		int j = 0;
		for (int i = 1; i <= k; i++) {
			j += i;
		}

		//좌우값
		int A = X - j;
		int B = (k + 2) - (X - j);

		if (k % 2 == 0) {
			System.out.print(B + "/");
			System.out.print(A);
		} else {
			System.out.print(A + "/");
			System.out.print(B);
		}

	}

}
