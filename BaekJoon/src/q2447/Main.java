package q2447;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int count = 0;
		
		while(true) {
			count++;
			if(a == 3) {
				break;
			}a = a / 3;
			
		}System.out.println(count);
		
		for(int i = 1; i <= a; i++) {
			if(1 == (a+3+i)/3) {
				System.out.print("*");
			}else if(2 == (a+i)%3) {
				System.out.print("* *");
			}
		}
	}

}
