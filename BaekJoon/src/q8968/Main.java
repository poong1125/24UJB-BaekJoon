package q8968;

	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			for(int i = 0; i < a; i++) {
				String str = sc.next();
				char[] cha = str.toCharArray();
				int Vegeta=0;
				int Kakarot = 1;	
				for(int ii = 0; ii < cha.length; ii++) {
					if(cha[ii]=='O') {
						Vegeta += Kakarot;
						Kakarot++;
					}else if(cha[ii]=='X') {
						Kakarot = 1;
					}
				}
				System.out.println(Vegeta);
			}
			sc.close();
			
		}
	
	}
