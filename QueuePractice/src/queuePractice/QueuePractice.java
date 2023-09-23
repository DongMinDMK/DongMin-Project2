package queuePractice;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	
	public int queueMethod(int[] arr) {
		Queue<Integer> queue = new LinkedList<Integer>(); 
		
		int b = 0;
		int c = 0;
		
		for(int i=0; i<arr.length; i++) {
			queue.add(arr[i]);
		}
		
		b = queue.poll(); //큐에 있는 제일 우선순위가 높은 정수를 반환과 동시에 반환한 값 삭제
		
		for(int i=0; i<queue.size(); i++) {
			c = queue.peek(); //큐에 있는 가장 우선순위가 높은 정수를 반환(삭제하지 않음)
		}
		
		return c; //c가 아닌 b를 입력하여 리턴시키면 1이 리턴됨.
		
	}

	public static void main(String[] args) {
		QueuePractice pqp = new QueuePractice();
		
		int[] arr = {1, 3, 2, 4, 5};
		
		int a = pqp.queueMethod(arr);
		
		System.out.println("큐에 있는 내용물 출력 : " + a);
	}

}
