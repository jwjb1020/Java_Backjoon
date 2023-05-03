package Backjoon.조건문;
import java.util.Scanner;

public class 오븐시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (b + c < 60) {
			a += (b + c) / 60;
			System.out.println(a);
			System.out.println(b + c);
		}

		else if (b + c >= 60) {
			a += (b + c) / 60;
			b = (b + c) % 60;
			if (a >= 24) {
				a = a % 24;

			}
			System.out.println(a);
			System.out.println(b);

		}
		sc.close();
	}

}
