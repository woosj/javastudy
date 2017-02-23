package javaDay21;

class Data {
	// 두 스레드가 공유할 수 있는 클래스 정의
	int m_iRandomNum = 0;

	// 두 스레드가 접근할 수 있는 필드 정의
	// 정의 된 필드 값을 설정하거나 읽어오는 메서드 정의

	public int getM_iRandomNum() {
		return m_iRandomNum;
		// 랜덤값을 리턴함
	}

	public void setM_iRandomNum() {
		// 랜덤으로 값을 설정
		this.m_iRandomNum = (int) (Math.random() * 1000);

	}
}// end of Data

class Thread_ex6 extends Thread {
	Data m_RandomNum;
	// 공유데이터를 스레드에 필드로 선언

	public Thread_ex6(Data RandomNUm, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		m_RandomNum = RandomNUm;

	}

	@Override
	public void run() {
		try {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(100);

				// Math 클래스의 random 메서드를 이용해서 난수를 생성
				m_RandomNum.setM_iRandomNum();

				System.out.println(getName() + " : " + m_RandomNum.getM_iRandomNum());

			}

		} catch (InterruptedException e) {
			// 예기치 못한 상황에 대한 예외처리
			e.printStackTrace();
		}
	}

}// end of Thread_ex6

class Thread_ex7 extends Thread {
	Data m_RandomNum;
	// 공유데이터를 스레드에 필드로 선언

	public Thread_ex7(Data RandomNUm, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		m_RandomNum = RandomNUm;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(100);

				// Math 클래스의 random 메서드를 이용해서 난수를 생성
				//m_RandomNum.setM_iRandomNum();

				System.out.println(getName() + " : " + m_RandomNum.getM_iRandomNum()+10);

			}

		} catch (InterruptedException e) {
			// 예기치 못한 상황에 대한 예외처리
			e.printStackTrace();
		}

	}

}// end of Thread_ex7

public class ThreadEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data RData = new Data();	//공유 변수를 위한 클래스 인스턴스 생성
		
		//두개의 스레드 생성
		Thread t1 = new Thread_ex6(RData, "생성자");
		Thread t2 = new Thread_ex7(RData, "소비자");
		
		//스레드 시작
		t1.start();
		t2.start();
	}

}
