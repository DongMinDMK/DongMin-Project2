package hashSetAndListPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetAndListPractice {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(); //set컬렉션은 중복을 제거하여 모아둔 리스트를 말함.
		
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		
		System.out.println("set컬렉션 현재 사이즈 : " + set.size());
		
		System.out.println(set);
		
		set.remove(3); //3 데이터를 지움. 그러면 중복 제거 된 리스트 1,2,3,4에서 3이 지워져 1,2,4가 출력
		
		
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>(); //중복까지 포함된 list 컬렉션
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		
		System.out.println("list컬렉션 현재 사이즈 : " + list.size());
		
		System.out.println(list);
		
		list.remove(3); //중복 포함된 리스트에서 인덱스 3번째에 있는 데이터 지움, 그리고 그 데이터와 중복된 데이터는 그대로 살아있음. list 컬렉션은 중복을 포함시키는 컬렉션
		
		System.out.println(list);
		
		
		//set 컬렉션은 중복 포함 X, list 컬렉션은 중복 포함 O
		
		
	}

}
