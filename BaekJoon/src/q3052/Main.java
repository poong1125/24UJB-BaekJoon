package q3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		for(int i = 0; i < a.length ; i ++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		for ( int i = 0; i < a.length; i++) {
			b[i] = a[i]%42;
		}
		int[] C = Arrays.stream(b).distinct().toArray();
		System.out.println(C.length);
	}

}
