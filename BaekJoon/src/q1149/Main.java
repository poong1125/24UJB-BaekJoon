package q1149;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] RGB = new int[input][3];
		
		for (int i = 0; i < input; i++) {
			RGB[i][0] = sc.nextInt();
			RGB[i][1] = sc.nextInt();
			RGB[i][2] = sc.nextInt();
		}
		sc.close();

		int[][] dp = new int[input][3];
		dp[0][0] = RGB[0][0];
		dp[0][1] = RGB[0][1];
		dp[0][2] = RGB[0][2];

		for (int i = 1; i < input; i++) {
			dp[i][0] = RGB[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = RGB[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] = RGB[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
		}

		int siuuu = Math.min(dp[input - 1][0], Math.min(dp[input - 1][1], dp[input - 1][2]));
		System.out.println(siuuu);
	}
}

