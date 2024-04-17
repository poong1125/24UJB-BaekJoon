package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sequence[] = new int[N];
		
		for(int i = 0; i < N ; i++) {
			sequence[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0 ; i < N ; i++) {
			if(X > sequence[i]) {
				System.out.print(sequence[i] + " ");
			}
		}
	}

}
