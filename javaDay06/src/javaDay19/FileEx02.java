package javaDay19;

import java.io.File;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dire = new File("l:/files");
		
		if(dire.exists()){
			if(dire.isDirectory()){
				//���� �������� ��� ����, ���� �̸� ���
				String[] fnameList = dire.list();
				
				for(String ss : fnameList){
					System.out.println("�����̸� : " + ss);
				}
			}
		}
	}

}
