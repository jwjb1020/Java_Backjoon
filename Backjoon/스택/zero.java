package Backjoon.스택;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zero {
	private List<Integer> arr;
	private int top;
	
	public zero() {
		top = 0;
		arr = new ArrayList<>();
	}
	public void push(int x) {
		arr.add(x);
		top++;
	}

	public int pop() {
		if (arr.isEmpty()) {
			return -1;
		}

		top--;
		return arr.remove(top);
	}

	public int size() {
		return top;
	}

	public int empty() {
		if (top == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public int top() {
		if (empty() == 1) {
			return -1;
		}
		return arr.get(top - 1);
	}
	
	public void showStack() {
		System.out.println(arr);
	}
	
	public void sumStack() {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
			
		}
		System.out.println(sum);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		zero st = new zero();
		for (int i = 0; i < k; i++) {
			int input = sc.nextInt();
			if(input ==0) {
				st.pop();
			}
			else {
				st.push(input);
				
				
			}
			
		}
		
		st.sumStack();
		
		
	}

}
