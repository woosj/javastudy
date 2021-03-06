package Multicasting;

//사용자가 입력한 메시지를 서버에 전송한다
//서버포트번호: 1004

import java.io.*;
import java.net.*;

public class MultiClient {
	
	private Socket socket; //서버랑 연결된 Socket
	private BufferedReader in; //서버가 보낸 메시지를 읽어들일 스트림
	private PrintWriter out; //서버로 메시지를 전송할 스트림
	private BufferedReader keyboard; //키보드로 입력내용을 읽어들일 스트림
	
	public MultiClient() {
		// TODO Auto-generated constructor stub
		
		try {
			
			socket = new Socket("localhost", 3000);
			System.out.println("Server Connection Success....");
			
			//스트림연결
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//서버가 전송한 메시지를 읽어들이는 읽기전용 Thread생성
			//MultiClientThread 생성시에 서버가 전송한 메시지를 읽어들일 수 있는 스트림을 전달

			MultiClientThread t = new MultiClientThread(in);
			t.start();
			
			//키보드로 입력한 내용을 읽어와서 서버로 전송
			while(true)
			{
				String text = keyboard.readLine();
				out.println(text);
			}
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException io){
			io.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MultiClient();
		
	}

}
