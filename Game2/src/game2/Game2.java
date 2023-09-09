package game2;

interface FifaOnline4_TOT{
	public abstract void fifaMethod();
}

class Kane implements FifaOnline4_TOT{
	int height;
	String position;
	String playerName;
	
	public Kane(int height, String position, String playerName) {
		this.height = height;
		this.position = position;
		this.playerName = playerName;
	}

	@Override
	public void fifaMethod() {
		System.out.println("온라인 게임 중에서 피파온라인이라는 축구게임이 있다.");
		System.out.println("그 중 토트넘 팀이 있는데 그 팀에는 토트넘 레전드라고 불리는 핵심선수였던 " + this.playerName + "가 있다.");
	}
	
	public void kaneMethod() {
		System.out.println("이 선수의 국적은 잉글랜드 이며, 키는 " + this.height + "cm 정도이며, 포지션은 " + this.position + "이다.");
		System.out.println("토트넘 레전드인 선수이지만 현재는 더 좋은 클럽으로 가서 경기를 뛰고 있고 대한민국 선수 손흥민 선수와 절친이다.");
	}
}

class Son implements FifaOnline4_TOT{
	int height;
	String position;
	String playerName;
	
	public Son(int height, String position, String playerName) {
		this.height = height;
		this.position = position;
		this.playerName = playerName;
	}

	@Override
	public void fifaMethod() {
		System.out.println("피파온라인에서 토트넘이라는 잉글랜드 1부리그 팀 중에서 현재 주장을 맡고 있는 " + this.playerName + "선수가 있다.");
		System.out.println("이 선수의 국적은 대한민국입니다.");
		System.out.println("아시아 선수 최초로 빅리그 득점왕(프리미어리그)을 차지한 대단한 선수이다.");
	}
	
	public void sonMethod() {
		System.out.println(this.playerName + "선수는 키가 " + this.height + "cm 정도이며, 포지션은 " + this.position + "이다.");
		System.out.println("해리 케인 선수와 프리미어리그 최고의 콤비를 자랑했었으며, 현재 이 듀오가 협심해 가장 많은 골을 넣고있다.");
	}
	
}

public class Game2 {

	public static void main(String[] args) {
		
		System.out.println("--------최전방 스트라이커--------");
		
		FifaOnline4_TOT tot = new Kane(188, "ST(스트라이커)", "해리 케인");
		tot.fifaMethod();
		
		Kane kane = (Kane) tot;
		kane.kaneMethod();
		
		System.out.println("---------윙어(공격수)----------");
		tot = new Son(183, "LW/RW/LM/RM(윙어)", "손흥민");
		tot.fifaMethod();
		
		Son son = (Son) tot;
		son.sonMethod();
		
		

	}

}
