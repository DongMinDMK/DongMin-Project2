package lamdaPractice;

interface StrConcat{
	public String concat(String str1, String str2);
}

public class LamdaPractice {

	public static void main(String[] args) {
		
		final String str = "DMK";
		
		
		StrConcat strConcat = (s, v) -> {
			String sent = str + ", " + s + " " + v;
			return sent;
		}; 
		
		
		System.out.println(strConcat.concat("백엔드", "개발자가 되고 싶은 목표가 있습니다."));
	}

}
