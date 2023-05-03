package Backjoon.반복문;

import java.util.Scanner;

public class 합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = 0;
		for (int i = 1; i < n + 1; i++) {
			value += i; 

		}
		System.out.println(value);
		sc.close();
	}

}
