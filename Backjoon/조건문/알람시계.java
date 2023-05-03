package Backjoon.조건문;

import java.util.Scanner;

public class 알람시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if (m - 45 < 0 && h == 0) {
			h = 24 - 1;
			m += 15;
		}

		else if (m - 45 < 0 && h > 0) {
			m += 15;
			h -= 1;

		}
		else if (m - 45 > 0) {
			m -= 45;
		}
		else if (m - 45 == 0) {
			m = 0;
		}

		System.out.println(h);

		System.out.println(m);
		sc.close();
	}

}
