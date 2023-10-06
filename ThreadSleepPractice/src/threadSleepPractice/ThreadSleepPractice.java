package threadSleepPractice;

class TimeThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println("1초씩 올라갑니다 " + (i+1) + "/50초 .....");
			
			try {
				Thread.sleep(1000); //1000으로 지정하면 1초, 2000으로 지정하면 2초
			} catch (InterruptedException e) {
				System.out.println("에러 발생....");
			}
		}
	}
	
}

public class ThreadSleepPractice {
	public static void main(String[] args) {
		TimeThread th = new TimeThread();
		System.out.println("1초씩 올라가는 스레드 생성!");
		System.out.println();
		
		th.start();
	}

}
