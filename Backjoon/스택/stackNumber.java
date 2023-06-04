package Backjoon.스택;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class stackNumber {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Stack<Integer> st = new Stack<>();
	ArrayList<Character> arr = new ArrayList<>();
	
	int n = sc.nextInt();
	
	int start =0;
	while(n>0) {
		int value = sc.nextInt();
		
		if(start < value) {
			for (int i = start+1; i <= value; i++) {
				st.push(i);
				arr.add('+');
				
			}
			start = value;
		}
		else if(st.peek() != value) {
			System.out.println("NO");
			return;
		}
		st.pop();
		arr.add('-');
		
		n--;
	}
	for (int i = 0; i < arr.size(); i++) {
		System.out.print(arr.get(i)+"\n");
		
	}
	
}

}
