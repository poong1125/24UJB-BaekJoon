package q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (0 <= a && a < 24 && 0 <= b && b < 60) {
			if (0 <= b - 45) {
				System.out.println(a + " " + (b - 45));
			} else if (b - 45 < 0) {
				if (a - 1 == 0) {
					System.out.println((a - 1) + " " + (b + 60 - 45));
				} else if (1 <= a - 1) {
					System.out.println((a - 1) + " " + (b + 60 - 45));
				} else {
					System.out.println((a + 23) + " " + (b + 60 - 45));
				}
			}

		}
	}

}
