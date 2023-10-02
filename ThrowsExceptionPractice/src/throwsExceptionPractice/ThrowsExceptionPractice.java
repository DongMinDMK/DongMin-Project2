package throwsExceptionPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionPractice {
	
	public static void checkMySelf(Scanner scanner) throws InputMismatchException{ //throws로 예외 던지기를 하는 이유는 메소드에서 예외를 각각 처리할 수는 있지만 각각 처리하면 코드가 길어지고 유지 보수 측면에서 효율성이 떨어지는 것을 대비해 메소드에는 왠만해선 예외 처리를 하지 않고 예외를 던지는 식으로 한다.
		System.out.println("1. 사람과 어울리는 것을 좋아한다. 2. 사람과 어울리는 것보다 혼자 있는 것을 좋아한다. ");
		System.out.print("둘 중에 자기 성격에 맞는 것의 번호를 골라주세요 : ");
		int yourSelect = scanner.nextInt();
		
		if(yourSelect == 1) {
			System.out.println("당신은 ENFP 유형에 가깝습니다.");
		}else {
			System.out.println("당신은 ISFP 유형에 가깝습니다.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("=========== 성격 검사를 실시합니다. =========");
			ThrowsExceptionPractice.checkMySelf(scanner); //메소드를 호출한 쪽에서 예외(try - catch 문 처리)를 하는 것이 더 효율적이다.
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다. 올바른 키보드를 입력해주세요.");
		}finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		
		System.out.println("성격 검사를 종료합니다.");
		
	}

}
