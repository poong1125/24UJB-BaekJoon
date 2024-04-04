package q2446;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int o;
		int k;
		
		
		for(int i = 0; i < a; i++) {
			for(o=0; o < i; o++) {
				System.out.print(" ");
			}
			for(int p = 0; p < (a+a-(1+i+i)); p++) {
				System.out.print("*");
			}
//			for(int j=1; j <= i; j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		for(int i = 1; i <= a-1; i++) {
			for(k = 0; k < a-(1+i); k++) {
				System.out.print(" ");
			}
			for(int n = 0; n < (a+a)-(1+k+k);n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
