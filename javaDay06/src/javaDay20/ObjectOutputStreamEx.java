package javaDay20;

import java.io.*;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectOutputStream oos = null;
		
		try {
			//�޸𸮿� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ���� ����� �� �ִ� ObjectOutputStream ��ü ����
			oos = new ObjectOutputStream(new FileOutputStream("l:/files/obj.sav"));

			//ObjectOutputStream�� ���ؼ� ����ȭ�� ���Ϸ� ����� Data ��ü ����
			//Data Ŭ������ �ݵ�� Serializable�� �����Ǿ� �־����
			Data data = new Data();
			data.setNo(33);
			data.setName("ȫ�浿");
			data.setEmail("hong@naver.com");
			
			//ObjectOutputStream �� ��ü�� ����ȭ�� ��Ʈ���� ���� ���� �� �� �ִ� writeObject()�޼��带 Ȱ���Ѵ�.
			
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
