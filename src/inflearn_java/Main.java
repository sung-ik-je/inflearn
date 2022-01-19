package inflearn_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N =  scanner.nextInt();
		
		int[] arr = new int[9];
		
		gugu(N, arr);
		
	}

	static void gugu(int N, int arr[]) {
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = N * (i+1);
			System.out.println(arr[i]);
		}
		
	}
}