package q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();            //Integer범위를 벗어나는 수는 Long으로 선언
		sc.close();
		
		//1.while문
		int m =1;
		while(m <= inp) {
			System.out.println(m++);
		}
		
		
		
		
		//2.for문
//		for(int i=1; i<=inp; i++) {
//			System.out.println(i);
		}

	}


