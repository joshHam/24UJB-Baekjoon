package q10828;
						//1. �ڹٿ��� �����ϴ� Stack Ŭ������ �̿��� Ǯ��
						//���۵帮�� �Ⱦ��� �ð��ʰ�
import java.util.Scanner;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer>/* <-�Ÿ���� �������� ���ʸ��� �̿��ؼ� ���� */ stk = new Stack(); // Stack Class
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
//			System.out.println(cmd);

			switch (cmd) {
			case "push":
//				System.out.println("push");
				// push����� ���ö��� �������Է��� �ϳ��� �ްڴ�.
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
