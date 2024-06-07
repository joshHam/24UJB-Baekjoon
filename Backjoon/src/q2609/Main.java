package q2609;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int min = Math.max(A, B);
		int max = Math.min(A, B);
		for(;;) {
			if(A%min==0 && B%min==0) {
				System.out.println(min);
				break;
			}else {
				min--;
			}
		}
		
		for(;;) {
		if(max%A==0 && max%B==0) {
			System.out.println(max);
			break;
		}else {
			max++;
		}
		}
		
		
	}

}








