package kiosque12;
import java.util.Scanner;

public class Kiosque12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("안녕하세요!! DMK 사이트입니다.");
		System.out.print("개발툴을 사용하시겠습니까?(네/아니오) : ");
		
		String yesorno = scanner.next();
		
		if(yesorno.equals("네")) {
			System.out.print("1. 이클립스 2. Spring STS 3. intelij 4. Visual Studio 중 원하시는 개발툴의 번호를 눌러주세요 : ");
			int developTool = scanner.nextInt();
			
			if(developTool == 1) {
				System.out.println("이클립스 개발툴을 선택하셨습니다. 이클립스 개발 툴은 주로 자바라는 언어를 사용할 때 사용합니다.");
				System.out.println("이클립스는 또한 무료이기 때문에 언제든지 웹사이트에서 다운을 받을 수 있습니다.");
			}else if(developTool == 2) {
				System.out.println("Spring STS 툴을 선택하셨습니다. Spring은 웹사이트를 개발할 때 필요한 개발 툴이라고 생각하시면 됩니다.");
				System.out.println("Spring STS 툴은 무료이긴 하지만 단점이 정말 많은 설정을 손수 본인이 수동으로 해야합니다.");
			}else if(developTool == 3) {
				System.out.println("intelij 툴을 선택하셨습니다. intelij는 유료입니다.");
				System.out.println("intelij는 Spring STS툴의 업그레이드 버전으로 이것은 유료툴이기에 Spring에서처럼 설정을 일일히 해줄 필요가 없고 거의 모든 것이 자동으로 툴 안에 들어가 있습니다.");
				System.out.println("유료이기 때문에 월 단위 혹은 연도 단위로 결제를 해야 이용하실 수 있습니다.");
				System.out.print("달, 연도 중 어느 단위별로 결제를 진행하시겠습니까? (달/연도) : ");
				
				String monthOrYear = scanner.next();
				
				if(monthOrYear.equals("달") || monthOrYear.equals("월")) {
					System.out.println("1개월 별로 2만원씩 구독하셔야 합니다.");
					System.out.println("처음 신규로 가입하신 고객님께서는 1개월 무료체험권이 주어집니다.");
					System.out.println("처음 가입하셨기에 무료로 1개월동안 사용하실 수 있습니다.");
					System.out.println("다만 1개월이 지난 후에는 구독을 취소하는 버튼을 누르지 않았을 시 자동으로 청구됩니다.");
				}else if(monthOrYear.equals("연도") || monthOrYear.equals("년도") || monthOrYear.equals("년")) {
					System.out.println("12개월 1년 단위로 24만원씩 구독하셔야 합니다.");
					System.out.println("처음 신규로 가입하신 고객님께서는 1개월 무료체험권이 주어집니다.");
					System.out.println("처음 가입하셨기에 무료로 1개월동안 사용하실 수 있습니다.");
					System.out.println("다만 1개월이 지난 후에는 구독을 취소하는 버튼을 누르지 않았을 시 자동으로 청구됩니다.");
				}
			}else if(developTool == 4) {
				System.out.println("Visual Studio 툴을 선택하셨습니다. Visual Studio툴은 무료입니다.");
				System.out.println("이 툴은 개발자가 되기 위해서 가장 처음으로 마주하는 툴 입니다.");
				System.out.println("C언어 C++ 등을 공부하고 사용할 때 쓰는 툴입니다.");
			}
		}else if(yesorno.equals("아니오")) {
			System.out.println("개발툴을 선택하셔야 개발에 대한 툴을 이용하실 수 있습니다.");
		}
		

	}

}
