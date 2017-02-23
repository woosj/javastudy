package javaDay26;


import java.awt.*;
import javax.swing.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HorseEx extends JFrame implements Runnable {
	
	private Canvas can;
	private Image buffer;
	private Image[] horse;
	private boolean bRepeat = true;	//반복처리
	
	public HorseEx() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initHorse();
		
		this.add(can = new Canvas(){
			
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(buffer, 0, 0, this);
			}
			
			@Override
			public void update(Graphics g) {
				// TODO Auto-generated method stub
				paint(g);
			}
			
		});
		
		can.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int code = e.getKeyCode();
				
				switch(code){
					case KeyEvent.VK_SPACE :
						//멈추엇다 진행
						bRepeat = !bRepeat;
						
						if(bRepeat){
							//쓰레드 가동
							makeThread();
						}
						break;
				}
			}
		});
		
		setBounds(300,100,400,400);
		
		setVisible(true);
		
		makeThread();
		
	}
	
	public void makeThread(){
		//쓰레드 시작 메서드 호출
		new Thread(this).start();
		
	}
	
	//초기화
	public void initHorse() {
		horse = new Image[11];
		for(int i = 0; i < horse.length; i++){
			horse[i] = Toolkit.getDefaultToolkit().getImage(String.format("src/img/black%02d.png",i+1));
		}
	}
	
	public void bufferPaint(int n){
		
		buffer = createImage(can.getWidth(),can.getHeight());
		
		Graphics buffer_g = buffer.getGraphics();
		
		buffer_g.drawImage(horse[n], 50, 50, this);
		
		can.repaint();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			for(int i = 0; i < horse.length; i++){
				
				if( !bRepeat ) return;
				
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					// TODO: handle exception
					
				}
				bufferPaint(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HorseEx();
	}

}
