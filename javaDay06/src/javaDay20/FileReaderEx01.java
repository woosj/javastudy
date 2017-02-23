package javaDay20;

import java.io.*;

public class FileReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		
		try {
			//���Ϸκ��� �ѹ��� ������ �о� �� �� �ִ� FileReader ��ü ����
			reader = new FileReader("l:/files/song.txt");
			
			//��Ʈ���� ���ؼ� �о���� ���� ������ �� �ִ� ���� ���� �� �ʱ�ȭ
			int readValue = 0;
			
			while( (readValue = reader.read()) != -1 ){
				System.out.print((char)readValue);
			}
			
			/*
			while( reader.read() != -1 ){
				System.out.print((char)reader.read());
			}*/
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.getMessage();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try {
				if(reader != null){
					reader.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
