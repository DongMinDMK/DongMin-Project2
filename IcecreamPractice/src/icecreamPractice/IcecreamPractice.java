package icecreamPractice;

interface Icecream_Bar{
	public abstract void barMethod();
}

interface Icecream_Con{
	public abstract void conMethod();
}


class BarIcecream implements Icecream_Bar{
	String wildbody;
	String screwbar;
	String babyboybar; //옥동자 아이스크림
	
	public BarIcecream(String wildbody, String screwbar, String babyboybar) {
		this.wildbody = wildbody;
		this.screwbar = screwbar;
		this.babyboybar = babyboybar;
	}

	@Override
	public void barMethod() {
		System.out.println("우리나라 대표적인 바 아이스크림 중에서는 " + this.wildbody + ", 와 " + this.screwbar + ", " + this.babyboybar + " 등이 있습니다.");
	}
	
	public void bar2Method() {
		System.out.println("이외에도 정말 다양한 바 아이스크림이 존재합니다.");
		System.out.println("제가 적은 대표적인 3개는 제가 제일 좋아하는 바 아이스크림 탑3입니다.");
	}

}

class ConIcecream implements Icecream_Con{
	String worldcon;
	String googoocon;
	String bravocon;
	
	public ConIcecream(String worldcon, String googoocon, String bravocon) {
		this.worldcon = worldcon;
		this.googoocon = googoocon;
		this.bravocon = bravocon;
	}

	@Override
	public void conMethod() {
		System.out.println("우리나라 대표적인 콘 아이스크림 중에서는 " + this.worldcon + ", " + this.googoocon + ", " + this.bravocon + "등 이 떠오릅니다.");
	}
	
	public void con2Method() {
		System.out.println("대부분 콘 아이스크림이 바 아이스크림보다 가격이 비쌉니다.");
	}
	
}
public class IcecreamPractice {

	public static void main(String[] args) {
		
		System.out.println("--------- 바 아이스크림 ----------");
		
		Icecream_Bar bar = new BarIcecream("와일드바디", "스크류바", "옥동자");
		bar.barMethod();
		
		BarIcecream barIcecream = (BarIcecream) bar;
		barIcecream.bar2Method();
		
		System.out.println("---------- 콘 아이스크림 ----------");
		
		Icecream_Con con = new ConIcecream("월드콘", "구구콘", "브라보콘");
		con.conMethod();
		
		ConIcecream conIcecream = (ConIcecream)con;
		conIcecream.con2Method();

	}

}
