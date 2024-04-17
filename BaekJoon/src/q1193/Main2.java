package q1193;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		int garo=0;
		int sero=0;
		int i=0;
		int SSS=0;
		int count=0;
		int count2=0;
		
		while(true){
			if(input <= SSS) {
				break;
			}
			i++; //i 는 garo 값을 올려주기 위해
			garo=i;
			for(int qwer = 1; qwer <= i; qwer++) {
				SSS++;
				sero = qwer;
				count=0;
				count++;
				count2=0;
				count2++;
				if(input <= SSS) {
					break;
				}
			}
		}
		System.out.println(sero+"/"+garo);
		
		while(true) {
			if(input == 1) {
				System.out.println("1/1");
				break;
			}else if(i % 2 == 1) {
				System.out.println(sero + "/" + sero);
				break;
			}else if(i % 2 == 0) {
				System.out.println(sero + "/" + sero);
				break;
			}
		}
		
	}

}
