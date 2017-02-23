package javaDay20;

import java.io.*;

public class FileReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		
		try {
			//파일로부터 한문자 단위로 읽어 올 수 있는 FileReader 객체 생성
			reader = new FileReader("l:/files/song.txt");
			
			//스트림을 통해서 읽어들인 값을 저장할 수 있는 변수 선언 및 초기화
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
