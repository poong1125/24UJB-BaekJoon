package q1193;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		int count =0;
		int i=0;
		int si = 0;
		int garo =0;
		int sero =0;
		int qq=0;
		int SSS=0;
		
		while(true){
			i++;
			if(input <= SSS) {
				break;
			}
			garo=i;
			for(int qwer = 1; qwer <= i; qwer++) {
				SSS++;
				sero = qwer;
				if(input <= SSS) {
					break;
				}
			}
		}
		//garo 4 ,sero 5
		
		while(true) {
			if(count <= input) {
				break;
			}

			qq++;
			if(qq == 1) {
				System.out.println("1/1");
				count++;
				break;
			}else if(qq % 2 == 1) {
				si = qq-sero+1;
				count++;
			}else if(qq % 2 == 0) {
				si= qq-sero;
				count++;
			}
		}
		System.out.println(sero+"/"+garo);
	}

}
