package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push":
				int param = sc.nextInt();
				stk.push(param);
				break;
			case "pop":
				if (stk.empty()) {
					System.out.println("-1");
				} else {
					int ret = stk.pop();
					System.out.println(ret);
				}
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				if (stk.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (stk.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stk.peek());
				}
				break;
			case "back":
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
