package kiosque11;
import java.util.Scanner;

public class Kiosque11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		System.out.println("안녕하세요 DMK 옷가게입니다. 저희 매장에 수많은 옷 종류들이 준비되어 있습니다.");
		while(true) {
			System.out.print("1. 맨투맨 2. 후드티 3. 와이셔츠 4. 니트티 5. 계산 중 원하시는 옷 종류의 번호를 눌러주세요 : ");
			int clothSelect = scanner.nextInt();
			
			if(clothSelect == 1) {
				System.out.println("맨투맨의 사이즈를 골라주세요");
				System.out.print("사이즈는 S, M, L, XL 가 준비되어 있습니다(S/M/L/XL) : ");
				String clothSizeSelect = scanner.next();
				
				if(clothSizeSelect.equals("S")) {
					System.out.println("맨투맨 S 사이즈를 선택하셨습니다.");
					System.out.println("S 사이즈의 가격은 50000원입니다.");
					cost += 50000;
				}else if(clothSizeSelect.equals("M")) {
					System.out.println("맨투맨 M 사이즈를 선택하셨습니다.");
					System.out.println("M 사이즈의 가격은 50000원입니다.");
					cost += 50000;
				}else if(clothSizeSelect.equals("L")) {
					System.out.println("맨투맨 L 사이즈를 선택하셨습니다.");
					System.out.println("L 사이즈의 가격은 50000원입니다.");
					cost += 50000;
				}else if(clothSizeSelect.equals("XL")) {
					System.out.println("맨투맨 XL 사이즈를 선택하셨습니다.");
					System.out.println("XL 사이즈의 가격은 50000원입니다.");
					cost += 50000;
				}
			}else if(clothSelect == 2) {
				System.out.println("후드티의 사이즈를 골라주세요");
				System.out.print("사이즈는 S, M, L, XL 가 준비되어 있습니다(S/M/L/XL) : ");
				String clothSizeSelect = scanner.next();
				
				if(clothSizeSelect.equals("S")) {
					System.out.println("후드티 S 사이즈를 선택하셨습니다.");
					System.out.println("S 사이즈의 가격은 80000원입니다.");
					cost += 80000;
				}else if(clothSizeSelect.equals("M")) {
					System.out.println("후드티 M 사이즈를 선택하셨습니다.");
					System.out.println("M 사이즈의 가격은 80000원입니다.");
					cost += 80000;
				}else if(clothSizeSelect.equals("L")) {
					System.out.println("후드티 L 사이즈를 선택하셨습니다.");
					System.out.println("L 사이즈의 가격은 80000원입니다.");
					cost += 80000;
				}else if(clothSizeSelect.equals("XL")) {
					System.out.println("후드티 XL 사이즈를 선택하셨습니다.");
					System.out.println("XL 사이즈의 가격은 80000원입니다.");
					cost += 80000;
				}
			}else if(clothSelect == 3) {
				System.out.println("와이셔츠 사이즈를 골라주세요");
				System.out.print("사이즈는 S, M, L, XL 가 준비되어 있습니다(S/M/L/XL) : ");
				String clothSizeSelect = scanner.next();
				
				if(clothSizeSelect.equals("S")) {
					System.out.println("와이셔츠 S 사이즈를 선택하셨습니다.");
					System.out.println("S 사이즈의 가격은 200000원입니다.");
					cost += 200000;
				}else if(clothSizeSelect.equals("M")) {
					System.out.println("와이셔츠 M 사이즈를 선택하셨습니다.");
					System.out.println("M 사이즈의 가격은 200000원입니다.");
					cost += 200000;
				}else if(clothSizeSelect.equals("L")) {
					System.out.println("와이셔츠 L 사이즈를 선택하셨습니다.");
					System.out.println("L 사이즈의 가격은 200000원입니다.");
					cost += 200000;
				}else if(clothSizeSelect.equals("XL")) {
					System.out.println("와이셔츠 XL 사이즈를 선택하셨습니다.");
					System.out.println("XL 사이즈의 가격은 200000원입니다.");
					cost += 200000;
				}
			}else if(clothSelect == 4) {
				System.out.println("니트티의 사이즈를 골라주세요");
				System.out.print("사이즈는 S, M, L, XL 가 준비되어 있습니다(S/M/L/XL) : ");
				String clothSizeSelect = scanner.next();
				
				if(clothSizeSelect.equals("S")) {
					System.out.println("니트티 S 사이즈를 선택하셨습니다.");
					System.out.println("S 사이즈의 가격은 100000원입니다.");
					cost += 100000;
				}else if(clothSizeSelect.equals("M")) {
					System.out.println("니트티 M 사이즈를 선택하셨습니다.");
					System.out.println("M 사이즈의 가격은 100000원입니다.");
					cost += 100000;
				}else if(clothSizeSelect.equals("L")) {
					System.out.println("니트티 L 사이즈를 선택하셨습니다.");
					System.out.println("L 사이즈의 가격은 100000원입니다.");
					cost += 100000;
				}else if(clothSizeSelect.equals("XL")) {
					System.out.println("니트티 XL 사이즈를 선택하셨습니다.");
					System.out.println("XL 사이즈의 가격은 100000원입니다.");
					cost += 100000;
				}
			}else if(clothSelect == 5) {
				System.out.println("총 현재 나오신 금액은 " + cost + "원입니다.");
				
				System.out.print("얼마를 내시겠습니까? ");
				int userCost = scanner.nextInt();
				
				if(userCost > cost) {
					System.out.println("거스름돈 " + (userCost - cost) + "원을 반환해드렸습니다.");
					System.out.println("즐거운 시간되세요!!");
					break;
					
				}else if(userCost == cost) {
					System.out.println("결제되셨습니다. 즐거운 시간 되세요 !!");
					break;
				}else if(userCost < cost) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					continue;
				}
			}
		}
	}

}
