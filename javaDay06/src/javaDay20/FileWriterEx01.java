package javaDay20;

import java.io.*;

public class FileWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		
		try {
			
			//���Ͽ� �ѹ��� ������ ����� �� �ִ� FileWriter ��ü ����
			writer = new FileWriter("l:/files/song.txt");
			
			//Writer �� ���ڿ��� �ٷ� ����� �� �ִ�.
			String str = "���ο��� �繰���ͳ� ���Ǹ� ��� �ִ�.";
			writer.write(str);
			
			//�ѱ��� ������ �а� ���� �ִ� Reader, Writer�迭�� ��Ʈ���� ���������� ���ۿ� �����Ѵ�.
			//����� ���۴� ���۰� ���� ä���� ������ ��Ʈ���� ���� ������ ��������.
			//flush() : ���۰� �������� �ʾƵ� ���� ��
			writer.flush();
		
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try {
				if(writer != null){
					writer.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
