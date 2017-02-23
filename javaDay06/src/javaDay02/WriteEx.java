package javaDay02;

public class WriteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * write() : 화면 출력시 버퍼에 담음
		 * 
		 */
		System.out.write(65);
		
		//버퍼에 있는 것을 지워라
		//System.out.flush();
		
		System.out.println();	//한줄 띄어라
		
		
		byte[] by = { 'J', 'A', 'V', 'A' };
		System.out.write(by,0,4);
		//배열을 사용의 오토플래쉬 기능이 있음
		System.out.println();	//한줄 띄어라
		
	}

}
