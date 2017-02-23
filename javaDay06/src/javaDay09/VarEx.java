package javaDay09;

public class VarEx {
	/*
	 * JDK 5.0 이상에서 새롭게 탄생한 기능
	 * 이는 메서드 정의시 통일된 인자의 자료형에 '...'라고 명시하므로
	 * 이를 통해 메서드를 수행하는데 필요한 인자의 수를 유연하게 구현할 수 있음
	 * (내부적으로 배열화 작업을 자동으로 처리해 줌)
	 */
	
	public void argTest(String... n){
		for(int i=0; i < n.length; i++){
			System.out.println(n[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarEx v = new VarEx();
		
		v.argTest("Varee","Test");
		
	}

}
