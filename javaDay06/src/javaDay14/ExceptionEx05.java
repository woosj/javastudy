package javaDay14;

public class ExceptionEx05 {
	int[] ss;
	
	public ExceptionEx05() {
		// TODO Auto-generated constructor stub
		ss = new int[3];	//����ʵ� �ʱ�ȭ
		
	}	
	
	public void program(){
		for(int i = 0; i <= ss.length; i++){
			//ss[0] ss[1] ss[2]
			System.out.println("for���� ���� " + i + "��°");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("����ó�� �߻�" + e);
				return;
			}finally {
				System.out.println("������ �����ϴ� ��");
			}
			
			System.out.println("for���� �� " + i + "��°");
		}//end of for
	}//end of program
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx05 ee = new ExceptionEx05();
		ee.program();
		System.out.println("��");
	}

}
