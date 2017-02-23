package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.*;
import javaDay23.awt.WinEvent;

public class ActionEventEx2 extends Frame implements ActionListener {
	
	//button 4, color 4
	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = {
			Color.red, Color.green, Color.blue, Color.yellow
	};
	
	private CardLayout card = new CardLayout();
	
	private Panel pptop;
	
	public ActionEventEx2() {
		// TODO Auto-generated constructor stub
		
		super("Card Layout");
		
		setLayout(new BorderLayout());
		
		Panel p = new Panel(new GridLayout(1, 4));
		
		for(int i = 0; i < bt.length; i++){
			
			bt[i] = new Button(i+1+"¹ø ¹öÆ°");
			bt[i].addActionListener(this);
			p.add(bt[i]);

		}
		
		add("North",p);
		
		pptop = new Panel(card);
		
		for(int i = 0; i < pp.length; i++){
			
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add(""+i, pp[i]);
			
		}
		
		add("Center",pptop);
		
		card.show(pptop, "0");
		
		
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++){
			if(e.getSource() == bt[i]){
				card.show(pptop, ""+i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventEx2();
	}

	

}
