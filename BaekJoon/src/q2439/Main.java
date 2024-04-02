package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int count;
		for(int i = 1; i <= a ; i++) {
			count =0;
			for(int o = 1; o <= a-i; o++) {
				System.out.print(" ");
				count ++;
			}
			for(int p = 1; p <= a-count; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
	
