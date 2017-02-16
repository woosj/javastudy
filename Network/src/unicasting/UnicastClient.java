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
		
		//소켓생성
		try {
			
			socket = new Socket("127.0.0.1",5000);
			
		}catch(UnknownHostException uh){
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		}catch(IOException io){
			System.out.println("서버와 연결 할 수 없습니다.");
			System.exit(0);
		}
		
		
		try{
			
			//키보드와 연결된 스트림 얻기
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			//socket으로부터 스트림 얻기
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//서버와 메시지 주고받기
			while(true)
			{
				
				//키보드 입력 내용 읽기
				System.out.print("전송메시지");
				String msg = keyboard.readLine();
				
				//메시지 서버로 전송하기
				bw.write(msg+"\n");
				bw.flush();
				
				//서버가 전송한 메시지 수신
				String getMsg = br.readLine();
				System.out.println("수신메시지:"+getMsg);
				
			}

		}catch(IOException io){
			
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("["+address+"]"+"와의 연결이 끊어졌습니다.");
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new UnicastClient();
		
	}

}
