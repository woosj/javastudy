package javaDay10;

abstract class Diagram {//추상 클래스
	
	abstract void draw();	//추상메소드 반드시 하나는 존재해야함
	/*
	 * private 를 선언할 수 없다 
	 * 이유 : 자식이 오버라이딩 해야하는데 못하기 때문 
	 * 
	 * static 으로 선언할 수 없는 이유
	 * 객체 없이도 호출이 되는 메서드이므로 반드시 몸체가 정의되어야 
	 * 클래스.메서드() 형식으로 호출됨
	 *
	 */
	
}

class Triangle extends Diagram {
	//추상클래스를 상속받았을 경우 무조건 오버라이딩을 해야한다.
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다.");
		
	}
}

class Rectangle extends Diagram {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다.");
		
	}
}

class Circle extends Diagram {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다.");
		
	}
}

public class UseDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagram[] ref = new Diagram[3];
		ref[0] = new Triangle();
		ref[1] = new Rectangle();
		ref[2] = new Circle();
		
		for(int i = 0; i < ref.length; i++){
			ref[i].draw();
		}
	}

}
