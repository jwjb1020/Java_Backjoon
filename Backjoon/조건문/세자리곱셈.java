package Backjoon.조건문;

import java.util.Scanner;

public class 세자리곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		// System.out.println("\t");
		int n2 = sc.nextInt();

		int n3 = n1 * (n2 % 10);
		int n4 = n1 * ((n2 / 10) % 10);
		int n5 = n1 * (n2 / 100);

		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n3 + (n4 + n5 * 10) * 10);
	}

}
