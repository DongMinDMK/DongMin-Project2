package kiosque10;
import java.util.Scanner;

public class Kiosque10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 과자점 매장입니다. 원하시는 과자를 골라주세요. ");
			System.out.print("1. 스윙칩 2. 포카칩 3. 새우깡 4. 바나나킥 5. 썬칩 에서 원하시는 과자의 번호를 눌러주세요 : ");
			int snackSelect = scanner.nextInt();
			
			switch(snackSelect) {
			case 1:
				System.out.println("스윙칩의 가격은 1000원입니다.");
				cost += 1000;
				break;
			case 2:
				System.out.println("포카칩의 가격은 800원입니다.");
				cost += 800;
				break;
			case 3:
				System.out.println("새우깡의 가격은 800원입니다.");
				cost += 800;
				break;
			case 4:
				System.out.println("바나나킥의 가격은 900원입니다.");
				cost += 900;
				break;
			case 5:
				System.out.println("썬칩의 가격은 1000원입니다.");
				cost += 1000;
				break;
			}
		
			break;
		}
		
		
		System.out.println("주문하신 과자의 금액은 " + cost + "원입니다.");
		System.out.print("금액을 넣어주세요 : ");
		int userPay = scanner.nextInt();
		
		if(userPay > cost) {
			System.out.println("거스름돈 " + (userPay - cost) + "원이 반환되었습니다. 이용해주셔서 감사합니다.");
		}else if(userPay == cost) {
			System.out.println("결제가 완료되었습니다. 이용해주셔서 감사합니다.");
		}else {
			System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다. 돈을 더 넣어주세요..");
		}
		
	}

}
