package javaDay19;

import java.io.File;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ϸ�� ��� ����
		String filename = "fileio.txt";
		String filepath = "l:/files";
		
		//���� Ȥ�� ���� �̸� ����
		File src = new File(filepath+"/" +filename);	//��������
		File des = new File(filepath + "/dest.txt");	//
		File des2 = new File(filepath);	//
		
		if(src.exists()){
			src.renameTo(des);
			src.renameTo(des2);
		}
		
		//��������� ���
		if(des2.exists()){
			String dir[] = des2.list();
			for(String sss : dir){
				System.out.println("dir : " + sss);
			}
		}
		
	}

}
