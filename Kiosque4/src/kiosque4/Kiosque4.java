package kiosque4;

import java.util.Scanner;

public class Kiosque4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int pay = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 스터티카페입니다. 저희 카페는 당일권만 판매하고 있습니다.");
			System.out.println("저희 스터티 카페는 당일권 중에서 일반 스터디 개인 룸과 팀으로 같이 모여 회의를 진행할 수 있는 팀룸으로 구성되어 있습니다.");
			System.out.print("개인룸을 이용하시겠습니까? 팀룸을 이용하시겠습니까?(개인룸/팀룸) : ");
			String roomSelect = scanner.next();
			
			if(roomSelect.equals("개인룸")) {
				System.out.println("개인룸을 선택하셨습니다.");
				System.out.print("개인 룸은 1시간 1500원 2시간 3000원 3시간 4500원 5시간 6000원 10시간 10000원입니다. 원하시는 시간의 번호를 눌러주세요(1/2/3/5/10) : ");
				int indivRoomTime = scanner.nextInt();
				
				if(indivRoomTime == 1) {
					System.out.println("1시간을 선택하셨습니다.");
					System.out.println("1시간 당일 정액권 가격은 1500원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 1500;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(indivRoomTime == 2) {
					System.out.println("2시간을 선택하셨습니다.");
					System.out.println("2시간 당일 정액권 가격은 3000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 3000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(indivRoomTime == 3) {
					System.out.println("3시간을 선택하셨습니다.");
					System.out.println("3시간 당일 정액권 가격은 4500원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 4500;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(indivRoomTime == 5) {
					System.out.println("5시간을 선택하셨습니다.");
					System.out.println("5시간 당일 정액권 가격은 6000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 6000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(indivRoomTime == 10) {
					System.out.println("10시간을 선택하셨습니다.");
					System.out.println("10시간 당일 정액권 가격은 10000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 10000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}
			}else if(roomSelect.equals("팀룸")) {
				System.out.println("팀룸을 선택하셨습니다.");
				System.out.println("팀룸에는 칠판과 보드카, 빔프로젝트 등이 준비되어 있습니다.");
				System.out.print("팀룸은 1시간 5000원 2시간 10000원 3시간 15000원 4시간 20000원 5시간 25000원으로 구성되어 있습니다. 원하시는 시간이 무엇인가요? (1/2/3/4/5) : ");
				int teamRoomTime = scanner.nextInt();
				
				if(teamRoomTime == 1) {
					System.out.println("팀룸 1시간을 선택하셨습니다.");
					System.out.print("팀룸 1시간 당일 정액권은 5000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 5000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(teamRoomTime == 2) {
					System.out.println("팀룸 2시간을 선택하셨습니다.");
					System.out.print("팀룸 2시간 당일 정액권은 10000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 10000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(teamRoomTime == 3) {
					System.out.println("팀룸 3시간을 선택하셨습니다.");
					System.out.print("팀룸 3시간 당일 정액권은 15000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 15000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(teamRoomTime == 4) {
					System.out.println("팀룸 4시간을 선택하셨습니다.");
					System.out.print("팀룸 4시간 당일 정액권은 20000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 20000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}else if(teamRoomTime == 5) {
					System.out.println("팀룸 5시간을 선택하셨습니다.");
					System.out.print("팀룸 5시간 당일 정액권은 25000원입니다.");
					System.out.println("저희 스터디카페는 선불입니다.");
					pay = 25000;
					
					System.out.print("얼마를 지불하시겠습니까? ");
					int userPay = scanner.nextInt();
					
					if(pay <= userPay) {
						System.out.println("결제가 완료되었습니다. 즐거운 하루되세요");
						break;
					}else {
						System.out.println("요금이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}
			}
		}
		
		System.out.println("항상 저희 카페를 이용해주셔서 감사합니다.");

	}

}
