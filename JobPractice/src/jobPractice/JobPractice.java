package jobPractice;

interface Job{
	public abstract void jobMethod();
}

class Developer implements Job{
	String frontEnd;
	String backEnd;
	String full_stack;
	
	public Developer(String frontEnd, String backEnd, String full_stack) {
		this.frontEnd = frontEnd;
		this.backEnd = backEnd;
		this.full_stack = full_stack;
	}

	@Override
	public void jobMethod() {
		System.out.println("우리나라에서 수많은 직업들 중 하나로 개발자 라는 직업이 있다.");
	}
	
	public void developerMethod() {
		System.out.println("개발자는 크게 " + this.frontEnd + ", " + this.backEnd + "그리고 " + this.full_stack + " 개발자로 구분할 수 있다.");
	}
}

class Doctor implements Job{
	String orthopedics; //정형외과
	String neurosurgery; //소아외과
	String pediatricSurgery; //소아외과
	
	public Doctor(String orthopedics, String neurosurgery, String pediatricSurgery) {
		this.orthopedics = orthopedics;
		this.neurosurgery = neurosurgery;
		this.pediatricSurgery = pediatricSurgery;
	}

	@Override
	public void jobMethod() {
		System.out.println("수많은 직업 중 의사는 건강에 있어서 제일 중요한 직업 중 하나이다.");
	}
	
	public void doctorMethod() {
		System.out.println("의사 내에서도 종류가 있는데 그 중에서 생각나는 3개의 과를 뽑으면 " + this.orthopedics + ", " + this.neurosurgery + ", " + this.pediatricSurgery + " 등이 있다.");
	}
}

public class JobPractice {

	public static void main(String[] args) {
		
		System.out.println("=============== 개발자 ================");
		
		Job job = new Developer("프론트엔드", "백엔드", "풀스택");
		
		job.jobMethod();
		
		Developer developer = (Developer) job;
		developer.developerMethod();
		
		System.out.println("=============== 의사 ================");
		
		
		job = new Doctor("정형외과", "신경외과", "소아외과");
		job.jobMethod();
		
		Doctor doctor = (Doctor) job;
		doctor.doctorMethod();

	}

}
