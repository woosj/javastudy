package javaDay19;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("l:/files/fileio.txt");
		
		System.out.println("�������� : " + f.isFile());
		System.out.println("�������� : " + f.isDirectory());
		System.out.println("����� : " + f.getPath());
		System.out.println("������ : " + f.getAbsolutePath());
		System.out.println("������ �̸� : " + f.getName());
		System.out.println("������ ���� : " + f.length());
		System.out.println("������ ���� ���� ��¥ : " + f.lastModified());
		
	}

}
