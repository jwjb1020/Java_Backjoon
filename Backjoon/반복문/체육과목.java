package Backjoon.반복문;

import java.util.Scanner;

public class 체육과목 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n/4;
		for (int i = 1; i < x+1; i++) {
			System.out.print("long" + " ");
		}
		System.out.println("int");
		sc.close();
		

	}

}
