package unicasting;

import java.net.*;
import java.io.*;

public class UnicastClient {
	
	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;
	
	public UnicastClient() {
		// TODO Auto-generated constructor stub
		
		//���ϻ���
		try {
			
			socket = new Socket("127.0.0.1",5000);
			
		}catch(UnknownHostException uh){
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		}catch(IOException io){
			System.out.println("������ ���� �� �� �����ϴ�.");
			System.exit(0);
		}
		
		
		try{
			
			//Ű����� ����� ��Ʈ�� ���
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			//socket���κ��� ��Ʈ�� ���
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//������ �޽��� �ְ�ޱ�
			while(true)
			{
				
				//Ű���� �Է� ���� �б�
				System.out.print("���۸޽���");
				String msg = keyboard.readLine();
				
				//�޽��� ������ �����ϱ�
				bw.write(msg+"\n");
				bw.flush();
				
				//������ ������ �޽��� ����
				String getMsg = br.readLine();
				System.out.println("���Ÿ޽���:"+getMsg);
				
			}

		}catch(IOException io){
			
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("["+address+"]"+"���� ������ ���������ϴ�.");
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new UnicastClient();
		
	}

}
