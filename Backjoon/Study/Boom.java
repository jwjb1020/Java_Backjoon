package Backjoon.Study;

import java.util.Scanner;

public class Boom {

	static char[] remove(char[] charArr, char[] boomArr) {
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < boomArr.length; j++) {
				if (boomArr[j] == charArr[i]) {
					charArr[i] = '-';

				}
			}

		}
		
		return charArr;
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.next(); // 문장열을 받는 스캐너

		char[] charArr = value.toCharArray(); // 문자열을 각각의 인덱스가 있는 문자 배열로 변경

		// 배열을 리스트로 바꿈
		// List<Character> valuelist = new ArrayList<>();
//		for (int i = 0; i < charArr.length; i++) {
//			valuelist[i] = charArr[i];
//			
//		}

		String boom = sc.next(); // 삭제할 문자열 넣는 스캐너

		char[] boomArr = boom.toCharArray(); // 문자열을 문자 배열로

		remove(charArr, boomArr);
		String s = new String(charArr);
		  if (s.matches("^(-)+$")) {
	            s = "FRULA";
	        }
		
		
		System.out.println(s.replaceAll("-", ""));
	}

}
