package Backjoon.스택;

import java.util.Scanner;
import java.util.Stack;

public class banlanceWorld {
	static private boolean input(String s) {
		Stack<Character> st1 = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '[') {
				st1.push(ch);
			} else if (ch == ')') {
				if (st1.isEmpty() || st1.peek() != '(') {
					return false;
				}
				st1.pop();
			} else if (ch == ']') {
				if (st1.isEmpty() || st1.peek() != '[') {
					return false;
				}
				st1.pop();
			}
		}
		return st1.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;

		while (true) {
			s = sc.nextLine();
			if (s.equals(".")) {
				break;

			}
			System.out.println(input(s) ? "YES" : "NO");

		}

	}

}
