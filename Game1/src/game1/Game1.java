package game1;

class Starcraft{
	String zerg;
	String protoss;
	String terran;
	
	public Starcraft(String zerg, String protoss, String terran) {
		this.zerg = zerg;
		this.protoss = protoss;
		this.terran = terran;
	}
	
	public void parentGameMethod() {
		System.out.println("스타크래프트라는 게임이 있는데 이 게임에 종족은 총 3가지가 있다.");
	}
	
	public void kindMethod() {
		System.out.println("3종족은 " + this.zerg + ", " + this.protoss + ", " + this.terran + "이 있다.");
	}
}

class Protoss extends Starcraft{
	String gillett;
	String dragon;
	String templer;
	
	public Protoss(String zerg, String protoss, String terran, String gillett, String dragon, String templer) {
		super(zerg, protoss, terran);
		this.gillett = gillett;
		this.dragon = dragon;
		this.templer = templer;
	}
	
	public void protossMethod() {
		super.parentGameMethod();
		super.kindMethod();
		
		System.out.println("프로토스 종족의 대표적인 유닛은 " + this.gillett + ", " + this.dragon + ", " + this.templer + " 등이 있다.");
	}

}

class Zerg extends Starcraft{
	String zergling;
	String hydra;
	String lurker;
	
	public Zerg(String zerg, String protoss, String terran, String zergling, String hydra, String lurker) {
		super(zerg, protoss, terran);
		this.zergling = zergling;
		this.hydra = hydra;
		this.lurker = lurker;
	}
	
	public void zergMethod() {
		super.parentGameMethod();
		super.kindMethod();
		
		System.out.println("저그 종족의 대표적인 유닛은 " + this.zergling + ", " + this.hydra + ", " + this.lurker + " 등이 있다.");
	}
}

class Terran extends Starcraft{
	String marin;
	String tank;
	String goliath;
	
	public Terran(String zerg, String protoss, String terran, String marin, String tank, String goliath) {
		super(zerg, protoss, terran);
		this.marin = marin;
		this.tank = tank;
		this.goliath = goliath;
	}
	
	public void terranMethod() {
		super.parentGameMethod();
		super.kindMethod();
		
		System.out.println("테란 종족의 대표적인 유닛은 " + this.marin + ", " + this.tank + ", " + this.goliath + " 등이 있다.");
	}
	
	
}

public class Game1 {

	public static void main(String[] args) {
		
		System.out.println("------------- 프로토스 ----------------");
		
		Protoss protoss = new Protoss("저그", "프로토스", "테란", "질럿", "드라군", "템플러");
		protoss.protossMethod();
		
		System.out.println("------------- 저그 ----------------");
		
		Zerg zerg = new Zerg("저그", "프로토스", "테란", "저글링", "히드라", "럴커");
		zerg.zergMethod();
		
		System.out.println("------------- 테란 ----------------");
		
		Terran terran = new Terran("저그", "프로토스", "테란", "테란", "탱크", "골리앗");
		terran.terranMethod();
		

	}

}
