package Backjoon.반복문;

import java.util.Scanner;

public class 영수증 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int yes = 0;
		for (int i = 1; i < y + 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			yes += a * b;

		}

		if (yes == x) {
			System.out.println("Yes");
		} else
			System.out.println("No");

		sc.close();
	}

}
