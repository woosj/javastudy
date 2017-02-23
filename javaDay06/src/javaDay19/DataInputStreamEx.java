package javaDay19;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("l:/files/t2.csv");
			
			dis = new DataInputStream(fis);
			
			//DataInputStream�� �⺻�ڷ����� ������ä�� ����� ���� �о� ���� �� �ִ� read()�޼��尡 ������
			//�Ͼ���϶� �ݵ�� ����� ������� �о������
			
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			
			System.out.println("i�� : " + i);
			System.out.println("d�� : " + d);
			System.out.println("s�� : " + s);
			
			
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try{
				if(fis != null){
					fis.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
			
			try{
				if(dis != null){
					dis.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
			
		}
	}

}
