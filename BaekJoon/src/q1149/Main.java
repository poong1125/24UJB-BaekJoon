package q1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int TwoArr[][]= new int[input][3];
		for(int i = 0; i < input; i++) {
			for(int o=0; o < 3;o++) {
				TwoArr[i][o] = sc.nextInt();
//				System.out.println(TwoArr[i][o]); 2차원 배열에 값이 정확히 들어오는지 확인
			}
		}
		
	}

}
