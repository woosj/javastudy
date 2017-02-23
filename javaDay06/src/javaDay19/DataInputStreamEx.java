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
			
			//DataInputStream은 기본자료형을 유지한채로 저장된 값을 읽어 들일 수 있는 read()메서드가 존재함
			//일어들일때 반드시 기록한 순서대로 읽어들어야함
			
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			
			System.out.println("i값 : " + i);
			System.out.println("d값 : " + d);
			System.out.println("s값 : " + s);
			
			
			
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
