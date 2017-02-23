package javaDay19;

import java.io.File;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//���� ���
		String filepath = "l:/files";
		String filename = "fileio.txt";
		//1.���� ����
		File f1 = new File(filepath+"/"+filename);
		
		if(f1.exists()){
			System.out.println("�����̸� : " + f1.getName());
		}else{
			//������ �������� ���� ��� �������� �����.
			if(f1.createNewFile()){
				System.out.println("���ο� ������ �����߽��ϴ�.");
			}
		}
		
		//2.���� ����
		File f2 = new File(filepath+"/test");
		if(!f2.exists()){
			f2.mkdirs();
		}else{
			System.out.println("���� �̸� : " + f2.getPath() );
		}
		
		//3.���� Ȥ�� ���� ����
		File f3 = new File(filepath+"/test");
		if(f3.exists()){
			f3.delete();
		}

	}

}
