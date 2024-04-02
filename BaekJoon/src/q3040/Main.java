package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int[] b = new int[9];
		int c = 0;
		int d = 0;
		int e = 0;
		// int f = b[d] + b[e];
		for (int i = 0; i < b.length; i++) {
			b[i] = a.nextInt();
		}
		a.close();

		for (int i = 0; i < b.length; i++) {
			c += b[i];
		}
		//System.out.println("sum : " + c);

		int ad=-1 , ae = -1;
		for (d = 0; d < b.length; d++) {
			for (e = d + 1; e < b.length; e++) {
				if (d != e) {
					//System.out.print(d + " : " + e + " = " + (b[d] + b[e]));
					//System.out.println(" ~> " + ( c - (b[d]+b[e])));
					
					if(c - (b[d]+b[e]) == 100) {
						ad = d;
						ae = e;
						break;
					}
				}
			}
		}
		for ( int k = 0; k < b.length; k++) {
			if(k != ad && k!= ae)
				System.out.println(b[k]);
		}
	}
}