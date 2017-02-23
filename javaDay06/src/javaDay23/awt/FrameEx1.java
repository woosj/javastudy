package javaDay23.awt;

import java.awt.*;

public class FrameEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//프레임 객체 생성
		Frame f = new Frame();
		
		//윈도우 이벤트 객체 추가
		WinEvent w = new WinEvent();
		//프레임 객체에 리스너해줘야한다.
		f.addWindowListener(w);
		
		f.setSize(300, 200);	//프레임의 크기 설정 가로와 세로
		f.setVisible(true);	//프레임 보이기 설정 true 일떄는 보임, false일때는 안보임
		
	}

}
