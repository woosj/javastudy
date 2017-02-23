package javaDay21;

class TheadEx3 extends Thread{
	
	public TheadEx3(String name) {
		
		super(name);//스레드 이름지정
		
	}
	
	@Override
	public void run() {
		try {
			
			for(int i = 0; i < 5; i++){
				Thread.sleep(1000);
				System.out.println(i + "번 " + getName() + ":스레드");
				//부모 클래스인 Thread 클래스의 getName() 메서드를 이용해서
				//슈퍼 메서드로 지정한 이름을 읽어옴
			}
			
		} catch (InterruptedException e) {
			//예기치 못한 상황에 대한 예외처리
			e.printStackTrace();			
		}
	}
}


public class ThreadEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheadEx3 th = new TheadEx3("hybrid");
		TheadEx3 th2 = new TheadEx3("dual");
		TheadEx3 th3 = new TheadEx3("qurd");
		
		//각각 다른 문자열을 넣어 스레드 객체 세개를 생성함
		//이때 주어진 이름을 스레드의 ID로 사용함
		th.start();
		th2.start();
		th3.start();
	}

}
