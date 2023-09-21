package kiosque8;
import java.util.Scanner;

public class Kiosque8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		
		while(true) {
			System.out.print("안녕하세요 DMK 와플 입니다. 주문하시겠습니까?(네/아니오/계산) : ");
			String waffleOrder = scanner.next();
			
			if(waffleOrder.equals("네")) {
				System.out.print("1. 일반와플 2. 아이스크림 와플 3. 티라미수 와플 중 원하시는 와플의 번호를 눌러주세요 : ");
				int waffleSelect = scanner.nextInt();
				
				if(waffleSelect == 1) {
					System.out.print("일반와플은 1. 딸기와플 2. 바나나와플 3. 블루베리와플 4. 사과와플 중 원하시는 와플의 번호를 눌러주세요 : ");
					int nomalWaffleSelect = scanner.nextInt();
					
					if(nomalWaffleSelect == 1) {
						System.out.println("딸기와플을 선택하셨습니다. 딸기와플의 가격은 3000원입니다.");
						cost += 3000;
					}else if(nomalWaffleSelect == 2) {
						System.out.println("바나나와플을 선택하셨습니다. 딸기와플의 가격은 4000원입니다.");
						cost += 4000;
					}else if(nomalWaffleSelect == 3) {
						System.out.println("블루베리와플을 선택하셨습니다. 딸기와플의 가격은 2500원입니다.");
						cost += 2500;
					}else if(nomalWaffleSelect == 4) {
						System.out.println("사과와플을 선택하셨습니다. 딸기와플의 가격은 3000원입니다.");
						cost += 3000;
					}
				}else if(waffleSelect == 2) {
					System.out.print("아이스크림 와플은 1. 초코 아이스크림 와플 2. 딸기 아이스크림 와플 3. 초코/바닐라 아이스크림 와플 4. 바닐라 아이스크림 와플 중 원하시는 번호를 눌러주세요 : ");
					int icecreamWaffleSelect = scanner.nextInt();
					
					if(icecreamWaffleSelect == 1) {
						System.out.println("초코 아이스크림 와플을 선택하셨습니다.");
						System.out.println("초코 아이스크림 와플의 가격은 5000원입니다.");
						cost += 5000;
					}else if(icecreamWaffleSelect == 2) {
						System.out.println("딸기 아이스크림 와플을 선택하셨습니다.");
						System.out.println("딸기 아이스크림 와플의 가격은 4500원입니다.");
						cost += 4500;
					}else if(icecreamWaffleSelect == 3) {
						System.out.println("초코/바닐라 아이스크림 와플을 선택하셨습니다.");
						System.out.println("초코/바닐라 아이스크림 와플의 가격은 6000원입니다.");
						cost += 6000;
					}else if(icecreamWaffleSelect == 4) {
						System.out.println("바닐라 아이스크림 와플을 선택하셨습니다.");
						System.out.println("바닐라 아이스크림 와플의 가격은 5000원입니다.");
						cost += 5000;
					}
				}else if(waffleSelect == 3) {
					System.out.println("티라미수 와플을 선택하셨습니다.");
					System.out.println("티라미수 와플의 가격은 7000원입니다.");
					cost += 7000;
				}
			}else if(waffleOrder.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용해주세요.");
			}else if(waffleOrder.equals("계산")) {
				System.out.println("계산페이지로 이동합니다....");
				break;
			}
		}
		
		System.out.println("선택하신 와플의 총 금액은 " + cost + "원입니다.");
		System.out.println(cost + "원을 결제하시고 와플을 받아가시면 됩니다.");
		System.out.println("즐거운 시간 보내시기 바랍니다.");

	}

}
