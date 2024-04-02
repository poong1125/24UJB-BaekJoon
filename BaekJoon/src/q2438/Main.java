package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		char[] b = new char[100];
		for (int i = 0; i < b.length; i++) {
			b[i] = '*';
		}

		for (int o = 0; o < a; o++) {
			for (int q = 0; q <= o; q++) {
				System.out.print(b[q]);
			}
			System.out.println();
		}

	}

}
