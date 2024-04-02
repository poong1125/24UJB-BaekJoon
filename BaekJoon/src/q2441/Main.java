package q2441;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int count;
		
		for(int i = 0; i < a; i++) {
			count = 0;
			for(int o = 0; o <=(i-1); o++) {
				System.out.print(" ");
				count++;
			}for(int p = 0; p < a-(count); p++) {
				System.out.print("*");
			}System.out.println();
		}	
	}
}