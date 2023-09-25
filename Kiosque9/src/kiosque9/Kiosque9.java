package kiosque9;
import java.util.Scanner;

public class Kiosque9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int icecreamMoney = 0;
		
		
		while(true) {
			System.out.print("안녕하세요 DMK 아이스크림점입니다. 주문하시겠습니까? (네/아니오/계산) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.println("저희 매장은 무인으로 운영되는 매장이기에 키오스크로 주문하시면 되고, 저렴한 가격으로 아이스크림을 드리고 있습니다.");
				System.out.print("1. 바(막대) 2. 콘 중에 원하시는 아이스크림 종류를 골라주세요(1/2) : ");
				int conOrIcecreamSelect = scanner.nextInt();
				
				if(conOrIcecreamSelect == 1) {
					System.out.println("저희는 여러가지의 바(막대) 아이스크림을 판매하고 있습니다.");
					System.out.print("1. 메로나 2. 와일드바디 3. 스크류바 4. 옥동자 5.메가톤 중 원하시는 아이스크림의 번호를 눌러주세요 : ");
					
					int barIcecreamSelect = scanner.nextInt();
					
					if(barIcecreamSelect == 1) {
						System.out.println("메로나 아이스크림은 500원입니다.");
						icecreamMoney += 500;
					}else if(barIcecreamSelect == 2) {
						System.out.println("와일드바디 아이스크림은 600원입니다.");
						icecreamMoney += 600;
					}else if(barIcecreamSelect == 3) {
						System.out.println("스크류바 아이스크림은 600원입니다.");
						icecreamMoney += 500;
					}else if(barIcecreamSelect == 4) {
						System.out.println("옥동자 아이스크림은 600원입니다.");
						icecreamMoney += 500;
					}else if(barIcecreamSelect == 5) {
						System.out.println("메가톤 아이스크림은 600원입니다.");
						icecreamMoney += 600;
					}
				}else if(conOrIcecreamSelect == 2) {
					System.out.println("저희는 여러가지 콘 아이스크림을 판매하고 있습니다.");
					System.out.print("1. 구구콘 2. 월드콘 3. 브라보콘 4. 쿠엔트콘 중 원하시는 아이스크림의 번호를 눌러주세요 : ");
					int conIcecreamSelect = scanner.nextInt();
					
					if(conIcecreamSelect == 1) {
						System.out.println("구구콘 아이스크림은 1000원입니다.");
						icecreamMoney += 1000;
					}else if(conIcecreamSelect == 2) {
						System.out.println("월드콘 아이스크림은 1100원입니다.");
						icecreamMoney += 1100;
					}else if(conIcecreamSelect == 3) {
						System.out.println("브라보콘 아이스크림은 1000원입니다.");
						icecreamMoney += 1000;
					}else if(conIcecreamSelect == 4) {
						System.out.println("쿠엔트콘 아이스크림은 1100원입니다.");
						icecreamMoney += 1100;
					}
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("저희는 무인 아이스크림 매장이기 때문에 키오스크를 통해서만 주문을 진행하실 수 있습니다.");
				continue;
			}else if(yesorno.equals("계산")) {
				System.out.println("현재 나오신 금액 : " + icecreamMoney + "원");
				System.out.print("금액을 넣어주세요 : ");
				int userPay = scanner.nextInt();
				
				if(userPay >= icecreamMoney) {
					System.out.println("거스름돈 " + (userPay - icecreamMoney) + "원이 반환되었습니다.");
					System.out.println("(혹시라도 거스름돈이 반환이 안된다면 관리자에게 문의주세요. [관리자번호 : 010-0000-0000])");
					break;
				}else if(userPay < icecreamMoney) {
					System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다. 돈을 더 넣어주세요.");
					continue;
				}
			}
		}
		
		System.out.println("항상 저희 DMK 아이스크림 매장을 이용해주셔서 감사합니다.");
		System.out.println("즐거운 시간 되세요.");
	}

}
