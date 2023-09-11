package koreaSingerTitleElbum;

class KoreaSinger{
	String bts;
	String blackpink;
	String psy;
	
	public KoreaSinger(String bts, String blackpink, String psy) {
		this.bts = bts;
		this.blackpink = blackpink;
		this.psy = psy;
	}
	
	public void koreaFamousSingerMethod() {
		System.out.println("한국에는 K-POP을 홍보하는 대표적인, 상징적인 가수가 많다.");
		System.out.println(this.bts + ", " + this.blackpink + ", " + this.psy + "등이 한국의 문화를 알리는 대표적인 그룹이거나 솔로가수이다.");
		System.out.println("이외에도 다양한 많은 가수들이 자기만의 컨셉에 맞춰 한국 문화를 알리고있다.");
	}
}

class BTS extends KoreaSinger{
	String fakelove;
	String dynamite;
	String on;
	
	public BTS(String bts, String blackpink, String psy, String fakelove, String dynamite, String on) {
		super(bts, blackpink, psy);
		this.fakelove = fakelove;
		this.dynamite = dynamite;
		this.on = on;
	}
	
	public void btsElbumMethod() {
		System.out.println("BTS는 한국을 알리는 가장 대표적인 가수 중 한 그룹이며, 전세계 사람들 중 모르는 사람이 없을 정도이다.");
		System.out.println("BTS는 정말 다양한 앨범이 많은데 그 중 3개를 뽑자면 " + this.fakelove + ", " + this.dynamite + ", " + this.on + "등이 있다.");
		System.out.println("이외에도 정말 다양한 히트 앨범들이 많다.");
	}
}

class Blackpink extends KoreaSinger{
	String whistle;
	String lovesickGirls;
	String icecream;
	
	public Blackpink(String bts, String blackpink, String psy, String whistle, String lovesickGirls, String icecream) {
		super(bts, blackpink, psy);
		this.whistle = whistle;
		this.lovesickGirls = lovesickGirls;
		this.icecream = icecream;
	}
	
	public void blackpinkElbumMethod() {
		System.out.println("블랙핑크는 한국을 대표하는 걸그룹이다.");
		System.out.println("블랙핑크 역시 정말 많은 히트앨범들이 존재한다. 그 중 3개를 뽑자면 " + this.whistle + ", " + this.lovesickGirls + ", " + this.icecream + "등이 있다.");
	}
}

class PSY extends KoreaSinger{
	String gangnamStyle;
	String daddy;
	String thatThat;
	
	public PSY(String bts, String blackpink, String psy, String gangnamStyle, String daddy, String thatThat) {
		super(bts, blackpink, psy);
		this.gangnamStyle = gangnamStyle;
		this.daddy = daddy;
		this.thatThat = thatThat;
	}
	
	public void psyElbumMethod() {
		System.out.println("싸이는 한국을 대표하는 대표적인 솔로 가수이다.");
		System.out.println("싸이 노래는 정말 들으면 몸이 저절로 반응할 정도로 신나는 곡들이 많다.");
		System.out.println("그 중에 제일 유명하고 조회수를 40억회 가까이 기록한 전세계가 모르는 사람이 없을 정도로 유명한 " + this.gangnamStyle + "곡이 있고, ");
		System.out.println(this.daddy + "와, 가장 최근에 발매한 " + this.thatThat + "등이 있다.");
	}
}
public class KoreaSingerTitleElbum {

	public static void main(String[] args) {
		KoreaSinger ks = new KoreaSinger("방탄소년단", "블랙핑크", "싸이");
		ks.koreaFamousSingerMethod();
		
		System.out.println();
		
		BTS bts = new BTS("방탄소년단", "블랙핑크", "싸이", "FAKE LOVE", "Dynamite", "ON");
		bts.btsElbumMethod();
		
		System.out.println();
		
		Blackpink bp = new Blackpink("방탄소년단", "블랙핑크", "싸이", "휘파람", "Lovesick Girls", "Ice cream");
		bp.blackpinkElbumMethod();
		
		System.out.println();
		
		PSY psy = new PSY("방탄소년단", "블랙핑크", "싸이", "강남스타일", "DADDY", "That That");
		psy.psyElbumMethod();
	}

}
