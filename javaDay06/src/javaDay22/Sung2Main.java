package javaDay22;

import java.io.IOException;

public class Sung2Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char ch;
		
		Sung2 ss = new SungImpl2();
		
		System.out.println("���� ó��");
		while(true){
			do{
				
				System.out.print("\n 1.�Է� 2.���� 3.�̸��˻� 4.���� 5.��ü ��� 6.�հԼ� ��ü��� 7.����");
				System.out.print("\n �޴� ���� :");
				
				ch = (char)System.in.read();
				System.in.skip(2);
				
			}while(ch < '1' || ch > '7');
			
			switch(ch){
				case '1': ss.insert();break;
				case '2': ss.update();break;
				case '3': ss.search();break;
				case '4': ss.delete();break;
				case '5': ss.writeAll();break;
				case '6': ss.writeSort();break;
				case '7': System.exit(0);break;
			}
		}
		
	}

}
