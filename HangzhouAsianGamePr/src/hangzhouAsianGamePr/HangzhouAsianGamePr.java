package hangzhouAsianGamePr;

interface HangzhouAsianGame{
	public abstract void show();
}

class Soccer implements HangzhouAsianGame{
	String country;
	String worldRank;
	
	public Soccer(String country, String worldRank) {
		this.country = country;
		this.worldRank = worldRank;
	}

	@Override
	public void show() {
		System.out.println("항저우 아시안게임 종목 중 축구 종목이 있습니다.");
	}
	
	public void countryMethod() {
		System.out.println("축구 잘하는 나라 중 아시아의 대표적인 나라는 " + this.country + " 등이 있습니다.");
	}
	
	public void worldRankMethod() {
		System.out.println("TOP 순위 순으로 3팀만 뽑자면 각각 세계랭킹은 " + this.worldRank + "입니다.");
	}
	
}

class Archery implements HangzhouAsianGame{
	String country;
	String soloOrTeam;
	
	public Archery(String country, String soloOrTeam) {
		this.country = country;
		this.soloOrTeam = soloOrTeam;
	}

	@Override
	public void show() {
		System.out.println("또 항저우 아시안게임 종목 중 양궁이라는 종목이 있습니다.");
	}
	
	public void countryMethod() {
		System.out.println("양궁을 잘하는 대표적인 나라는 " + this.country + " 등이 있습니다.");
	}
	
	public void soloOrTeamMethod() {
		System.out.println("양궁은 " + this.soloOrTeam + "룰이 있습니다.");
	}
}

class TableTennis implements HangzhouAsianGame{
	String country;
	String soloOrTeam;
	
	public TableTennis(String country, String soloOrTeam) {
		this.country = country;
		this.soloOrTeam = soloOrTeam;
	}

	@Override
	public void show() {
		System.out.println("또 항저우 아시안게임 종목 중 탁구 종목이 있습니다.");
	}
	
	public void countryMethod() {
		System.out.println("탁구 종목에서 대표적으로 잘하는 나라는 " + this.country + " 등이 있습니다.");
	}
	
	public void soloOrTeamMethod() {
		System.out.println("탁구도 양궁과 마찬가지로 " + this.soloOrTeam + "룰이 있습니다.");
	}
	
}

public class HangzhouAsianGamePr {

	public static void main(String[] args) {
		HangzhouAsianGame hag = new Soccer("일본, 이란, 한국", "19위, 21위, 25위");
		
		System.out.println("============== 축구 =============");
		
		hag.show();
		
		Soccer soccer = (Soccer)hag;
		
		soccer.countryMethod();
		soccer.worldRankMethod();
		
		System.out.println("============== 양궁 =============");
		
		hag = new Archery("한국, 중국", "솔로/단체");
		hag.show();
		
		Archery archery = (Archery) hag;
		archery.countryMethod();
		archery.soloOrTeamMethod();
		
		System.out.println("============== 탁구 =============");
		
		hag = new TableTennis("중국, 싱가포르, 한국", "솔로/단체");
		hag.show();
		
		TableTennis tt = (TableTennis) hag;
		tt.countryMethod();
		tt.soloOrTeamMethod();

	}

}
