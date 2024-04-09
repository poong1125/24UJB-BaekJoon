package q10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
			switch (cmd) {
			case "push":
				int param = sc.nextInt();
				que.offer(param);
				break;
			case "pop":
				if (que.isEmpty()) {
					System.out.println("-1");
				} else {
					int d = que.poll();
					System.out.println(d);
				}
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if (que.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (que.isEmpty()) {
					System.out.println("-1");
				} else {
					int qq = que.peek();
					System.out.println(qq);
				}
				break;
			case "back":
				if (que.isEmpty()) {
					System.out.println("-1");
				} else {
					int rear = 0;
					for (int item : que) {
						rear = item;
					}
					System.out.println(rear);
				}
				break;
			}
		}
		sc.close();
	}

}
