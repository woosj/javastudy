package javaDay20;

import java.io.*;

public class FileWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		
		try {
			
			//파일에 한문자 단위로 기록할 수 있는 FileWriter 객체 생성
			writer = new FileWriter("l:/files/song.txt");
			
			//Writer 는 문자여을 바로 기록할 수 있다.
			String str = "종로에서 사물인터넷 강의를 듣고 있다.";
			writer.write(str);
			
			//한글자 단위로 읽고 쓸수 있는 Reader, Writer계열의 스트림의 내부적으로 버퍼에 저장한다.
			//저장된 버퍼는 버퍼가 가득 채워질 때에만 스트림을 통해 밖으로 내보낸다.
			//flush() : 버퍼가 가듣차지 않아도 비우게 함
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
