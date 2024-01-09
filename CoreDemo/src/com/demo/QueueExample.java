package com.demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.offer("Element 1");
		queue.offer("Element 2");
		queue.offer("Element 3");
		System.out.println("Queue elements: " + queue);
		// Dequeue (remove and retrieve the head of the queue)
		String removedElement = queue.poll();
		System.out.println("Removed element: " + removedElement);

		System.out.println("Queue elements after dequeue: " + queue);

		String peekedElement = queue.peek();
		System.out.println("Peeked element: " + peekedElement);
		System.out.println("Queue elements after peek: " + queue);
	}
}
