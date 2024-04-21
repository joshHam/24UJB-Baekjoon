package q10809;

import java.util.Scanner;	//못품 Unsolved

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		
		System.out.println(S.charAt(0)-0);
		
		for (int i = 97; i <= 122; i++) {
			while(j>=0) {
				if (S.charAt(j)-0==i) {
					System.out.print(j + " ");
				}else if (S.charAt(j)-0!=i&&S.charAt(j)-0<=122&&S.charAt(j)-0>=97) {
					System.out.print(-1+" ");
				}else {
					break;
				}
		}

		}
	}
}
