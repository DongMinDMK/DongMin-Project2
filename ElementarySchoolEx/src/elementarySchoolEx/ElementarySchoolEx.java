package elementarySchoolEx;

interface ElementarySchool{
	public abstract void show();
}

class Subject implements ElementarySchool{
	String math;
	String english;
	String pt;
	String science;
	
	public Subject(String math, String english, String pt, String science) {
		this.math = math;
		this.english = english;
		this.pt = pt;
		this.science = science;
	}

	@Override
	public void show() {
		System.out.println("초등학교에서는 수많은 과목으로 초등학생들을 교육을 진행을 합니다.");
	}
	
	public void eleMethod() {
		System.out.println(this.math + ", " + this.english + ", " + this.pt + ", " + this.science + " 등 과목들을 교육합니다.");
	}

}


class Person implements ElementarySchool{
	String teacher;
	String elementaryStudent;
	String principal;
	
	public Person(String teacher, String elementaryStudent, String principal) {
		this.teacher = teacher;
		this.elementaryStudent = elementaryStudent;
		this.principal = principal;
	}

	@Override
	public void show() {
		System.out.println("초등학교에는 " + this.elementaryStudent + ", " + this.teacher + ", " + this.principal + " 등이 있습니다.");
	}
	
	public void personMethod() {
		System.out.println("수많은 " + this.elementaryStudent + "들이 " + this.teacher + "밑에서 교육을 받고 미래에 대한 꿈을 키웁니다.");
	}

}

class Cafeteria implements ElementarySchool{
	String food;
	String foodMother;
	
	public Cafeteria(String food, String foodMother) {
		this.food = food;
		this.foodMother = foodMother;
	}

	@Override
	public void show() {
		System.out.println("초등학교에는 식당이 존재합니다. 식당에는 매번 달라지는 " + this.food + "들과 " + this.food + "을 학생들이 잘 먹을 수 있게 도와주는 " + this.foodMother + "들이 존재하십니다.");
	}
	
	
}


public class ElementarySchoolEx {

	public static void main(String[] args) {
		ElementarySchool es = new Subject("수학", "영어", "체육", "과학");
		es.show();
		Subject subject = (Subject) es;
		subject.eleMethod();
		
		es = new Person("선생님", "초등학생", "교장,교감 선생님");
		es.show();
		
		Person person = (Person) es;
		person.personMethod();
		
		es = new Cafeteria("음식", "음식아주머니");
		es.show();
	}

}
