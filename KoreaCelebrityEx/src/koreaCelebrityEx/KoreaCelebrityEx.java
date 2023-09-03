package koreaCelebrityEx;

interface CelebrityKR{
	public abstract void introduce();
}

class SoccerPlayer implements CelebrityKR{
	String son;
	String kim;
	String lee;
	
	public SoccerPlayer(String son, String kim, String lee) {
		this.son = son;
		this.kim = kim;
		this.lee = lee;
	}

	@Override
	public void introduce() {
		System.out.println("대한민국을 알리는 대표적인 유명인사 중에서 축구선수로는 " + this.son + "선수와, " + this.kim + "선수, 그리고 " + this.lee + "선수가 있다.");
	}
	
	public void soccerMethod() {
		System.out.println("이외에도 정말 많은 축구선수들이 대한민국이라는 나라를 알리고있다.");
	}
	

}

class Singer implements CelebrityKR{
	String bts;
	String blackpink;
	String newJeans;
	String ive;
	
	public Singer(String bts, String blackpink, String newJeans, String ive) {
		this.bts = bts;
		this.blackpink = blackpink;
		this.newJeans = newJeans;
		this.ive = ive;
	}

	@Override
	public void introduce() {
		System.out.println("또한 대한민국을 알리는 가수 중에선 " + this.bts + "보이그룹과, " + this.blackpink + "걸그룹, " + this.newJeans + "와, " + this.ive + " 또한 대한민국을 널리 알리고 있다.");
	}
	
	public void singerMethod() {
		System.out.println("전세계적으로 뻗어나가고 있는 K-POP의 열풍으로 한국을 좋아하는 전세계 사람들이 많아졌다.");
	}
	
}

class KoreaMovie implements CelebrityKR{
	String trainToBusan;
	String squidGame;
	String parasite;
	
	public KoreaMovie(String trainToBusan, String squidGame, String parasite) {
		this.trainToBusan = trainToBusan;
		this.squidGame = squidGame;
		this.parasite = parasite;
	}

	@Override
	public void introduce() {
		System.out.println("또한 한국영화도 전세계적으로 인기를 끌고있다.");
		System.out.println("대표적으로 " + this.trainToBusan + "과, " + this.squidGame + ", 그리고 " + this.parasite + "등이 있다.");
	}
}


public class KoreaCelebrityEx {

	public static void main(String[] args) {
		
		CelebrityKR ckr = new SoccerPlayer("손흥민", "김민재", "이강인");
		ckr.introduce();
		
		SoccerPlayer sp = (SoccerPlayer)ckr;
		sp.soccerMethod();
		
		System.out.println();
		
		ckr = new Singer("방탄소년단", "블랙핑크", "뉴진스", "아이브");
		ckr.introduce();
		
		Singer singer = (Singer)ckr;
		singer.singerMethod();
		
		System.out.println();
		
		ckr = new KoreaMovie("부산행", "오징어게임", "기생충");
		ckr.introduce();

	}

}
