package myPhonePlaylist;

class Ballad{
	String mondayKids;
	String mcTheMax;
	String buzz;
	
	public Ballad(String mondayKids, String mcTheMax, String buzz) {
		this.mondayKids = mondayKids;
		this.mcTheMax = mcTheMax;
		this.buzz = buzz;
	}
	
	public void balladSingerMethod() {
		System.out.println("한국에서 대표적인 발라드 가수로는 " + this.mondayKids + ", " + this.mcTheMax + ", " + this.buzz + "등이 있다.");
	}
	
	public void balladElbumMethod() {
		System.out.println(this.mondayKids + "의 대표적인 곡 하나를 꼽자면 사랑이 식었다고 말해도돼 라는 노래가 있다.");
		System.out.println(this.mcTheMax + "의 대표적인 곡 하나를 꼽자면 어디에도 라는 노래가 있다.");
		System.out.println(this.buzz + "의 대표적인 곡 하나를 꼽자면 가시 라는 노래가 있다.");
	}
}

class Dance{
	String ive;
	String newJeans;
	String seventeen;
	
	public Dance(String ive, String newJeans, String seventeen) {
		this.ive = ive;
		this.newJeans = newJeans;
		this.seventeen = seventeen;
	}
	
	public void danceSingerMethod() {
		System.out.println("한국 댄스 가수 중 대표적으로 가수를 뽑자면 " + this.ive + ", " + this.newJeans + ", " + this.seventeen + "등이 있다.");
	}
	
	public void danceRecentlyElbumMethod() {
		System.out.println(this.ive + "의 가장 최신앨범이라 함은 최근 발매한 I WANT 라는 노래가 있다.");
		System.out.println(this.newJeans + "가 낸 가장 최신앨범은 ETA 라는 노래가 있다.");
		System.out.println(this.seventeen + "이라는 가수가 낸 가장 최신앨범은 손오공 이라는 노래가 있다.");
	}
}

public class MyPhonePlaylist {

	public static void main(String[] args) {
		Ballad ballad = new Ballad("먼데이키즈", "엠씨더맥스", "버즈");
		ballad.balladSingerMethod();
		ballad.balladElbumMethod();
		
		System.out.println();
		
		Dance dance = new Dance("아이브", "뉴진스", "세븐틴");
		dance.danceSingerMethod();
		dance.danceRecentlyElbumMethod();

	}

}
