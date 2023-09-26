package listPractice2;
import java.util.*;

public class ListPractice2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			int tmp = (int)(Math.random()*20) + 1; //1부터 20까지 중에서 랜덤으로 5개의 정수 뽑아 tmp 변수에 저장
			list.add(tmp);
		}
		
		System.out.println("전체 리스트 데이터 : " + list);
		
		System.out.print("짝수 : ");
		
		for(int i=0; i<list.size(); i++) {
			int even = list.get(i);
			
			if(even % 2 == 0) { //하나씩 배열리스트에서 뽑은 정수가 짝수이면
				System.out.print(even + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("홀수 : ");
		
		for(int i=0; i<list.size(); i++) {
			int odd = list.get(i);
			
			if(odd % 2 == 1) { //하나씩 배열리스트에서 뽑은 정수가 홀수이면
				System.out.print(odd + " ");
			}
		}
		
	}

}
