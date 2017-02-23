package javaDay25.com.swing;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel{

	int kor, eng, mat;
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		g.clearRect(0, 0, getWidth(), getHeight());
		
		g.drawLine(50, 250, 350, 250);
		
		//그래프 라인과 점선 및 점수
		for(int cnt = 1; cnt < 11; cnt++){
			
			g.drawString(cnt*10+"", 25, 255-20*cnt);
			g.drawLine(50, 250-20*cnt, 350, 250-20*cnt);
			
		}
		
		g.drawLine(50, 20, 50, 250);
		g.drawString("국어", 100, 270);
		g.drawString("영어", 200, 270);
		g.drawString("수학", 300, 270);
		
		g.setColor(Color.RED);
		
		if(kor > 0){
			g.fillRect(110, 250-kor*2, 10, kor*2);
		}
		
		if(eng > 0){
			g.fillRect(210, 250-eng*2, 10, eng*2);
		}
		
		if(mat > 0){
			g.fillRect(310, 250-mat*2, 10, mat*2);
		}
		
	}
	
	
	void setScores(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
}
