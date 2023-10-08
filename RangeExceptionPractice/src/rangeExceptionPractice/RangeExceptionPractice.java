package rangeExceptionPractice;

import java.util.Scanner;

public class RangeExceptionPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		
		while(true) {
			try {
				System.out.print("숫자 0~100까지 중 아무 숫자나 입력해주세요 (0 ~ 100)[-1을 입력하면 종료] : ");
				value = scanner.nextInt();
				
				if(value == -1) {
					break;
				}
				
				if(value < 0 || value > 100) {
					throw new Exception("숫자 0~100까지 중 하나를 입력해주세요. 숫자 허용 범위가 아닙니다."); //근데 이렇게 예외 던지기를 main()메소드에 적는건 안좋음.
					// 클래스 안의 메소드 안에 예외처리를 하는 것이 좋음. main() 메소드는 메소드 호출하는 식으로만 하고 예외는 메소드에서만 하는 것이 좋음(예외처리나 예외던지기 둘다)
				}
			} catch (Exception e) {
				
				System.out.println("ERROR MESSAGE : " + e.getMessage());
			}
		}
		
		scanner.close();
		System.out.println("-1을 입력하셨습니다.");
		System.out.println("프로그램을 종료합니다.");

	}

}
