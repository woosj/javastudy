package javaDay21;

//스레드 클래스 선언
class ThreadEx2 extends Thread {
	//스레드 클래스를 상속받아서 구현
	//추상 클래스로 정의되어 있는 run메서드를 반드시 구현, 스레드가 시작될때 호출되는 메서드임
	
	@Override
	public void run() {
		// run메서드를 오버라이딩 하여 실행 구현
		try {
			//스레드 객체생성
			for(int i = 0; i < 5; i++){
				Thread.sleep(1000);
				System.out.println(i + "번 스레드");
				//main 메서드에서 i값을 출력
			}
			
		} catch (InterruptedException e) {
			//예기치 못한 상황에 대한 예외처리
			e.printStackTrace();			
		}
		
	}
	
}

public class ThreadEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//스레드 객체생성
			ThreadEx2 tt = new ThreadEx2();
			
			tt.start();
			
			for(int i = 0; i < 5; i++){
				Thread.sleep(1000);
				System.out.println(i + "번 main 스레드");
				//main 메서드에서 i값을 출력
			}
			
		} catch (InterruptedException e) {
			//예기치 못한 상황에 대한 예외처리
			e.printStackTrace();			
		}
	}

}
