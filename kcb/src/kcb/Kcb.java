package kcb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Kcb {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new KcbData());
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("¼ÆËãÆ÷");
		frame.setVisible(true);
	}

}
