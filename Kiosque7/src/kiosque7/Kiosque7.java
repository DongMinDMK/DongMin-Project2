package kiosque7;
import java.util.Scanner;

public class Kiosque7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("안녕하세요 DMK PC방입니다. 저희 PC방은 선불요금제로 운영되고 있습니다.");
			System.out.print("1000원 1시간 30분 2000원 3시간 3000원 4시간 30분 5000원 7시간 10000원 10시간 20000원 20시간 중 원하시는 금액을 넣어주세요(1000/2000/3000/5000/10000/20000) : ");
			int timePay = scanner.nextInt();
			
			if(timePay == 1000) {
				System.out.println("1000원을 선택하셨습니다.");
				System.out.print("현금을 선택하시겠습니까? 카드를 선택하시겠습니까?(현금/카드) : ");
				String cashOrCard = scanner.next();
				
				if(cashOrCard.equals("현금")) {
					System.out.print("얼마를 내시겠습니까? : ");
					int userCost = scanner.nextInt();
					
					if(userCost > timePay) {
						System.out.println("거스름돈 " + (userCost - timePay) + "원이 반환됩니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else if(userCost == timePay) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else {
						System.out.println("돈이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(cashOrCard.equals("카드")) {
					System.out.println("결제가 완료되었습니다. 즐거운 시간 되세요.");
					break;
				}
				
			}else if(timePay == 2000) {
				System.out.println("2000원을 선택하셨습니다.");
				System.out.print("현금을 선택하시겠습니까? 카드를 선택하시겠습니까?(현금/카드) : ");
				String cashOrCard = scanner.next();
				
				if(cashOrCard.equals("현금")) {
					System.out.print("얼마를 내시겠습니까? : ");
					int userCost = scanner.nextInt();
					
					if(userCost > timePay) {
						System.out.println("거스름돈 " + (userCost - timePay) + "원이 반환됩니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else if(userCost == timePay) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else {
						System.out.println("돈이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(cashOrCard.equals("카드")) {
					System.out.println("결제가 완료되었습니다. 즐거운 시간 되세요.");
					break;
				}
			}else if(timePay == 3000) {
				System.out.println("3000원을 선택하셨습니다.");
				System.out.print("현금을 선택하시겠습니까? 카드를 선택하시겠습니까?(현금/카드) : ");
				String cashOrCard = scanner.next();
				
				if(cashOrCard.equals("현금")) {
					System.out.print("얼마를 내시겠습니까? : ");
					int userCost = scanner.nextInt();
					
					if(userCost > timePay) {
						System.out.println("거스름돈 " + (userCost - timePay) + "원이 반환됩니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else if(userCost == timePay) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else {
						System.out.println("돈이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(cashOrCard.equals("카드")) {
					System.out.println("결제가 완료되었습니다. 즐거운 시간 되세요.");
					break;
				}
			}else if(timePay == 5000) {
				System.out.println("5000원을 선택하셨습니다.");
				System.out.print("현금을 선택하시겠습니까? 카드를 선택하시겠습니까?(현금/카드) : ");
				String cashOrCard = scanner.next();
				
				if(cashOrCard.equals("현금")) {
					System.out.print("얼마를 내시겠습니까? : ");
					int userCost = scanner.nextInt();
					
					if(userCost > timePay) {
						System.out.println("거스름돈 " + (userCost - timePay) + "원이 반환됩니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else if(userCost == timePay) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else {
						System.out.println("돈이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(cashOrCard.equals("카드")) {
					System.out.println("결제가 완료되었습니다. 즐거운 시간 되세요.");
					break;
				}
			}else if(timePay == 10000) {
				System.out.println("10000원을 선택하셨습니다.");
				System.out.print("현금을 선택하시겠습니까? 카드를 선택하시겠습니까?(현금/카드) : ");
				String cashOrCard = scanner.next();
				
				if(cashOrCard.equals("현금")) {
					System.out.print("얼마를 내시겠습니까? : ");
					int userCost = scanner.nextInt();
					
					if(userCost > timePay) {
						System.out.println("거스름돈 " + (userCost - timePay) + "원이 반환됩니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else if(userCost == timePay) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else {
						System.out.println("돈이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(cashOrCard.equals("카드")) {
					System.out.println("결제가 완료되었습니다. 즐거운 시간 되세요.");
					break;
				}
			}else if(timePay == 20000) {
				System.out.println("20000원을 선택하셨습니다.");
				System.out.print("현금을 선택하시겠습니까? 카드를 선택하시겠습니까?(현금/카드) : ");
				String cashOrCard = scanner.next();
				
				if(cashOrCard.equals("현금")) {
					System.out.print("얼마를 내시겠습니까? : ");
					int userCost = scanner.nextInt();
					
					if(userCost > timePay) {
						System.out.println("거스름돈 " + (userCost - timePay) + "원이 반환됩니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else if(userCost == timePay) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("즐거운 시간 되십시오.");
						break;
					}else {
						System.out.println("돈이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(cashOrCard.equals("카드")) {
					System.out.println("결제가 완료되었습니다. 즐거운 시간 되세요.");
					break;
				}
			}
		}
		
		System.out.println("이용해주셔서 감사합니다.");
		
	}

}
