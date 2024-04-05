package q2439;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		int o;
		for(int i = 1; i <= a; i++) {
			for(o = 0; o < a-i ; o++) {
				System.out.print(" ");
			}
			for(int p = 0; p < a - o; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
