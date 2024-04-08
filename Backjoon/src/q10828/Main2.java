package q10828;
						//1. 자바에서 제공하는 Stack 클래스를 이용한 풀이
						//버퍼드리더 안쓴것 시간초과
import java.util.Scanner;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer>/* <-어떤타입의 스택인지 제너릭을 이용해서 정의 */ stk = new Stack(); // Stack Class
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
//			System.out.println(cmd);

			switch (cmd) {
			case "push":
//				System.out.println("push");
				// push명령이 들어올때만 정수값입력을 하나더 받겠다.
				int param = sc.nextInt();
//				System.out.println(param);

				stk.push(param);
				break;
			case "pop":
//				System.out.println("pop");
				if (stk.empty()) {
					System.out.println("-1");
				} else {
					int ret = stk.pop();
					System.out.println(ret);
				}

				break;

			case "size":
//				System.out.println("size");
				System.out.println(stk.size());
				break;

			case "empty":
//				System.out.println("empty");
				if (stk.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;

			case "top":
//				System.out.println("top");
				if (stk.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stk.peek());
				}

				break;

			}
		}
		sc.close();

	}

}
