package q10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int max=-1000001;
		int min= 1000001;
		
		for(int i=0;i<N;i++) {
			int inp = sc.nextInt();
			if(inp>=max) {
				max=inp;
			}
			if(inp<=min) {
				min=inp;
			}
		}sc.close();
		
		
		
		System.out.print(min+" "+max);
	}

}
