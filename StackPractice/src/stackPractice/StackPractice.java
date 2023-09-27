package stackPractice;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack<Integer> stackList = new Stack<Integer>();
		
		stackList.push(1);
		stackList.push(3);
		stackList.push(5);
		stackList.push(7);
		stackList.push(9);
		stackList.push(11);
		
		System.out.print("스택에 있는 데이터 리스트(pop 진행 전) : ");
		
		for(int i=0; i<stackList.size(); i++) {
			System.out.print(stackList.get(i) + " ");
		}
		
		System.out.println();
		
		stackList.pop(); //스택은 LIFO, 즉 입구가 한쪽이기 때문에 제일 최근에 들어온 데이터가 먼저 나가는 LIFO 구조이다. 따라서 pop을 한번하면 11이 빠져나감.
		stackList.pop(); //pop을 2번실행하면 9가 빠져나가 총 결과가 1,3,5,7의 데이터가 스택에 있을 것임.
		
		System.out.print("스택에 있는 데이터 리스트(pop 진행 후) : ");
		
		
		for(int i=0; i<stackList.size(); i++) {
			System.out.print(stackList.get(i) + " ");
		}
		
		//이거와 반대로 큐는 FIFO 구조이므로, 먼저 들어온 데이터가 먼저 나감.(QueuePractice 프로젝트 확인)
		
	}

}
