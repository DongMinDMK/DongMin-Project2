package middleSchoolEx;

interface MiddleSchool{
	public abstract void show();
}

class Subject implements MiddleSchool{
	String koreansLanguage;
	String english;
	String math;
	String science;
	
	public Subject(String koreansLangauge, String english, String math, String science) {
		this.koreansLanguage = koreansLangauge;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	@Override
	public void show() {
		System.out.println("중학교에서 배우는 가장 기본적인 과목은 " + this.koreansLanguage + ", " + this.english + ", " + this.math + ", 그리고 " + this.science + " 등을 배웁니다.");
	}
	
	public void subjectMethod() {
		System.out.println("중학생들은 시간표에 맞춰 각각의 과목들을 수강합니다.");
	}

}

class Student implements MiddleSchool{
	String age;
	String name;
	String gender;
	
	public Student(String age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public void show() {
		System.out.println("한국 중학생들의 나이는 " + this.age + "세가 대부분입니다.");
	}
	
	public void studentMethod() {
		System.out.println("중학생 시절 내 이름은 " + this.name + "이였고, 성별은 " + this.gender + "이였다.");
	}
	
	public void student2Method() {
		System.out.println("중학생 때 나는 예의가 바른 중학생이였고, 선생님께 인사를 잘 드리는 학생이였다.");
	}

}

public class MiddleSchoolEx {

	public static void main(String[] args) {
		
		MiddleSchool ms = new Subject("국어", "영어", "수학", "과학");
		ms.show();
		
		Subject subject = (Subject)ms;
		subject.subjectMethod();
		
		System.out.println();
		
		ms = new Student("14~17", "김동민", "남");
		ms.show();
		
		Student student = (Student) ms;
		student.studentMethod();
		student.student2Method();
		

	}

}
