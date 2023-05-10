package Backjoon.반복문;

import java.util.Scanner;

public class ab4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = a+b;
			
			System.out.println(sum);
			
		}
		sc.close();

	}

}
