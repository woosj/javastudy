package javaDay14;

public class ExceptionEx05 {
	int[] ss;
	
	public ExceptionEx05() {
		// TODO Auto-generated constructor stub
		ss = new int[3];	//멤버필드 초기화
		
	}	
	
	public void program(){
		for(int i = 0; i <= ss.length; i++){
			//ss[0] ss[1] ss[2]
			System.out.println("for문의 시작 " + i + "번째");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외처리 발생" + e);
				return;
			}finally {
				System.out.println("무조건 수행하는 곳");
			}
			
			System.out.println("for문의 끝 " + i + "번째");
		}//end of for
	}//end of program
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx05 ee = new ExceptionEx05();
		ee.program();
		System.out.println("끝");
	}

}
