package kiosque3;

import java.util.Scanner;

public class Kiosque3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money = 0;
		while(true) {
		System.out.println("한사람당 한 메뉴만 주문하실 수 있습니다.");
		System.out.print("안녕하세요 DMK 국밥집입니다. 주문하시겠습니까? (네/아니오) : ");
		String yesorno = scanner.next();
		
		
			if(yesorno.equals("네")) {
				System.out.print("1. 수육국밥 2. 순대국밥 3. 한우국밥 중 원하시는 음식의 번호를 눌러주세요 : ");
				int riceSelect = scanner.nextInt();
				
				switch(riceSelect) {
				case 1:
					System.out.println("수육국밥을 선택하셨습니다.");
					System.out.print("해당 메뉴는 곱빼기를 추가하실 수 있습니다. 곱빼기를 추가하시겠습니까? (네/아니오) : ");
					String riceSize = scanner.next();
					
					if(riceSize.equals("네")) {
						System.out.println("수육국밥의 곱빼기 가격은 9000원입니다.");
						money += 9000;
						break;
					}else {
						System.out.println("수육국밥의 일반 가격은 7000원입니다.");
						money += 7000;
						break;
					}
				case 2:
					System.out.println("순대국밥을 선택하셨습니다.");
					System.out.print("해당 메뉴는 곱빼기를 추가하실 수 있습니다. 곱빼기를 추가하시겠습니까? (네/아니오) : ");
					String riceSize1 = scanner.next();
					
					if(riceSize1.equals("네")) {
						System.out.println("순대국밥의 곱빼기 가격은 10000원입니다.");
						money += 10000;
						break;
					}else {
						System.out.println("순대국밥의 일반 가격은 8500원입니다.");
						money += 8500;
						break;
					}
				case 3:
					System.out.println("한우국밥을 선택하셨습니다.");
					System.out.print("해당 메뉴는 곱빼기를 추가하실 수 있습니다. 곱빼기를 추가하시겠습니까? (네/아니오) : ");
					String riceSize2 = scanner.next();
					
					if(riceSize2.equals("네")) {
						System.out.println("한우국밥의 곱빼기 가격은 12000원입니다.");
						money += 12000;
						break;
					}else {
						System.out.println("순대국밥의 일반 가격은 9500원입니다.");
						money += 9500;
						break;
					}
				}
				break;
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용해 주시기 바랍니다.");
				
			}
		}
		
		System.out.println("현재 주문하신 음식의 총 금액은 " + money + "원 입니다.");
		System.out.print("결제하시겠습니까? (네/아니오) : ");
		String payYesorno = scanner.next();
		
		if(payYesorno.equals("네")) {
			System.out.print("지불하실 금액을 입력해주세요 : ");
			int userPay = scanner.nextInt();
			
			if(userPay > money) {
				System.out.println("거스름돈 " + (userPay - money) + "원을 반환해드리겠습니다.");
				System.out.println("이용해주셔서 감사합니다.");
			}else if(userPay < money) {
				System.out.println("잔액이 부족해 결제를 진행하실 수 없습니다.");
				
			}else {
				System.out.println("딱 맞게 요금을 지불해주셨군요!!");
				System.out.println("이용해주셔서 감사합니다.");
			}
			
		}
		
		
	}

}
