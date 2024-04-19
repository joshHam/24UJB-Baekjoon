package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
			
		int[]A = new int[N];			//배열보관안해도됨
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			
			if(A[i]<X) {
				System.out.print(A[i]+" ");
			}
		}sc.close();
		

	}
}