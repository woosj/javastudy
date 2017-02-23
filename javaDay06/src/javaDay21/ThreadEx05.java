package javaDay21;


class TheadEx5 extends Thread{
	
	int m_iRandomNum;
	
	public TheadEx5(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		
	}
	
	
	@Override
	public void run() {
		try {
			
			for(int i = 0; i < 5; i++){

				Thread.sleep(100);
				
				//Math 클래스의 random 메서드를 이용해서 난수를 생성
				m_iRandomNum = (int)(Math.random() * 1000);
				
				System.out.println(getName() + " : " + m_iRandomNum);
				
			}
			
		} catch (InterruptedException e) {
			//예기치 못한 상황에 대한 예외처리
			e.printStackTrace();			
		}
	}
}


public class ThreadEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheadEx5 ttt1 = new TheadEx5("ttt1");
		TheadEx5 ttt2 = new TheadEx5("ttt2");
		TheadEx5 ttt3 = new TheadEx5("ttt3");
		TheadEx5 ttt4 = new TheadEx5("ttt4");
		
		ttt1.start();
		ttt2.start();
		ttt3.start();
		ttt4.start();
	}

}
