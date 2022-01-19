package inflearn_java;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		int N =  scanner.nextInt();
		
		for(int i = 0; i<N; i++) {
			int A =  scanner.nextInt();
			switch(A) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12 :
				System.out.println("31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30");
				break;
			default :
				System.out.println("28 or 29");
				break;
			}
			
		}
	}
}

