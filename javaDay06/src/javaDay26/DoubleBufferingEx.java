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
		
		super("�Ѹ�");
		
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
			//�̹����� ���� �ƴϸ� �̹����� �׷����� �׸���.
			g.drawImage(bufferImage, 0, 0, this);
		}
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		Dimension d = getSize();
		
		if(bufferGraphics == null){
			//�׷����� ���̸�
			bufferImage = createImage(d.width, d.height);
			//�׷����� �����
			bufferGraphics = bufferImage.getGraphics();
			//���� �׷����� ������ ��
		}
		
		//�׷��ȿ� ��׶��� ����
		bufferGraphics.setColor(getBackground());
		//�������� 0,0 ���� ���μ��� ũ��� �����Ѵ�.
		bufferGraphics.fillRect(0, 0, 500, 500);
		
		//image : �ε��� �̹��� x�� y��ǥ�� �������� �Ͽ� ���̿� ����ŭ �׷��ش�.
		bufferGraphics.drawImage(image, x, y, x+50, y+50, sel*50, 0, sel*50+50, 50, this);
		
		//����Ʈ �޼��带 ȣ��
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
