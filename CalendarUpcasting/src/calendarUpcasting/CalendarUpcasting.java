package calendarUpcasting;

class Calendar{
	String color;
	int months;
	
	public Calendar(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	public void info() {
		System.out.println(this.color + " 달력은 " + this.months + "월까지 포함되어 있습니다.");
	}
	public void hanging() {
		System.out.println(this.color + " 달력을 벽에 걸 수 있습니다.");
	}
}

class DeskCalendar extends Calendar{
	public DeskCalendar(String color, int months) {
		super(color, months);
	}

	@Override
	public void hanging() {
		System.out.println(this.color + " 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	public void onTheDeskMethod() {
		System.out.println(this.color + " 달력을 책상에 배치할 수 있습니다.");
	}
	
	
}

public class CalendarUpcasting {

	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("검은색", 6);
		dc.info();
		dc.hanging(); //생성자에서 super로 인한 부모 클래스의 메소드를 호출한 것처럼 보이지만 오버라이딩이 걸려져 있기에 자식 메소드 hanging이 호출
		dc.onTheDeskMethod(); //이건 DeskCalendar 클래스에만 존재하는 유일 메소드
		
		System.out.println();
		
		Calendar c = new DeskCalendar("노랑색", 12); //자식클래스에서 부모 클래스로 강제 형변환을 시키는 업캐스팅
		c.info(); //부모 클래스의 info 메소드 호출
		c.hanging(); //부모클래스의 hanging을 호출하지만 자식에서 똑같은 메소드로 오버라이딩을 하기 때문에 자식 메소드 hanging 호출

	}

}
