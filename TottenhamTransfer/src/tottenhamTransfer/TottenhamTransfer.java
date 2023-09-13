package tottenhamTransfer;

interface TOT{
	public abstract void abMethod();
}

class MaddisonClass implements TOT{
	String playerName;
	String playerPosition;
	String playerCountry;
	
	public MaddisonClass(String playerName, String playerPosition, String playerCountry) {
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		this.playerCountry = playerCountry;
	}

	@Override
	public void abMethod() {
		System.out.println("토트넘 구단에서 23-24시즌 여름 이적시장에서 영입한 선수 중 한명의 선수 이름은 " + this.playerName + "이다.");
	}
	
	public void maddisonMethod() {
		System.out.println(this.playerName + "선수의 국적은 " + this.playerCountry + "이고, 포지션은 " + this.playerPosition + "이다.");
		System.out.println(this.playerName + "선수는 패스를 정말 잘하는 창의적인 미드필더이다.");
	}
}

class VanDeVanClass implements TOT{
	String playerName;
	String playerPosition;
	String playerCountry;
	
	public VanDeVanClass(String playerName, String playerPosition, String playerCountry) {
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		this.playerCountry = playerCountry;
	}

	@Override
	public void abMethod() {
		System.out.println("마찬가지로 23-24시즌에 토트넘에서 영입한 선수 중 한명으로 선수 이름은 " + this.playerName + "이다.");
		System.out.println(this.playerName + "선수는 " + this.playerPosition + "포지션이고, 국적은 " + this.playerCountry + "이다.");
	}
	
	public void vanDeVanMethod() {
		System.out.println("키가 큰 선수임에도 불구하고 달리기가 빠르고 수비를 잘하는 선수입니다.");
	}
}

public class TottenhamTransfer {

	public static void main(String[] args) {
		TOT tot = new MaddisonClass("제임스 매디슨", "공격형 미드필더(CAM)", "잉글랜드");
		tot.abMethod();
		
		MaddisonClass maddisonClass = (MaddisonClass) tot;
		maddisonClass.maddisonMethod();
		
		System.out.println();
		
		tot = new VanDeVanClass("반더벤", "센터백(CB)", "네덜란드");
		tot.abMethod();
		
		VanDeVanClass vanDeVanClass = (VanDeVanClass) tot;
		vanDeVanClass.vanDeVanMethod();

	}

}
