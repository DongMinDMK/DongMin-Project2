package kiosque5;
import java.util.Scanner;

public class Kiosque5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			System.out.print("환영합니다 DMK 한식집입니다. 주문하시겠습니까?(네/아니오/계산) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.print("1. 비빔밥 2. 제육덮밥 3. 오징어덮밥 중 원하시는 음식의 번호를 눌러주세요(1/2/3) : ");
				int koreaFood = scanner.nextInt();
				
				if(koreaFood == 1) {
					System.out.println("비빔밥을 선택하셨습니다.");
					System.out.print("곱빼기를 추가하실 수 있습니다. 추가하시겠습니까?(네/아니오) : ");
					String sizeup = scanner.next();
					
					if(sizeup.equals("네")) {
						System.out.println("곱빼기는 1000원이 추가됩니다.");
						System.out.println("따라서 비빔밥 곱빼기 가격은 10000원입니다.");
						cost += 10000;
					}else {
						System.out.println("비빔밥 일반 가격은 9000원입니다.");
						cost += 9000;
					}
				}else if(koreaFood == 2) {
					System.out.println("제육덮밥을 선택하셨습니다.");
					System.out.print("곱빼기를 추가하실 수 있습니다. 추가하시겠습니까?(네/아니오) : ");
					String sizeup = scanner.next();
					
					if(sizeup.equals("네")) {
						System.out.println("곱빼기는 1000원이 추가됩니다.");
						System.out.println("따라서 제육덮밥 곱빼기 가격은 12000원입니다.");
						cost += 12000;
					}else {
						System.out.println("제육덮밥 일반 가격은 11000원입니다.");
						cost += 11000;
					}
				}else if(koreaFood == 3) {
					System.out.println("오징어덮밥을 선택하셨습니다.");
					System.out.print("곱빼기를 추가하실 수 있습니다. 추가하시겠습니까?(네/아니오) : ");
					String sizeup = scanner.next();
					
					if(sizeup.equals("네")) {
						System.out.println("곱빼기는 1000원이 추가됩니다.");
						System.out.println("따라서 오징어덮밥 곱빼기 가격은 11000원입니다.");
						cost += 11000;
					}else {
						System.out.println("오징어덮밥 일반 가격은 10000원입니다.");
						cost += 10000;
					}
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문하실 때 알바생을 부르시거나 앞의 키오스크를 이용해주세요!");
			}else if(yesorno.equals("계산")) {
				System.out.println("총 금액은 " + cost + "원이 나오셨습니다.");
				System.out.println("저희 매장은 선불이기 때문에 결제를 먼저 진행하시고 음식이 나오면 받아가시면 됩니다.");
				System.out.println("항상 저희 매장을 이용해주셔서 감사합니다.");
				break;
			}
		}
	}

}
