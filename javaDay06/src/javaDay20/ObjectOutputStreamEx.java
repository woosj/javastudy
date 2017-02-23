package javaDay20;

import java.io.*;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectOutputStream oos = null;
		
		try {
			//메모리에 생성된 객체를 직렬화 해서 스트리을 통해 기록할 수 있는 ObjectOutputStream 객체 생성
			oos = new ObjectOutputStream(new FileOutputStream("l:/files/obj.sav"));

			//ObjectOutputStream을 통해서 직렬화된 파일로 저장될 Data 객체 생성
			//Data 클래스는 반드시 Serializable로 구현되어 있어야함
			Data data = new Data();
			data.setNo(33);
			data.setName("홍길동");
			data.setEmail("hong@naver.com");
			
			//ObjectOutputStream 을 객체를 직렬화해 스트림을 통해 저장 할 수 있는 writeObject()메서드를 활용한다.
			
			oos.writeObject(data);
			
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			// TODO: handle exception
		} finally {
			try {
				if(oos != null){
					oos.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
