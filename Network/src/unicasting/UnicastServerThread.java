package unicasting;

import java.net.*;
import java.io.*;

public class UnicastServerThread extends Thread{

	/*************************************************************
	 * 각각의 클라이언트와 연결된 Socket 객체를 가지고 있으며,
	 * 클라이언트와 접속을 유지하고 통신을 담당함
	 *************************************************************/

	//서버로부터 전달된 Socket(클라이언트와 연결된)을 저장함
	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	//객체 생성시 Socket을 전달받아서 멤버변수에 저장하는 생성자임
	public UnicastServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket=socket;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//스트림연결
		
		try {
			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//클라이언트와 송수신함
			while(true){
				
				//클라이언트가 전달한 메시지 수신
				String msg = br.readLine();
				System.out.println(msg);
				
				//클라이언트에게 메시지 재전송
				bw.write(msg+"\n");
				
				//메시지를 전송하고 버퍼를 비움
				//버퍼를 비워야 새로운 메시지가 들어올 수 있음
				bw.flush();
				
			}
			
		} catch (IOException io) {
			//클라이언트와 연결이 끊어진 경우 발생
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			
			System.out.println("["+address+"]"+"와의 연결이 끊어졌습니다.");
			
		}
		
	}
	
}
