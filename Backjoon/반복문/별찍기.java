package Backjoon.반복문;

import java.util.Scanner;

public class 별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-1; j++) {
				
				System.out.print(" ");
				
			}
			n--;
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");



		}
		sc.close();
	}

}
