package stringPractice;

public class StringPractice {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("DMK는 개발자를 ");
		
		sb.append("꿈꾸는 사람입니다."); //append()메소드는 뒤에 추가적으로 첨부하는 메소드.
		System.out.println(sb);
		
		System.out.println("위에 적은 글의 길이 : " + sb.length());
		
		sb.delete(5, 8); //sb에서 문자열 인덱스 5번부터 8번인덱스까지 삭제
		System.out.println(sb);
		
		System.out.println("삭제 후 위에 적은 글의 길이 : " + sb.length());
		
		sb.insert(5, "운동선수");
		
		System.out.println(sb);
		
		System.out.println("삽입 후 위에 적은 글의 길이 : " + sb.length());
		
		System.out.println("문자열 중에 0인덱스 하나를 뽑아서 출력 : " + sb.charAt(0));
		
		System.out.println("문자열 중에 2인덱스 하나를 뽑아서 출력 : " + sb.charAt(2));
		
		sb.replace(0, 3, "김철수"); //0번지부터 3번지 전까지 문자열을 DMK -> 김철수로 변경
		
		System.out.println(sb);
		
		sb.reverse(); //교체까지 진행된 문자열을 거꾸로 바꿈
		System.out.println(sb);
		
		
	}

}
