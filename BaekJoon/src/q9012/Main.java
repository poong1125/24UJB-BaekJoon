package q9012;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count=0;
		int count2=0;
		
		for(int i = 0; i < input; i++) {
			count=0;
			count2=0;
			String str = sc.next();
			char[] cha = str.toCharArray();
			
			for(int ii = 0; ii < cha.length; ii++) {
				if(cha[ii]=='(') {
					count++;
				}else if(cha[ii]==')') {
					count2++;
					if(count<count2) {
						System.out.println("NO");
						break;
					}
				}
				if(ii==cha.length-1) {
					if(count == count2) {
						System.out.println("YES");
					}else {
						System.out.println("NO");
					}
				}
			}	
		}
		sc.close();		
	}
}
