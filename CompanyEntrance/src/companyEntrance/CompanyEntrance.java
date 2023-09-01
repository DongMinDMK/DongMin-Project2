package companyEntrance;

interface MeQialification{
	public abstract void explainMethod();
}

class License implements MeQialification{
	String computerLiteracy;
	String informationControl;
	String driverLicense;
	
	public License(String computerLiteracy, String informationControl, String driverLicense) {
		this.computerLiteracy = computerLiteracy;
		this.informationControl = informationControl;
		this.driverLicense = driverLicense;
	}

	@Override
	public void explainMethod() {
		System.out.println("내가 갖고있는 스펙중에서 자격증 란에는 " + this.computerLiteracy + " 자격증과, " + this.informationControl + "자격증, 그리고 " + this.driverLicense + " 자격증을 현재 취득한 상태이다.");
	}
	
	public void LicenseMethod() {
		System.out.println("추가적으로 나는 DB 관련 자격증을 취득할 예정이다.");
	}

}

class PrizeCareer implements MeQialification{
	String certificate;
	String prizeOfExcellenceInGrades;
	
	public PrizeCareer(String certificate, String prizeOfExcellenceInGrades) {
		this.certificate = certificate;
		this.prizeOfExcellenceInGrades = prizeOfExcellenceInGrades;
	}

	@Override
	public void explainMethod() {
		System.out.println("나의 수상경력은 현재 학원을 다니고 수료를 마쳤음을 알리는 " + this.certificate + "와, 거기서 우수한 성적을 거두어 " + this.prizeOfExcellenceInGrades + "을 수상했다.");
	}

}

class Portfolio implements MeQialification{
	String teamProject;
	String soloProject;
	String madeCafe;
	
	Portfolio(String teamProject, String soloProject, String madeCafe){
		this.teamProject = teamProject;
		this.soloProject = soloProject;
		this.madeCafe = madeCafe;
	}

	@Override
	public void explainMethod() {
		System.out.println("그리고 기업에 필요한 포트폴리오 몇몇개가 있는데 " + this.teamProject + "와, " + this.soloProject + ", 그리고 내가 운영하는 " + this.madeCafe + " 등이 있다.");
	}

}
public class CompanyEntrance {

	public static void main(String[] args) {
		MeQialification mq = new License("컴퓨터활용능력 1급", "정보처리기사", "운전면허증"); //강제 업캐스팅
		mq.explainMethod();
		
		License license = (License)mq; //강제 다운캐스팅 형변환
		license.LicenseMethod();
		
		System.out.println();
		
		mq = new PrizeCareer("수료증서", "성적우수상"); //강제 업캐스팅
		mq.explainMethod();
		
		System.out.println();
		
		mq = new Portfolio("팀프로젝트", "개인프로젝트", "카페");
		mq.explainMethod();
		
	}

}
