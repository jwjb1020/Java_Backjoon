package Backjoon.스택;

import java.io.BufferedReader; // 임포트 필수
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
//	정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//

	private List<Integer> arr;
	private int top; // 스텍 포인터

	public Main() {
		top = 0;
		arr = new ArrayList<>();

	}

//	push X: 정수 X를 스택에 넣는 연산이다.
	public void push(int x) {
		arr.add(x);
		top++;

	}

// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다
	public int pop() {
		if (arr.isEmpty()) {
			return -1;

		}

		top--;
		return arr.remove(top);

	}

	// size: 스택에 들어있는 정수의 개수를 출력한다.
	public int size() {
		return top;
	}

//	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	public int empty() {
		if (top == 0) {
			return 1;
		} else
			return 0;
	}

	// top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int top() {
		if (empty() == 1) {
			return -1;
		}
		return arr.get(top - 1);

	}

//	명령은 총 다섯 가지이다.

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main st = new Main();
		while (true) {
			String input = br.readLine();

			switch (input) {
			case "push":
				String number = br.readLine();
				int num = Integer.parseInt(number);
				st.push(num);
				break;

			case "pop":
				bw.write(Integer.toString(st.pop()));
				bw.newLine();

				// System.out.println(st.pop());
				break;

			case "size":
				bw.write(Integer.toString(st.size()));
				bw.newLine();

				// System.out.println(st.size());
				break;

			case "empty":
				bw.write(Integer.toString(st.empty()));
				bw.newLine();

				// System.out.println(st.empty());
				break;
			case "top":
				bw.write(Integer.toString(st.top()));
				bw.newLine();

				// System.out.println(st.top());
				break;

			}
			bw.flush();
		}

	}
}
