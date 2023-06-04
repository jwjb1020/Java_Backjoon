package Backjoon.Study;

import java.util.Scanner;

public class Boom {

	static String remove(char[] charArr, char[] boomArr) {
		StringBuilder sb = new StringBuilder();

		for (char c : charArr) {
			boolean isBoom = false;
			for (char a : boomArr) {
				if (c == a) {
					isBoom = true;
					break;
				}
			}
			if (!isBoom) {
				sb.append(c);
			}
		}
		if (sb.toString().length() == 0) {
			sb = new StringBuilder("FRULA");
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.next(); // 문장열을 받는 스캐너

		char[] charArr = value.toCharArray(); // 문자열을 각각의 인덱스가 있는 문자 배열로 변경

		String boom = sc.next(); // 삭제할 문자열 넣는 스캐너

		char[] boomArr = boom.toCharArray(); // 문자열을 문자 배열로

		System.out.println(remove(charArr, boomArr));
	}

}
