package q2747;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		ArrayList<Integer> nachi = new ArrayList<Integer>();
		nachi.add(0);
		nachi.add(1);
		
		for(int i = 2; i <= input; i++) {
			nachi.add(i,(nachi.get(i-2) + nachi.get(i-1)));
		}
		System.out.println(nachi.get(input));
	}

}
