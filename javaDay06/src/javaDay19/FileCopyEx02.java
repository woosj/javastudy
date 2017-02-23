package javaDay19;

import java.io.*;

public class FileCopyEx02 {
	//byte[] 을 이용하여 복사
	public static void main(String[] args) {
		
System.out.println("파일 복사 시작...");
		
		long start = System.currentTimeMillis();	//시스템에서 제공하는 시작타임
		
		FileInputStream src = null;	//file original
		
		FileOutputStream dest = null;	//copy file
		
		try {
			//원본 파일을 읽기위한 FileInputTream 생성
			src = new FileInputStream("l:/files/win.zip");
			
			//복사본 파일을 생성하기 위한 FileOutStream 객체 생성
			dest = new FileOutputStream(new File("l:/files/win_dest.zip"));
			
			//임시저장소에 저장된 data의 전체 개수를 저장할 변수 선언
			int length = 0;
			
			//임시 저장소로 사용될 byte[] 배열선어
			byte[] buffer = new byte[1024*8];	//배열의 크기 8kbyte
			
			//inputStream을 통해서 읽어들인 data를 임시저장소에 쌓아 저장하고 저장된 data의 개수를 length에 저장함
			
			
			while( (length = src.read(buffer)) != -1 ){
				//OutputStream을 통해서 임시저장소에 쌓여있는 data를 length만큼 파일에 기록함
				dest.write(buffer, 0, length);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try{
				if(dest != null){
					dest.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
			
			try{
				if(src != null){
					src.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
		}
		
		long end = System.currentTimeMillis();
		
		long copyTime = (end - start)/1000;
		
		System.out.println("복사하는데 걸린시간:" + copyTime + "초");
		
	}
	
}
