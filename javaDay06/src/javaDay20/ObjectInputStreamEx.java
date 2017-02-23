package javaDay20;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		
		try {
			//�޸𸮿� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ���� ����� �� �ִ� ObjectOutputStream ��ü ����
			ois = new ObjectInputStream(new FileInputStream("l:/files/obj.sav"));

			//ObjectOutputStream�� ��Ʈ������ ���� �о���� ����ȭ�� ��ü�� ������ȭ�ؼ� ��ü�� ���� �� �� ����
			//������ȭ �Ҷ� �ʿ��� Ŭ���� ���� ã�� ���ϴ� ��찡 ����
			Data data = (Data)ois.readObject();
			
			System.out.println("��ȣ : " + data.getNo());
			System.out.println("�̸� : " + data.getName());
			System.out.println("�̸��� : " + data.getEmail());
			
			
			
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
