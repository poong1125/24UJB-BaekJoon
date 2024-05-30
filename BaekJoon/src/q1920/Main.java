package q1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws IOException {
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		String a[] = bf.readLine().split(" ");
		int inputnums[] = new int[input];
		for(int i = 0; i < input; i++) {
			inputnums[i] = Integer.parseInt(a[i]);
		}
		
		int input2 = Integer.parseInt(bf.readLine());
		String b[] = bf.readLine().split(" ");
		int inputnums2[] = new int[input2];
		for(int i = 0; i < input2; i++) {
			inputnums2[i] = Integer.parseInt(b[i]);
		}
		
//		int input3[] = new int[input2];
		
		Arrays.sort(inputnums);
		
		for(int i = 0; i < input2 ; i++) {
			if(0 <= Arrays.binarySearch(inputnums, inputnums2[i])) {
				System.out.println(1 + " ");
			}else {
				System.out.println(0 + " ");
			}
		}
	}

}
