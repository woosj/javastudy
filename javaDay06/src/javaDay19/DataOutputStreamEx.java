package javaDay19;

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * DataOutputStream �� �⺻ �ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ��� �� �� ����
		 * DataOutputStream �� 1�� ��Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ� Ư�� �ٹ��̽��� ���� �� �� ����
		 */
		
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		
		try {
			//DataOutputStream �� ������ FileOutputStream ��ü ����
			fos = new FileOutputStream("l:/files/t2.csv");
			//�⺻ �ڷ����� Ÿ���� ������ä ����� �� �ִ� DataOutpuStream ��ü ����
			dos = new DataOutputStream(fos);
			
			int i = 10;
			double d = 3.14;
			String s = "hellow , welcome";
			
			//DataOutputStream �� �⺻�ڷ��� ���� write()�޼ҵ尡 ������
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try{
				if(fos != null){
					fos.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
			
			try{
				if(dos != null){
					dos.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
			
		}
	}

}
