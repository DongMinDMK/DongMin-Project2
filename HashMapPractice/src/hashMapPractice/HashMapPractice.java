package hashMapPractice;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		//HashMap 컬렉션은 키와 값으로 이루어져 있고 키를 통해 호출하고 해당하는 키의 값이 반환되는 형태이다.
		HashMap<String, String> hm = new HashMap<String, String>();
		
		//hashmap은 put을 통해 데이터를 집어넣고 get의 키를 통해 해당하는 데이터 값을 가져온다.
		
		hm.put("취미", "음악감상, 영화보기");
		hm.put("아시안게임종목", "양궁, 축구, 농구, 배구 등");
		hm.put("하계올림픽", "수영, 유도, 배구, 축구 등");
		hm.put("동계올림픽", "쇼트트랙, 피겨, 스피드 스케이팅, 스켈레톤");
		
		System.out.println("나의 취미 : " + hm.get("취미"));
		System.out.println("아시안게임종목(대표적 3개) : " + hm.get("아시안게임종목"));
		System.out.println("하계올림픽종목(대표적 3개) : " + hm.get("하계올림픽"));
		System.out.println("동계올림픽종목(대표적 3개) : " + hm.get("동계올림픽"));
		
		
		hm.remove("취미"); //키가 취미인 데이터 삭제
		
		System.out.println("해시맵에 취미가 과연 존재할까 정답은 ===> " + hm.containsKey("취미"));
		System.out.println("아시안게임은 해시맵에 존재할까요? ===> " + hm.containsKey("아시안게임종목"));		
		System.out.println("하계올림픽은 해시맵에 존재할까요? ===> " + hm.containsKey("하계올림픽"));	
		System.out.println("동계올림픽은 해시맵에 존재할까요? ===> " + hm.containsKey("동계올림픽"));	
		

	}

}
