package q2588;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int multAll = 0;
		sc.close();

		String StringAll3 = Integer.toString(num2);
		String String3 = StringAll3.substring(2);
		int Chnum3 = Integer.parseInt(String3);
		char String2 = StringAll3.charAt(1);
		int Chnum2 = Character.getNumericValue(String2);
		char String1 = StringAll3.charAt(0);
		int Chnum1 = Character.getNumericValue(String1);

		System.out.println(num1 * Chnum3);
		System.out.println(num1 * Chnum2);
		System.out.println(num1 * Chnum1);

		if (num1 >= 100 && num2 >= 100) {
			multAll = num1 * num2;
		}
		System.out.println(multAll);
	}
}
