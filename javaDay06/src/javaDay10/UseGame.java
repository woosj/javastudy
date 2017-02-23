package javaDay10;

abstract class Unit {//추상클래스 선언
	int x,y;

	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
	
}//추상크래스 종료 end of unit

class Marine extends Unit {
	
	void stimPack(){
		System.out.println("마린이 스팀팩을 사용합니다.");
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("마린의 위치좌표 x:" + x + ", y:" + y + "입니다.");
		
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린이 대기실에 대기 상태에 있습니다.");
	}
	
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message : go go go go");
	}
	
}

class SiegeTank extends Unit {
		
	void changMode(){
		System.out.println("Yes Sir!!");
		
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("시저탱그의 위치좌표 x:" + x + ", y:" + y + "입니다.");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 대기 상태에 있습니다.");
	}
	
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message : Yes Sir!!");
	}
}

class Dropship extends Unit {
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Take it slow. Dropshop x:" + x + ", y:" + y + "입니다.");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("In the by by by by good~");
	}
	
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message : Can I take orders ");
	}
	
}

public class UseGame {
	public static void main(String[] args) {
		
		Unit[] ref = new Unit[3];
		
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
		
		for(int i = 0; i < ref.length; i++){
			System.out.println("==========================");
			
			ref[i].move(100, 200);
			ref[i].message();
			ref[i].stop();
			
			System.out.println("==========================");
		}
		
	}
}
