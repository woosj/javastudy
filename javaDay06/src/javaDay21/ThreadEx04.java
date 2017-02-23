package javaDay21;

class TheadEx4 implements Runnable{
	
	@Override
	public void run() {
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


public class ThreadEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Runnable 인터페이스 인스턴스 생성
		TheadEx4 tt = new TheadEx4();
		
		//객체가 생성된 인터페이스를 Thread 클래스를 이용해서 다시 인스턴스를 생성한 다음 시작 메서드를 호출함
		Thread t = new Thread(tt);
		
		t.start();
		
	}

}
