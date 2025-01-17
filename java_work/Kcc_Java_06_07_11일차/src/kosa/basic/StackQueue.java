package kosa.basic;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {
	public static void main(String[] args) {
		
		// Stack
		Stack<Integer> stack = new Stack<Integer>(); // stack 자료구조
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("-----stack-----");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
		// Queue
		LinkedList<Integer> queue = new LinkedList<Integer>(); // Queue 자료구조
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println("-----queue-----");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
