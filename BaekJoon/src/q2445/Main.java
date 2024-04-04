package q2445;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= a; i++)/* 9줄 출력 for문*/ { 
			for(int o = 0; o < i; o++) {
				System.out.print("*");
			}
			for(int p = 0; p <(a+a)-(i+i); p++) {
				System.out.print(" ");
			}
			for(int q = 0; q <= i-1; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= a-1; i++) {
			for(int o = 0; o < a-i; o++) {
				System.out.print("*");
			}
			for(int p = 0; p < i+i; p++) {
				System.out.print(" ");
			}
			for(int q = 0; q<a-i; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
