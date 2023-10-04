package speakerPractice;

class Speaker{
	String name;
	int cost;
	
	public Speaker(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}

class Person {
	Speaker speaker; //Speaker 클래스를 자료형으로 해서 접근
	
	public Person(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void turnOn() {
		System.out.println(speaker.getName() + "이 켜졌습니다."); //멤버 변수를 통한 호출
	}
	
	public void speakerCostMethod() {
		System.out.println(speaker.getName() + "의 가격은 " + speaker.getCost() + "원 입니다.");
	}
}


public class SpeakerPractice {

	public static void main(String[] args) {
		Speaker s1 = new Speaker("빨간 스피커", 10000);
		Person p1 = new Person(s1);
		p1.turnOn();
		p1.speakerCostMethod();
		
		Speaker s2 = new Speaker("파란 스피커", 20000);
		Person p2 = new Person(s2);
		p2.turnOn();
		p2.speakerCostMethod();

	}

}
