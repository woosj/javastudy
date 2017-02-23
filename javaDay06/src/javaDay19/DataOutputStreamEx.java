package javaDay19;

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * DataOutputStream 은 기본 자료형 타입 그대로 스트림을 통해서 기록 할 수 있음
		 * DataOutputStream 은 1차 스트림이 아니기 때문에 다른 스트림을 이용해서 특정 다바이스와 연결 할 수 있음
		 */
		
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		
		try {
			//DataOutputStream 과 연결할 FileOutputStream 객체 생성
			fos = new FileOutputStream("l:/files/t2.csv");
			//기본 자료형의 타입을 유지한채 기록할 수 있는 DataOutpuStream 객체 생성
			dos = new DataOutputStream(fos);
			
			int i = 10;
			double d = 3.14;
			String s = "hellow , welcome";
			
			//DataOutputStream 은 기본자료형 별로 write()메소드가 존재함
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
