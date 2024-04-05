package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		int qweqwe;
		sc.close();
		int count =0;
		int i = 1;
		
		while(true) {
			if(input == 1) {
				System.out.println(1);
				break;
			}
			for(qweqwe = 1; qweqwe < input ; i++) {
				sum += i;
				qweqwe = (1+(6*sum));
				count++;
				}
			
				if(input <= qweqwe ) {
					System.out.println(count+1);
					break;
				
			}
			
		}

}
}
