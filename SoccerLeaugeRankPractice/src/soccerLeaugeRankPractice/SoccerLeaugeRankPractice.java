package soccerLeaugeRankPractice;

interface SoccerLeague{
	public void topThreeTeamMethod();
}

class PremierLeague implements SoccerLeague{
	String soccerTeam;
	String typicalColor;
	
	public PremierLeague(String soccerTeam, String typicalColor) {
		this.soccerTeam = soccerTeam;
		this.typicalColor = typicalColor;
	}

	@Override
	public void topThreeTeamMethod() {
		System.out.println("현재 (10/09)일 기준 잉글랜드 프리미어리그에서 상위 랭킹 3팀은 " + this.soccerTeam + "입니다.");
	}
	
	public void plTeamColorMethod() {
		System.out.println(this.soccerTeam + "구단의 각각 순서대로 상징하는 색은 " + this.typicalColor + "입니다.");
	}
}

class Bundesliga implements SoccerLeague{
	String soccerTeam;
	String typicalColor;
	
	public Bundesliga(String soccerTeam, String typicalColor) {
		this.soccerTeam = soccerTeam;
		this.typicalColor = typicalColor;
	}
	
	@Override
	public void topThreeTeamMethod() {
		System.out.println("현재 (10/09)일 기준 독일 분데스리가 리그에서 상위 랭킹 3팀은 " + this.soccerTeam + "입니다.");
	}
	
	public void bundesTeamColorMethod() {
		System.out.println(this.soccerTeam + "구단의 각각 순서대로 상징하는 색은 " + this.typicalColor + "입니다.");
	}
}

class FranceLeauge implements SoccerLeague{
	String soccerTeam;
	String typicalColor;
	
	public FranceLeauge(String soccerTeam, String typicalColor) {
		this.soccerTeam = soccerTeam;
		this.typicalColor = typicalColor;
	}
	
	@Override
	public void topThreeTeamMethod() {
		System.out.println("현재 (10/09)일 기준 프랑스 리그앙 리그에서 상위 랭킹 3팀은 " + this.soccerTeam + "입니다.");
	}
	
	public void franceLeagueTeamColorMethod(){
		System.out.println(this.soccerTeam + "구단의 각각 순서대로 상징하는 색은 " + this.typicalColor + "입니다.");
	}
}

public class SoccerLeaugeRankPractice {

	public static void main(String[] args) {
		SoccerLeague sl = new PremierLeague("토트넘, 아스날, 맨시티", "흰/남색, 흰/빨강색, 하늘색");
		sl.topThreeTeamMethod();
		
		PremierLeague pl = (PremierLeague) sl;
		pl.plTeamColorMethod();
		
		System.out.println();
		
		sl = new Bundesliga("레버쿠젠, 슈투트가르트, 바이에른 뮌헨", "빨강색, 빨강색, 빨강색");
		sl.topThreeTeamMethod();
		
		Bundesliga bl = (Bundesliga) sl;
		bl.bundesTeamColorMethod();
		
		System.out.println();
		
		
		sl = new FranceLeauge("모나코, 니스, PSG", "흰/빨강색, 빨/검정색, 파랑색");
		sl.topThreeTeamMethod();
		
		FranceLeauge fl = (FranceLeauge)sl;
		fl.franceLeagueTeamColorMethod();
		

	}

}
