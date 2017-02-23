package review;

public class RectangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음과 같은 멤버를 가지는 직사각형을 표현하는 Rectangle 클래스를 작성하라
		 * 1. int 타입의 x1,y2,x2,y2 필드 -> 사각형을 구성하는 두점의 좌표
		 * ( 단, 클래스내에서만 접근할 수 있음)
		 * 2. 생성자2개 : default 생성자( 좌표가 x1 = 1 ,y1 = 1 , x2 = 2 , y2 = 2 )
		 *    매개변수로 x1,y1,x2,y2의 값을 설정하는 생성자
		 * 3. void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 좌표 설정
		 * 4. int square() : 사각형의 넒이 리턴
		 * 5. void show() : 좌표와 넒이를 등, 직사각형의 정보를 출력하는 메소드
		 * 6. (추가문제) Static 변수 int 타입의 count를 추가, 생성자 호출시에
		 *    사각형이 몇번 만들어 졌는지 show()에서 출력 
		 */
		
		/*출력 결과

		r1의 정보
		사각형의 좌표 : (1,  1), (2, 2)
		사각형의 넒이 : 1
		사각형 만들어진 갯수 : 1

		r2의 정보
		사각형의 좌표 : (1,  1), (3, 3)
		사각형의 넒이 : 4
		사각형 만들어진 갯수 : 2

		변경된 r1의 정보
		사각형의 좌표 : (4,  4), (1, 1)
		사각형의 넒이 : 9
		사각형 만들어진 갯수 : 2*/

		 
		Rectangle r1 = new Rectangle(); // default 생성자
		System.out.println("r1의 정보");
		r1.show();

		Rectangle r2 = new Rectangle(1,1,3,3); // 매개변수 x1, y1, x2, y2		
		System.out.println("r2의 정보");
		r2.show();
		
		r1.set(4, 4, 1, 1);
		System.out.println("변경된 r1의 정보");
		r1.show();


	}

}
