package peoplePractice;

interface People{
	public abstract void peopleMethod();
}

class Chulsu implements People{
	String age;
	String name;
	String gender;
	String job;
	
	public Chulsu(String age, String name, String gender, String job) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.job = job;
	}

	@Override
	public void peopleMethod() {
		System.out.println(this.name + "라는 사람이 있습니다.");
	}
	
	public void chulsuMethod() {
		System.out.println(this.name + "의 나이는 " + this.age + "세 이고, 성별은 " + this.gender + "입니다.");
		System.out.println(this.name + "의 직업은 " + this.job + "입니다.");
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}

class Jisu implements People{
	String age;
	String name;
	String gender;
	String job;
	
	public Jisu(String age, String name, String gender, String job) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.job = job;
	}

	@Override
	public void peopleMethod() {
		System.out.println(this.name + "라는 사람이 있습니다.");
	}
	
	public void jisuMethod() {
		System.out.println(this.name + "의 나이는 " + this.age + "세 이고, 성별은 " + this.gender + "입니다.");
		System.out.println(this.name + "의 직업은 " + this.job + "입니다.");
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}

public class PeoplePractice {

	public static void main(String[] args) {
		People people = new Chulsu("30", "김철수", "남성", "축구선수");
		people.peopleMethod();
		
		Chulsu chulsu = (Chulsu) people;
		chulsu.chulsuMethod();
		
		System.out.println();
		
		chulsu.setName("DMK");
		chulsu.setAge("26");
		chulsu.setGender("남성");
		chulsu.setJob("개발자");
		
		System.out.println("DMK의 이름은? " + chulsu.getName());
		System.out.println("DMK의 나이는? " + chulsu.getAge());
		System.out.println("DMK의 성별은? " + chulsu.getGender());
		System.out.println("DMK의 직업은? " + chulsu.getJob());
		
		System.out.println();
		
		people = new Jisu("28", "황지수", "여성", "가수");
		people.peopleMethod();
		
		Jisu jisu = (Jisu) people;
		jisu.jisuMethod();
		
		System.out.println();
		
		jisu.setName("홍길동");
		jisu.setAge("40");
		jisu.setGender("남성");
		jisu.setJob("CEO");
		
		System.out.println("홍길동의 이름은? " + jisu.getName());
		System.out.println("홍길동의 나이는? " + jisu.getAge());
		System.out.println("홍길동의 성별은? " + jisu.getGender());
		System.out.println("홍길동의 직업은? " + jisu.getJob());
		
		
		
	}

}
