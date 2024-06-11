package q1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String b[] = bf.readLine().split(" ");
		bf.close();
		int input = Integer.parseInt(a);
		int Num[] = new int[input];
		for(int i = 0; i < input; i++) {
			Num[i] = Integer.parseInt(b[i]);
		}
		Arrays.sort(Num);
		
	}

}
