package Backjoon.스택;

import java.util.Scanner;
import java.util.Stack;

public class PString {

	static public String input(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(') {
				st.push(c);

			} else if (st.empty()) {
				return "NO";
			} else {
				st.pop();
			}

		}

		if (st.empty()) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {
			String a = input(sc.next());
			System.out.println(a);

		}
		sc.close();
	}

}
