package q15649;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = bf.readLine().split(" ");
		int input1 = Integer.parseInt(inp[0]);
		int input2 = Integer.parseInt(inp[1]);
		bf.close();
		
		for(int i = 0; i < input1; i++) {
			for(int o = 0; o < input2; o++) {
				
			}
			bw.write();
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
