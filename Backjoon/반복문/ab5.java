package Backjoon.반복문;

import java.util.Scanner;

public class ab5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = a+b;
			break;
			System.out.println(a+b);
		}
		sc.close();
	}

}
