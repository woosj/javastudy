package javaDay14;

import static java.lang.System.out;
//�ڵ带 �ٿ��� �޼��带 ����� �� ����

public class AssertEx01 {
	
	public void gugu(int dan){
		assert dan > 1 && dan < 10:"2~9���� �ϳ��� �Է��ϼ���:";
		System.out.println(dan + "��");
		out.println("============================");
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < 9; i++){
			sb.delete(0, sb.length());
			sb.append(dan);
			sb.append("*");
			sb.append(i+1);
			sb.append("=");
			sb.append(dan*(i+1));
			out.println(sb.toString());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssertEx01 as = new AssertEx01();
		try {
			int dan = Integer.parseInt(args[0]);
			
			as.gugu(dan);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}

}
