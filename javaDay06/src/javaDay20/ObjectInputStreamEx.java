package javaDay20;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		
		try {
			//메모리에 생성된 객체를 직렬화 해서 스트리을 통해 기록할 수 있는 ObjectOutputStream 객체 생성
			ois = new ObjectInputStream(new FileInputStream("l:/files/obj.sav"));

			//ObjectOutputStream은 스트림으로 부터 읽어들인 직렬화된 객체를 역직렬화해서 객체를 생성 할 수 있음
			//역직렬화 할때 필요한 클래스 파일 찾지 못하는 경우가 있음
			Data data = (Data)ois.readObject();
			
			System.out.println("번호 : " + data.getNo());
			System.out.println("이름 : " + data.getName());
			System.out.println("이메일 : " + data.getEmail());
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			// TODO: handle exception
		} finally {
			try {
				if(ois != null){
					ois.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
