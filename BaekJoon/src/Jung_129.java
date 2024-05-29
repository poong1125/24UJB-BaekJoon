import java.util.Scanner;

public class Jung_129 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input_bottom = sc.nextInt();
			int input_height = sc.nextInt();
			System.out.print("Base = ");
			System.out.print("Height = ");
			double hap = ((double)input_bottom*(double)input_height)/2;
			System.out.printf("Triangle width = %.1f\n" ,  hap );
			String input = sc.next();
			if(input.equals("Y")) {
				System.out.print("Continue? ");
			}else if(input.equals("y")) {
				System.out.print("Continue? ");
			}else {
				System.out.print("Continue? ");
				break;
			}
		}
	}

}
