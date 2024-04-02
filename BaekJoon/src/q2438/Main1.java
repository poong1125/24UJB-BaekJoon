package q2438;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= a; i++) {
			for(int o = 1; o <= i; o++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
