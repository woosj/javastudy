package Chapter7.example;

/*
[7-18] 
	������ ���� �������� �򵵷� �ڵ带 �ϼ��Ͻÿ�.
	[Hint] instanceof�����ڸ� ����ؼ� ����ȯ�Ѵ�.
	�޼���� : action
	�� �� : �־��� ��ü�� �޼��带 ȣ���Ѵ�.
	DanceRobot�� ���, dance()�� ȣ���ϰ�,
	SingRobot�� ���, sing()�� ȣ���ϰ�,
	DrawRobot�� ���, draw()�� ȣ���Ѵ�.
	��ȯŸ�� : ����
	�Ű����� : Robot r - Robot�ν��Ͻ� �Ǵ� Robot�� �ڼ� �ν��Ͻ�

[������]
���� ��ϴ�.
�뷡�� �մϴ�.
�׸��� �׸��ϴ�.

*/
public class Exercise7_18 {

	/*
	 * (1) action�޼��带 �ۼ��Ͻÿ�.
	 */
	public static void action(Robot r){
		if( r instanceof DanceRobot ){
			
			((DanceRobot) r).dance();
			
		}
		
		if( r instanceof SingRobot ){
			
			((SingRobot) r).sing();;
			
		}

		if( r instanceof DrawRobot ){
			
			((DrawRobot) r).draw();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	}

}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
