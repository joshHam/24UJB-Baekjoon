package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inp = new int[9];
		
		
		for(int idx =0; idx<=inp.length; idx++) {
			inp[idx] = sc.nextInt();
//����Ʈ	System.out.println(inp[idx]);		
		}
		sc.close();
		
		
//9���� �� ���� ���ϱ�
		int sum = 0;
		for (int i = 0; i<inp.length;i++) {
			sum += inp[i];
		}
		
		System.out.println("sum : " + sum);
		
		
//�հ迡�� ���� �� 2���� ���� ���� //����for��
		
		int ai = -1, aj = -1; //�̰� ���ϴ°���?  //�ؿ� ���� i�� j�� ���������̹Ƿ� for�� ���������� �ǹ̾������⶧���� //-1���׳��ߺ��̶��
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
