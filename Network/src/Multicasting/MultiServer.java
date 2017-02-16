package Multicasting;

/************************************************************
 * MultiServer : ��� Ŭ���̾�Ʈ�� �����û�� �޾Ƽ� Socket�� �����ϰ�
 * 				 Socket�� �����ϱ� ���� Thread ��ü�� �����Ѵ�
 * 				 ������ ������ ��ü�� Collection ���� ������
 ************************************************************/

import java.net.*;
import java.io.*;
import java.util.*;

public class MultiServer {
	
	//Ư�� Ŭ���̾�Ʈ�� ���� �޽����� ��� Ŭ���̾�Ʈ���� �����ϱ� ���� 
	//Ŭ���̾�Ʈ�� �޽��� �ۼ��� �� �� �ִ� ����� ���� MultiServerThread ��ü�� ������ �ڷᱸ���� ������
	private ArrayList<MultiServerThread> clientList = new ArrayList<MultiServerThread>();
	private ServerSocket server = null;
	
	public MultiServer() {
		// TODO Auto-generated constructor stub
		
		//1004�� ��Ʈ��ȣ�� Ŭ���̾�Ʈ�� ���ӿ�û�� ��ٸ��� �ִ� �������ϻ���
		try{
		
			server = new ServerSocket(3000);
			System.out.println("�������������۵ʢ�����");
			
			while(true){
				
				//Ŭ���̾�Ʈ�� �����û�� ����ϰ� �ִٰ�
				//���� ��û�� �����Ǹ� �ش�Ŭ���̾�Ʈ�� ��� �� �� �ִ� ������ ���� ��ȯ��
				Socket socket = server.accept();
				
				//�������κ��� ip�ּҿ� ȣ��Ʈ���� ������ �ִ� InetAddress ��ü���
				InetAddress ip = socket.getInetAddress();
				
				//InetAddress ��ü�κ��� ip�ּҾ��
				String ipAddress = ip.getHostAddress();
				
				System.out.println(ipAddress+"����");
				
				//Client�� �ۼ����� �� �ִ� ����� ���� MultiServerThread�� �����ϰ� �ִ� clientList��
				//�ش� Ŭ���̾�Ʈ�� ����� Socket��ü�� �����ؼ� MultiServerThread��ü�� ������
				MultiServerThread t = new MultiServerThread(clientList, socket);
				t.start();
				
				//������ MultiServerThread ��ü�� clientList�� ������
				clientList.add(t);
				
			}
			
		}catch(IOException io){
			System.out.println(io.getMessage());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MultiServer();
		
	}

}
