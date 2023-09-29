package chuseokFoodPractice;

interface ChuseokFood{
	public abstract void introMethod();
}

class KoreaMeatball implements ChuseokFood{
	String meat;
	String egg;
	String salt;
	
	public KoreaMeatball(String meat, String egg, String salt) {
		this.meat = meat;
		this.egg = egg;
		this.salt = salt;
	}

	@Override
	public void introMethod() {
		System.out.println("추석 대표음식 중 동그랑땡의 레시피는 " + this.meat + ", " + this.egg + ", " + this.salt + " 등이 들어간다.");
	}
	
	public void koreaMeatBallMethod() {
		System.out.println("동그랑땡은 대표적으로 추석명절하면 떠오르는 음식이다.");
	}

}

class PumpkinJeon implements ChuseokFood{
	String onion;
	String pumpkin;
	String egg;
	
	public PumpkinJeon(String onion, String pumpkin, String egg) {
		this.onion = onion;
		this.pumpkin = pumpkin;
		this.egg = egg;
	}

	@Override
	public void introMethod() {
		System.out.println("추석 대표음식 중 호박전 레시피에는 대표적으로 " + this.onion + ", " + this.pumpkin + ", " + this.egg + "등이 들어가게 된다.");
	}
	
	public void pumpkinJeonMethod() {
		System.out.println("호박전은 대표적으로 추석명절하면 떠오르는 음식이다.");
	}
	
}

public class ChuseokFoodPractice {

	public static void main(String[] args) {
		System.out.println("추석명절 대표음식!!");
		System.out.println("추석명절 잘 보내세요!!");
		
		System.out.println("======= 동그랑땡 =======");
		
		ChuseokFood cf = new KoreaMeatball("고기", "계란", "소금");
		cf.introMethod();
		
		KoreaMeatball km = (KoreaMeatball) cf;
		km.koreaMeatBallMethod();
		
		System.out.println("======= 호박전 =======");
		
		cf = new PumpkinJeon("양파", "호박", "계란");
		cf.introMethod();
		
		PumpkinJeon pj = (PumpkinJeon) cf;
		pj.pumpkinJeonMethod();
	}

}
