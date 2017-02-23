package javaDay19;

import java.io.*;

public class FileCopyEx01 {
	//byte 을 이요하여 복사
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("파일 복사 시작...");
		
		long start = System.currentTimeMillis();	//시스템에서 제공하는 시작타임
		
		FileInputStream src = null;	//file original
		
		FileOutputStream dest = null;	//copy file
		
		try {
			//원본 파일을 읽기위한 FileInputTream 생성
			src = new FileInputStream("l:/files/write.zip");
			
			//복사본 파일을 생성하기 위한 FileOutStream 객체 생성
			dest = new FileOutputStream(new File("l:/files/write_dest.zip"));
			
			//FileInputstream을 통해서 읽어들인 값을 저장할 변수 선언
			int readValue = 0;
			
			//FinleInputStream의 read()메서드를 통해서 읽어들인 값을 readValue변수에 저장
			while( (readValue = src.read()) != 1 ){
				//readValue에 저장된 값을 FileOutputStream의 write()메서드를 통해서 파일에 기록
				dest.write(readValue);
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
