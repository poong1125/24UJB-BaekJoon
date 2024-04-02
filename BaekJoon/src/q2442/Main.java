package q2442;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < a ; i++) {
			for(int o = 0 ; o < (a-1)-i; o++) {
				System.out.print(" ");
			}
			for(int p = 0; p < 1+(i+i); p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
