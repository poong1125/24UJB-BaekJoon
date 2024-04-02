package q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			int a = sc.nextInt();
			if(a<40) {
				a += (40-a);
			}
			sum += a;
		}
		sc.close();
		System.out.println(sum/5);
	}

}
