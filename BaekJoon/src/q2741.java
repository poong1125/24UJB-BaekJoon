import java.util.Scanner;

public class q2741 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		a.close();
		if(b<=100000) {
			for(int i = 1; i <= b ; i++ ) {
				System.out.println(i);
			}
		}
	}

}
