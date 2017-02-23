package javaDay26;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DoubleBufferingEx extends Frame implements KeyListener, Runnable {
	
	Image image;
	int x, y, mx, my, sel;
	
	Graphics bufferGraphics;
	Image bufferImage;
	
	public DoubleBufferingEx() {
		
		super("팩맨");
		
		image = Toolkit.getDefaultToolkit().getImage("src/img/packman.jpg");
		
		x = 255;
		y = 255;
		mx = 0;
		my = 0;
		sel = 0;
		Thread t = new Thread(this);
		t.start();
		
		setBounds(200, 200, 500, 500);
		setVisible(true);
		
		addKeyListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub

				System.exit(0);
			}
			
		});
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			x += mx;
			y += my;
			
			if(sel%2 == 0){
				sel++;
			}else{
				sel--;
			}
			
			if(x <= -500) x = 500;
			if(x >= 500) x = 0;
			
			if( y <= -500) y = 500;
			if( y >= 500) y = 0;
			
			try {
				repaint();
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			
			}
			
		}
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		if(bufferImage != null){
			//이미지가 널이 아니면 이미지나 그래픽을 그린다.
			g.drawImage(bufferImage, 0, 0, this);
		}
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		Dimension d = getSize();
		
		if(bufferGraphics == null){
			//그래픽이 널이면
			bufferImage = createImage(d.width, d.height);
			//그래픽을 만들고
			bufferGraphics = bufferImage.getGraphics();
			//만든 그래픽을 가지고 옴
		}
		
		//그래픽에 백그라운드 설정
		bufferGraphics.setColor(getBackground());
		//시작점은 0,0 시작 가로세로 크기로 설정한다.
		bufferGraphics.fillRect(0, 0, 500, 500);
		
		//image : 로딩된 이미지 x와 y좌표로 기준으로 하여 넒이와 폭만큼 그려준다.
		bufferGraphics.drawImage(image, x, y, x+50, y+50, sel*50, 0, sel*50+50, 50, this);
		
		//페인트 메서드를 호출
		paint(g);
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() == e.VK_LEFT){
			mx = -10;
			my = 0;
			sel = 0;
		}else if(e.getKeyCode() == e.VK_RIGHT){
			mx = 10;
			my = 0;
			sel = 2;
		}else if(e.getKeyCode() == e.VK_UP){
			mx = 0;
			my = -10;
			sel = 4;
		}else if(e.getKeyCode() == e.VK_DOWN){
			mx = 0;
			my = 10;
			sel = 6;
		}else if(e.getKeyCode() == e.VK_ESCAPE){
			System.exit(0);
		}
		
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DoubleBufferingEx();
	}
}
