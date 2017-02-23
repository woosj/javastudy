package javaDay21;

//스레드 클래스 선언
class ThreadEx extends Thread {
	//스레드 클래스를 상속받아서 구현
	//추상 클래스로 정의되어 있는 run메서드를 반드시 구현, 스레드가 시작될때 호출되는 메서드임
	
	@Override
	public void run() {
		// run메서드를 오버라이딩 하여 실행 구현
		try {
			
			for(int i = 0; i < 20; i++){
				Thread.sleep(1000);
				System.out.println(i + "번:" + i + "*" + i + "=" + (i*i));
			}
			
		} catch (InterruptedException e) {
			//예기치 못한 상황에 대한 예외처리
			e.printStackTrace();			
		}
		
	}
	
}

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx th = new ThreadEx();
		ThreadEx th2 = new ThreadEx();
		th.start();
		th2.start();
		
	}

}
