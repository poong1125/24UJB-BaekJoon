package q2444;

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
		for(int i = 1; i < a; i++) {
			for(int o = 0; o < i; o++) {
				System.out.print(" ");
			}
			for(int p = 0; p < (a+a)-((i*2)+1); p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
