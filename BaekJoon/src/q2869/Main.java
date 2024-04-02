package q2869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();
		int sum;
		
		System.out.println((V-A)/(A-B)+1);
	}

}
