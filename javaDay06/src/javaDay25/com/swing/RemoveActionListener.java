package javaDay25.com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {
	
	JTable table;
	
	public RemoveActionListener(JTable table) {
		// TODO Auto-generated constructor stub
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int row = table.getSelectedRow();
		
		if(row == -1){
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
	}

}
