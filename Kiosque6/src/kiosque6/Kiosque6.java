package kiosque6;
import java.util.Scanner;

public class Kiosque6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("환영합니다. DMK 빙수집입니다. 저희 매장에는 수많은 빙수를 판매하고 있습니다. 주문하시겠습니까?(네/아니오) : ");
		String order = scanner.next();
		
		if(order.equals("네")) {
			System.out.print("1. 망고빙수 2. 딸기빙수 3. 멜론빙수 4. 샤인머스캣빙수 중 드실 빙수를 선택해주세요(1/2/3/4) : ");
			int bingsuSelect = scanner.nextInt();
			
			if(bingsuSelect == 1) {
				System.out.println("망고빙수를 선택하셨습니다.");
				System.out.print("망고빙수의 가격은 13000원입니다. 휘핑크림을 올릴까요?(네/아니오) : ");
				String mangoCream = scanner.next();
				
				if(mangoCream.equals("네")) {
					System.out.println("망고빙수의 휘핑크림을 올리도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}else if(mangoCream.equals("아니오")) {
					System.out.println("망고빙수에 휘핑크림을 올리지 않도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}
			}else if(bingsuSelect == 2) {
				System.out.println("딸기빙수를 선택하셨습니다.");
				System.out.print("딸기빙수의 가격은 12000원입니다. 휘핑크림을 올릴까요?(네/아니오) : ");
				String strawbarryCream = scanner.next();
				
				if(strawbarryCream.equals("네")) {
					System.out.println("딸기빙수의 휘핑크림을 올리도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}else if(strawbarryCream.equals("아니오")) {
					System.out.println("딸기빙수에 휘핑크림을 올리지 않도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}
			}else if(bingsuSelect == 3) {
				System.out.println("멜론빙수를 선택하셨습니다.");
				System.out.print("멜론빙수의 가격은 12000원입니다. 휘핑크림을 올릴까요?(네/아니오) : ");
				String mellonCream = scanner.next();
				
				if(mellonCream.equals("네")) {
					System.out.println("멜론빙수의 휘핑크림을 올리도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}else if(mellonCream.equals("아니오")) {
					System.out.println("멜론빙수에 휘핑크림을 올리지 않도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}
			}else if(bingsuSelect == 4) {
				System.out.println("샤인머스캣빙수를 선택하셨습니다.");
				System.out.print("샤인머스캣빙수의 가격은 12000원입니다. 휘핑크림을 올릴까요?(네/아니오) : ");
				String shineMuscatCream = scanner.next();
				
				if(shineMuscatCream.equals("네")) {
					System.out.println("샤인머스캣빙수의 휘핑크림을 올리도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}else if(shineMuscatCream.equals("아니오")) {
					System.out.println("샤인머스캣빙수에 휘핑크림을 올리지 않도록 하겠습니다.");
					System.out.println("주문해주셔서 감사합니다. 빠르게 조리 후 대기번호를 통해 알려드리도록 하겠습니다.");
				}
			}
		}else if(order.equals("아니오")) {
			System.out.println("주문하실 때 앞의 키오스크를 이용해주세요 감사합니다.");
		}
	}

}
