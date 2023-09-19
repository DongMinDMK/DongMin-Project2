package listPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		
		System.out.println("================== 첫번째 배열리스트 생성 ===================");
		
		List<Integer> list = new ArrayList<Integer>();
		
		int[] arr = {1,3,5,8,9};
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("배열리스트 " + i + " : " + list.get(i));
		}
		
		System.out.println("================== 두번째 배열리스트 생성 ===================");
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		int[] arr2 = {3,6,9,12,15};
		
		for(int j=0; j<arr2.length; j++) {
			list2.add(arr2[j]);
		}
		
		for(int j=0; j<list2.size(); j++) {
			System.out.println("두번째 배열리스트 " + j + " : " + list2.get(j));
		}
		
	}

}
