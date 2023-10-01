package conveinceStorePractice;
import java.util.Scanner;


public class ConveinceStorePractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.println("DMK 편의점입니다. 원하시는 상품을 골라서 카운터에서 계산 부탁드립니다.");
		
		while(true) {
			System.out.print("1. 주류 2. 과자 3. 김밥 4. 버거 중 원하시는 카테고리를 골라주세요(1/2/3/4) -> 계산을 하시려면 5번을 눌러주세요 : ");
			int userSelect = scanner.nextInt();
			
			if(userSelect == 1) {
				System.out.print("1. 이온음료 2. 탄산음료 3. 소주 4. 맥주 5. 에너지음료 중 원하시는 음료의 번호를 눌러주세요 : ");
				int drinkSelect = scanner.nextInt();
				
				if(drinkSelect == 1) {
					System.out.println("이온음료를 선택하셨습니다.");
					System.out.println("이온음료의 모든 가격은 1500원으로 저희 편의점은 통일하고 있습니다.");
					cost += 1500;
				}else if(drinkSelect == 2) {
					System.out.println("탄산음료를 선택하셨습니다.");
					System.out.println("탄산음료의 모든 가격은 1000원으로 저희 편의점은 통일하고 있습니다.");
					cost += 1000;
				}else if(drinkSelect == 3) {
					System.out.println("소주를 선택하셨습니다.");
					System.out.println("소주의 모든 가격은 4500원으로 저희 편의점은 통일하고 있습니다.");
					System.out.println("소주는 만 19세 이하는 판매불가입니다.");
					cost += 4500;
				}else if(drinkSelect == 4) {
					System.out.println("맥주를 선택하셨습니다.");
					System.out.println("맥주의 모든 가격은 4500원으로 저희 편의점은 통일하고 있습니다.");
					System.out.println("맥주는 만 19세 이하는 판매불가입니다.");
					cost += 4500;
				}else if(drinkSelect == 5) {
					System.out.println("에너지음료를 선택하셨습니다.");
					System.out.println("에너지음료의 모든 가격은 3500원으로 저희 편의점은 통일하고 있습니다.");
					System.out.println("에너지음료는 음료마다 가격이 다릅니다.");
					cost += 3500;
				}
			}else if(userSelect == 2) {
				System.out.print("1. 스윙칩 2. 썬칩 3. 포카칩 4. 오감자 5. 새우깡 중 원하시는 과자의 번호를 눌러주세요 : ");
				int snackSelect = scanner.nextInt();
				
				if(snackSelect == 1) {
					System.out.println("스윙칩을 선택하셨습니다.");
					System.out.println("스윙칩의 가격은 1300원입니다.");
					cost += 1300;
				}else if(snackSelect == 2) {
					System.out.println("썬칩을 선택하셨습니다.");
					System.out.println("썬칩의 가격은 1500원입니다.");
					cost += 1500;
				}else if(snackSelect == 3) {
					System.out.println("포카칩을 선택하셨습니다.");
					System.out.println("포카칩의 가격은 1500원입니다.");
					cost += 1500;
				}else if(snackSelect == 4) {
					System.out.println("오감자를 선택하셨습니다.");
					System.out.println("오감자의 가격은 1700원입니다.");
					cost += 1700;
				}else if(snackSelect == 5) {
					System.out.println("새우깡을 선택하셨습니다.");
					System.out.println("새우깡의 가격은 1700원입니다.");
					cost += 1700;
				}
			}else if(userSelect == 3) {
				System.out.print("1. 일반김밥 2. 참치김밥 3. 치즈김밥 중 원하시는 김밥의 번호를 눌러주세요 : ");
				int gimbapSelect = scanner.nextInt();
				
				if(gimbapSelect == 1) {
					System.out.println("일반김밥을 선택하셨습니다.");
					System.out.println("일반김밥의 가격은 2000원입니다.");
					cost += 2000;
				}else if(gimbapSelect == 2) {
					System.out.println("참치김밥을 선택하셨습니다.");
					System.out.println("참치김밥의 가격은 3500원입니다.");
					cost += 3500;
				}else if(gimbapSelect == 3) {
					System.out.println("치즈김밥을 선택하셨습니다.");
					System.out.println("치즈김밥의 가격은 3000원입니다.");
					cost += 3000;
				}
			}else if(userSelect == 4) {
				System.out.print("1. 데리버거 2. 치킨버거 3. 새우버거 중 원하시는 버거의 번호를 눌러주세요(저희 편의점은 버거 단품으로만 판매하고 있습니다.) : ");
				int burgerSelect = scanner.nextInt();
				
				if(burgerSelect == 1) {
					System.out.println("데리버거를 선택하셨습니다.");
					System.out.println("데리버거의 가격은 5000원입니다.");
					cost += 5000;
				}else if(burgerSelect == 2) {
					System.out.println("치킨버거를 선택하셨습니다.");
					System.out.println("치킨버거의 가격은 7000원입니다.");
					cost += 7000;
				}else if(burgerSelect == 3) {
					System.out.println("새우버거를 선택하셨습니다.");
					System.out.println("새우버거의 가격은 6000원입니다.");
					cost += 6000;
				}
			}else if(userSelect == 5) {
				System.out.println("현재 주문하신 상품의 총 가격은 " + cost + "원입니다.");
				System.out.print("결제를 진행하시겠습니까? (네/아니오) : ");
				String pay = scanner.next();
				
				if(pay.equals("네")) {
					System.out.print("지불하실 금액을 넣어주세요 : ");
					int userPay = scanner.nextInt();
					
					if(userPay > cost) {
						System.out.println("거스름돈 " + (userPay - cost) + "원을 반환해드리겠습니다.");
						System.out.println("잠시만 기다려주십시오.....");
						System.out.println("거스름돈이 반환이 되었습니다. 즐거운 시간 되세요..");
						break;
					}else if(userPay == cost) {
						System.out.println("결제가 완료되었습니다. 즐거운 시간 되세요 !!");
						break;
					}else {
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						System.out.println("돈을 더 투입하여 주십시오.");
						continue;
					}
				}
			}
			
		}
		
		
	}

}
