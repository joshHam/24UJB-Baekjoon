package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inp = new int[9];
		
		
		for(int idx =0; idx<=inp.length; idx++) {
			inp[idx] = sc.nextInt();
//프린트	System.out.println(inp[idx]);		
		}
		sc.close();
		
		
//9개의 수 합을 구하기
		int sum = 0;
		for (int i = 0; i<inp.length;i++) {
			sum += inp[i];
		}
		
		System.out.println("sum : " + sum);
		
		
//합계에서 제외 할 2개의 수를 선정 //이중for문
		
		int ai = -1, aj = -1; //이거 왜하는거지?  //밑에 포문 i와 j는 지역변수이므로 for문 빠져나오면 의미없어지기때문에 //-1은그냥잘보이라고
		for(int i = 0; i < inp.length; i++) { 
			for(int j = 0; j < inp.length; j++) {
				if(i != j) {
				System.out.print(i + " : " + j + " = " + (inp[i] + inp[j]));
				System.out.println("~> " + (inp[i] + inp[j]));
				
				if((sum - (inp[i] + inp[j]) == 100)) {
					ai = i;
					aj = j;
					break;
				}
				
				}
			}
		}
		
		
		for(int k = 0; k < inp.length; k++) {
			if(k != ai && k != aj)
				System.out.println(inp[k]);
		}
		
		
	
	}

}
