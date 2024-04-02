package q2443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < a; i++) {
			for(int o = 0; o < i; o++) {
				System.out.print(" ");
			}
			for(int p = 1; p <= (a+a-1)-(i*2); p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
