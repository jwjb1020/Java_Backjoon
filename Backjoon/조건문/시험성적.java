package Backjoon.조건문;

import java.util.Scanner;

public class 시험성적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 90 && 100 >= score) {
			System.out.println("A");
		} else if (90 > score && 80 <= score) {
			System.out.println("B");

		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		sc.close();
	}

}
