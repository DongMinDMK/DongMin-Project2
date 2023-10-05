package hangzhouAsianGameKoreaCurrent;

class HangzhouAsianGameKorea{
	String subject;
	String goldMedal;
	String sliverMedal;
	String bronzeMedal;
	
	
	public HangzhouAsianGameKorea(String subject, String goldMedal, String sliverMedal, String bronzeMedal) {
		this.subject = subject;
		this.goldMedal = goldMedal;
		this.sliverMedal = sliverMedal;
		this.bronzeMedal = bronzeMedal;
	}
	
	public void subjectMethod() {
		System.out.println("항저우 아시안게임에서 대한민국이 잘하는 종목들은 대표적으로 " + this.subject + " 등이 있다.");
		System.out.println("이 3가지 종목은 한국이 아시아 뿐만 아니라 전 세계적으로 가장 잘하는 종목 스포츠 중에 하나이다.");
	}
	
	public void medalCountMethod() {
		System.out.println("현재(10/05) 기준 한국의 메달은 금메달 " + this.goldMedal + "개, " + this.sliverMedal + "개, " + this.bronzeMedal + "을 수여받았다.");
	}
}

class FutureKoreaSports{
	String asiancup;
	String octSoccerMatch;
	
	public FutureKoreaSports(String asiancup, String octSoccerMatch) {
		this.asiancup = asiancup;
		this.octSoccerMatch = octSoccerMatch;
	}
	
	public void futureKoreaMethod() {
		System.out.println("미래 한국이 치뤄야 할 큰 대회는 " + this.asiancup + "과, " + this.octSoccerMatch + "가 있다.");
		System.out.println(this.asiancup +"은 아시아에서 축구를 제일 잘하는 나라를 가리는 대회라 생각하면 되고 쉽게 아시아 월드컵이라고 불리운다.");
		System.out.println(this.octSoccerMatch + "는 성인 축구 국가대표팀이 10월에 친선경기를 치르는 것을 의미한다.");
	}
}

public class HangzhouAsianGameKoreaCurrent {

	public static void main(String[] args) {
		HangzhouAsianGameKorea hagk = new HangzhouAsianGameKorea("양궁, 펜싱, 배드민턴", "33", "45", "70");
		hagk.subjectMethod();
		hagk.medalCountMethod();
		
		System.out.println();
		
		FutureKoreaSports fks = new FutureKoreaSports("아시안컵", "10월 A매치");
		fks.futureKoreaMethod();

	}

}
