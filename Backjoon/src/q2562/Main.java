package q2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[]arr=new int[9];
		
		int max = 0;
		int cnt = 0;
		
		
		
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>=max) {
				max=arr[i];
			}
		}sc.close();
		
		System.out.println(max);

			for(int i=0;i<9;i++) {
				cnt++;
				if(max==arr[i]) {
				System.out.println(cnt);				}
			}

		
		

//		Arrays.asList(arr).indexOf("max");
		

	}

}
