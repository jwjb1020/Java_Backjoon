package Backjoon.스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class stack2 {
	private List<Integer> arr;
	private int pointer;

	public stack2() {
		pointer = 0;
		arr = new ArrayList<>();
	}

	public void push(int x) {
		arr.add(x);
		pointer++;
	}

	public int pop() {
		if (arr.isEmpty()) {
			return -1;
		}

		pointer--;
		return arr.remove(pointer);
	}

	public int size() {
		return pointer;
	}

	public int empty() {
		if (pointer == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public int top() {
		if (empty() == 1) {
			return -1;
		}
		return arr.get(pointer - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		stack2 st = new stack2();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");

			switch (input[0]) {
			case "push":
				int num = Integer.parseInt(input[1]);
				st.push(num);
				break;
			case "pop":
				bw.write(Integer.toString(st.pop()));
				bw.newLine();
				break;
			case "size":
				bw.write(Integer.toString(st.size()));
				bw.newLine();
				break;
			case "empty":
				bw.write(Integer.toString(st.empty()));
				bw.newLine();
				break;
			case "top":
				bw.write(Integer.toString(st.top()));
				bw.newLine();
				break;
			}

		}
		bw.flush();
		bw.close();
		br.close();
	}
}
