package kiosque1;
import java.util.Scanner;

public class Kiosque1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money = 0;
		
		System.out.print("DMK 음식점입니다. 주문하시겠습니까? : (네/아니오) : ");
		String orderYesorNo = scanner.next();
		
		while(true) {
			if(orderYesorNo.equals("네")) {
				System.out.print("1. 면 2. 밥 3. 김밥 4. 총 금액 카테고리 중 숫자 하나를 선택해주세요 : ");
				int foodSelect = scanner.nextInt();
				
				if(foodSelect == 1) {
					System.out.print("1. 라면 2. 자장면 3. 짬뽕 4. 잔치국수 5. 비빔국수 중 하나를 골라주세요 : ");
					int noodleSelect = scanner.nextInt();
					
					if(noodleSelect == 1) {
						System.out.println("라면을 선택하셨습니다.");
						System.out.println("라면의 가격은 3000원입니다.");
						money += 3000;
					}else if(noodleSelect == 2) {
						System.out.println("자장면을 선택하셨습니다.");
						System.out.print("자장면은 일반과 곱빼기 중에서 선택하실 수 있습니다. 사이즈를 골라주세요(일반/곱빼기) : ");
						String noodleSize = scanner.next();
						
						if(noodleSize.equals("곱빼기")) {
							System.out.println("곱빼기는 1000원이 추가됩니다.");
							System.out.println("총 자장면 곱빼기 가격은 5000원입니다.");
							money += 5000;
						}else if(noodleSize.equals("일반")){
							System.out.println("자장면 일반 가격은 4000원입니다.");
							money += 4000;
						}
						
					}else if(noodleSelect == 3) {
						System.out.println("짬뽕을 선택하셨습니다.");
						System.out.print("짬뽕은 일반과 곱빼기 중에서 선택하실 수 있습니다. 사이즈를 골라주세요(일반/곱빼기) : ");
						String noodleSize = scanner.next();
						
						if(noodleSize.equals("곱빼기")) {
							System.out.println("곱빼기는 1000원이 추가됩니다.");
							System.out.println("총 짬뽕 곱빼기 가격은 6000원입니다.");
							money += 6000;
						}else if(noodleSize.equals("일반")){
							System.out.println("짬뽕 일반 가격은 5000원입니다.");
							money += 5000;
						}
						
					}else if(noodleSelect == 4) {
						System.out.println("잔치국수를 선택하셨습니다.");
						System.out.print("잔치국수는 일반과 곱빼기 중에서 선택하실 수 있습니다. 사이즈를 골라주세요(일반/곱빼기) : ");
						String noodleSize = scanner.next();
						
						if(noodleSize.equals("곱빼기")) {
							System.out.println("곱빼기는 1000원이 추가됩니다.");
							System.out.println("총 짬뽕 곱빼기 가격은 6000원입니다.");
							money += 6000;
						}else if(noodleSize.equals("일반")){
							System.out.println("잔치국수 일반 가격은 5000원입니다.");
							money += 5000;
						}
						
					}else if(noodleSelect == 5) {
						System.out.println("비빔국수를 선택하셨습니다.");
						System.out.print("비빔국수는 일반과 곱빼기 중에서 선택하실 수 있습니다. 사이즈를 골라주세요(일반/곱빼기) : ");
						String noodleSize = scanner.next();
						
						if(noodleSize.equals("곱빼기")) {
							System.out.println("곱빼기는 1000원이 추가됩니다.");
							System.out.println("총 비빔국수 곱빼기 가격은 7000원입니다.");
							money += 7000;
						}else if(noodleSize.equals("일반")){
							System.out.println("비빔국수 일반 가격은 6000원입니다.");
							money += 6000;
						}
						
					}
				}else if(foodSelect == 2) {
					System.out.print("1. 김치볶음밥 2. 비빔밥 3. 참치볶음밥 4. 제육덮밥 중 드실 음식의 번호를 눌러주세요 : ");
					int riceSelect = scanner.nextInt();
					
					if(riceSelect == 1) {
						System.out.println("김치볶음밥을 선택하셨습니다.");
						System.out.print("곱빼기를 추가할까요?(네/아니오) : ");
						String riceSize = scanner.next();
						
						if(riceSize.equals("네")) {
							System.out.println("김치볶음밥 곱빼기의 가격은 7000원입니다.");
							money += 7000;
						}else if(riceSize.equals("아니오")) {
							System.out.println("김치볶음밥 일반 가격은 6000원입니다.");
							money += 6000;
						}
					}else if(riceSelect == 2) {
						System.out.println("비빔밥을 선택하셨습니다.");
						System.out.print("곱빼기를 추가할까요?(네/아니오) : ");
						String riceSize = scanner.next();
						
						if(riceSize.equals("네")) {
							System.out.println("비빔밥 곱빼기의 가격은 6000원입니다.");
							money += 6000;
						}else if(riceSize.equals("아니오")) {
							System.out.println("비빔밥 일반 가격은 5000원입니다.");
							money += 5000;
						}
					}else if(riceSelect == 3) {
						System.out.println("참치볶음밥을 선택하셨습니다.");
						System.out.print("곱빼기를 추가할까요?(네/아니오) : ");
						String riceSize = scanner.next();
						
						if(riceSize.equals("네")) {
							System.out.println("참치볶음밥 곱빼기의 가격은 8000원입니다.");
							money += 8000;
						}else if(riceSize.equals("아니오")) {
							System.out.println("참치볶음밥 일반 가격은 7000원입니다.");
							money += 7000;
						}
					}else if(riceSelect == 4) {
						System.out.println("제육덮밥을 선택하셨습니다.");
						System.out.print("곱빼기를 추가할까요?(네/아니오) : ");
						String riceSize = scanner.next();
						
						if(riceSize.equals("네")) {
							System.out.println("제육덥밥 곱빼기의 가격은 9000원입니다.");
							money += 9000;
						}else if(riceSize.equals("아니오")) {
							System.out.println("제육덮밥 일반 가격은 8000원입니다.");
							money += 8000;
						}
					}
				}else if(foodSelect == 3) {
					System.out.print("1. 일반김밥 2. 참치김밥 3. 치즈김밥 4. 돈가스김밥 중 드실 음식의 번호를 입력해주세요 : ");
					int gimbapSelect = scanner.nextInt();
					
					if(gimbapSelect == 1) {
						System.out.println("일반김밥을 선택하셨습니다.");
						System.out.println("일반김밥의 가격은 1500원입니다.");
						money += 1500;
					}else if(gimbapSelect == 2) {
						System.out.println("참치김밥을 선택하셨습니다.");
						System.out.println("참치김밥의 가격은 3000원입니다.");
						money += 3000;
					}else if(gimbapSelect == 3) {
						System.out.println("치즈김밥을 선택하셨습니다.");
						System.out.println("치즈김밥의 가격은 3000원입니다.");
						money += 3000;
					}else if(gimbapSelect == 4) {
						System.out.println("돈가스김밥을 선택하셨습니다.");
						System.out.println("돈가스김밥의 가격은 4500원입니다.");
						money += 4500;
					}
				}else if(foodSelect == 4) {
					System.out.println("주문하신 음식의 총 금액은 " + money + "원입니다.");
					break;
				}
			}
		}
		
		System.out.println("항상 저희 DMK 음식점을 이용해주셔서 감사합니다.");
		
		

	}

}
