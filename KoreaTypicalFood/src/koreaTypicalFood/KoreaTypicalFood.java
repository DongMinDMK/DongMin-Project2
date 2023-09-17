package koreaTypicalFood;

interface KoreaFood{
	public abstract void show();
}

class KimchiJjigae implements KoreaFood{
	String baechuKimchi;
	String dubu;
	String meat;
	
	public KimchiJjigae(String baechuKimchi, String dubu, String meat) {
		this.baechuKimchi = baechuKimchi;
		this.dubu = dubu;
		this.meat = meat;
	}

	@Override
	public void show() {
		System.out.println("한국의 대표적인 전통요리 중에 김치찌개가 있다.");
	}
	
	public void recipeMethod() {
		System.out.println("김치찌개의 레시피로는 " + this.baechuKimchi + ", " + this.dubu + ", " + this.meat + "등이 들어가는 음식이다.");
	}
	
}

class DoenjangJjigae implements KoreaFood{
	String doenjang;
	String dubu;
	String mushroom;
	
	public DoenjangJjigae(String doenjang, String dubu, String mushroom) {
		this.doenjang = doenjang;
		this.dubu = dubu;
		this.mushroom = mushroom;
	}

	@Override
	public void show() {
		System.out.println("한국의 대표적인 전통요리 중 된장찌개도 있다.");
	}
	
	public void recipeMethod() {
		System.out.println("된장찌개의 레시피로는 " + this.doenjang + ", " + this.dubu + ", " + this.mushroom + "등이 들어가는 음식이다.");
	}
}

public class KoreaTypicalFood {

	public static void main(String[] args) {
		KoreaFood koreaFood = new KimchiJjigae("배추김치", "두부", "고기");
		koreaFood.show();
		
		KimchiJjigae kj = (KimchiJjigae) koreaFood;
		kj.recipeMethod();
		
		System.out.println();
		
		koreaFood = new DoenjangJjigae("된장", "두부", "버섯");
		koreaFood.show();
		
		DoenjangJjigae dj = (DoenjangJjigae) koreaFood;
		dj.recipeMethod();
	}

}
