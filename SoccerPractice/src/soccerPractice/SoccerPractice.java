package soccerPractice;

interface Soccer{
	public abstract void introduceSoccerMethod();
}

class Forward implements Soccer{
	String striker;
	String targeter;
	String winger;
	
	public Forward(String striker, String targeter, String winger) {
		this.striker = striker;
		this.targeter = targeter;
		this.winger = winger;
	}

	@Override
	public void introduceSoccerMethod() {
		System.out.println("축구 포지션 중 공격수 포지션입니다.");
		System.out.println("공격수 포지션은 크게 " + this.striker + ", " + this.targeter + ", 그리고 " + this.winger + " 포지션으로 나뉩니다.");
	}
	
	public void forwardMethod() {
		System.out.println("주로 상대방 골문에 득점을 하는 포지션입니다.");
	}
}

class Midfielder implements Soccer{
	String attackingMid;
	String centeralMid;
	String defendedMid;
	
	public Midfielder(String attackingMid, String centeralMid, String defendedMid) {
		this.attackingMid = attackingMid;
		this.centeralMid = centeralMid;
		this.defendedMid = defendedMid;
	}

	@Override
	public void introduceSoccerMethod() {
		System.out.println("축구 포지션 중 미드필더 포지션이 있습니다.");
		System.out.println("미드필더는 또 크게 3가지로 포지션이 나뉘는데 " + this.attackingMid + ", " + this.centeralMid + ", 그리고 " + this.defendedMid + "로 나뉩니다.");
	}
	
	public void midFieldMethod() {
		System.out.println("주로 공격수에게 볼을 전달해주는 선수가 미드필더 포지션입니다.");
		System.out.println("시야가 넓고, 킥력이 좋은, 패스가 좋은 선수들이 미드필더 포지션에 속합니다.");
	}
}

class Defender implements Soccer{
	String libero;
	String sweeper;
	
	public Defender(String libero, String sweeper) {
		this.libero = libero;
		this.sweeper = sweeper;
	}

	@Override
	public void introduceSoccerMethod() {
		System.out.println("축구에서 수비수 포지션이 있습니다.");
		System.out.println("수비수 포지션은 말 그대로 상대 공격수로부터 공을 뺏어서 우리팀 미드필더, 공격수 선수들에게 볼을 전달하는 포지션입니다.");
	}
	
	public void defendMethod() {
		System.out.println("수비수 포지션은 크게 " + this.libero + ", 와 " + this.sweeper + "로 나뉩니다.");
	}
	
	
}

public class SoccerPractice {

	public static void main(String[] args) {
		
		System.out.println("============= 공격수 =================");
		
		Soccer soccer = new Forward("스트라이커", "타겟터", "윙어");
		soccer.introduceSoccerMethod();
		
		Forward forward = (Forward) soccer;
		forward.forwardMethod();
		
		System.out.println("============= 미드필더 =================");
		
		soccer = new Midfielder("공격형 미드필더", "중앙 미드필더", "수비형 미드필더");
		soccer.introduceSoccerMethod();
		
		Midfielder mid = (Midfielder) soccer;
		mid.midFieldMethod();
		
		System.out.println("============= 수비수 =================");
		
		soccer = new Defender("리베로", "스위퍼");
		soccer.introduceSoccerMethod();
		
		Defender defend = (Defender) soccer;
		defend.defendMethod();
		
		

	}

}
