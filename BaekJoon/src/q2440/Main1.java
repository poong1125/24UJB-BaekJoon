package q2440;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  a  = sc.nextInt();
		sc.close();
		for(int i = 0 ; i < a ; i++) {
			for(int o = 0; o < a-i;o++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
