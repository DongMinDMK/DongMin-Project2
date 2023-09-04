package kiosque2;

import java.util.Scanner;

public class Kiosque2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int breadMoney = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 빵집입니다.");
			System.out.print("저희 매점에는 정말 다양한 빵들이 준비되어 있습니다. 주문하시겠습니까? (네/아니오/총 금액) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.print("1. 크림빵 2. 단팥빵 3. 피자빵 4. 식빵 5. 맘모스빵 6. 마늘빵 중 원하시는 빵의 번호를 눌러서 추가해주세요 ! ");
				int breadSelect = scanner.nextInt();
				
				switch(breadSelect) {
				case 1:
					System.out.println("크림빵을 선택하셨습니다.");
					System.out.println("크림빵은 말 그대로 빵에 크림이 들어가 있는 맛있는 빵입니다.");
					System.out.print("크림빵의 빵 사이즈를 골라주세요(S/M/L) : ");
					String breadSize = scanner.next();
					
					if(breadSize.equals("S") || breadSize.equals("s")) {
						System.out.println("크림빵의 S 사이즈의 가격은 1500원입니다.");
						breadMoney += 1500;
					}else if(breadSize.equals("M") || breadSize.equals("m")) {
						System.out.println("크림빵의 M 사이즈의 가격은 2500원입니다.");
						breadMoney += 2500;
					}else {
						System.out.println("크림빵의 L 사이즈의 가격은 3500원입니다.");
						breadMoney += 3500;
					}
					break;
				case 2:
					System.out.println("단팥빵을 선택하셨습니다.");
					System.out.println("단팥빵은 말 그대로 빵에 달콤한 단팥이 들어가 있는 맛있는 빵입니다.");
					System.out.print("단팥빵의 빵 사이즈를 골라주세요(S/M/L) : ");
					String breadSize1 = scanner.next();
					
					if(breadSize1.equals("S") || breadSize1.equals("s")) {
						System.out.println("단팥빵의 S 사이즈의 가격은 2000원입니다.");
						breadMoney += 2000;
					}else if(breadSize1.equals("M") || breadSize1.equals("m")) {
						System.out.println("단팥빵의 M 사이즈의 가격은 3000원입니다.");
						breadMoney += 3000;
					}else {
						System.out.println("단팥빵의 L 사이즈의 가격은 4000원입니다.");
						breadMoney += 4000;
					}
					break;
				case 3:
					System.out.println("피자빵을 선택하셨습니다.");
					System.out.println("피자빵은 말 그대로 빵에 피자맛이 들어가 있는 맛있는 빵입니다.");
					System.out.print("피자빵의 빵 사이즈를 골라주세요(S/M/L) : ");
					String breadSize2 = scanner.next();
					
					if(breadSize2.equals("S") || breadSize2.equals("s")) {
						System.out.println("피자빵의 S 사이즈의 가격은 3000원입니다.");
						breadMoney += 3000;
					}else if(breadSize2.equals("M") || breadSize2.equals("m")) {
						System.out.println("피자빵의 M 사이즈의 가격은 4000원입니다.");
						breadMoney += 4000;
					}else {
						System.out.println("피자빵의 L 사이즈의 가격은 5000원입니다.");
						breadMoney += 5000;
					}
					break;
				case 4:
					System.out.println("식빵을 선택하셨습니다.");
					System.out.println("식빵은 말 그대로 가장 기본적인 식빵이고, 식빵에 버터를 발라서 먹으면 정말 맛있습니다.");
					System.out.print("식빵의 빵 사이즈를 골라주세요(S/M/L) : ");
					String breadSize3 = scanner.next();
					
					if(breadSize3.equals("S") || breadSize3.equals("s")) {
						System.out.println("식빵의 S 사이즈의 가격은 1000원입니다.");
						breadMoney += 1000;
					}else if(breadSize3.equals("M") || breadSize3.equals("m")) {
						System.out.println("식빵의 M 사이즈의 가격은 2000원입니다.");
						breadMoney += 2000;
					}else {
						System.out.println("식빵의 L 사이즈의 가격은 3000원입니다.");
						breadMoney += 3000;
					}
					break;
				case 5:
					System.out.println("맘모스빵을 선택하셨습니다.");
					System.out.println("맘모스빵은 사람들이 정말 좋아하는 빵 중에 하나이며, 밤, 건포도, 앙금 등이 토핑되는 맛있는 빵입니다.");
					System.out.print("맘모스빵의 빵 사이즈를 골라주세요(S/M/L) : ");
					String breadSize4 = scanner.next();
					
					if(breadSize4.equals("S") || breadSize4.equals("s")) {
						System.out.println("맘모스빵의 S 사이즈의 가격은 5000원입니다.");
						breadMoney += 5000;
					}else if(breadSize4.equals("M") || breadSize4.equals("m")) {
						System.out.println("맘모스빵의 M 사이즈의 가격은 6000원입니다.");
						breadMoney += 6000;
					}else {
						System.out.println("맘모스빵의 L 사이즈의 가격은 7000원입니다.");
						breadMoney += 7000;
					}
					break;
				case 6:
					System.out.println("마늘빵을 선택하셨습니다.");
					System.out.println("마늘빵은 말 그대로 마늘과 빵이 합쳐져서 완전 매콥하진 않고 마늘향 소스를 뿌려서 마늘향이 나게 하는 빵입니다.");
					System.out.print("단팥빵의 빵 사이즈를 골라주세요(S/M/L) : ");
					String breadSize5 = scanner.next();
					
					if(breadSize5.equals("S") || breadSize5.equals("s")) {
						System.out.println("마늘빵의 S 사이즈의 가격은 4000원입니다.");
						breadMoney += 4000;
					}else if(breadSize5.equals("M") || breadSize5.equals("m")) {
						System.out.println("마늘빵의 M 사이즈의 가격은 5000원입니다.");
						breadMoney += 5000;
					}else {
						System.out.println("마늘빵의 L 사이즈의 가격은 6000원입니다.");
						breadMoney += 6000;
					}
					break;
				}
			}else if(order.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용해주세요 !! ");
				break;
			}else {
				System.out.println("현재 주문하신 빵의 총 금액은 " + breadMoney + "원입니다.");
				break;
			}
		}
		
		System.out.println("항상 저희 DMK 빵집을 이용해주셔서 감사합니다.");
	}

}
