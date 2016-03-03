package cellmachine;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class CellMachine {

	public static void main(String[] args) {
		
		Field field = new Field(50,50);
		for(int i=0; i<field.getHeigth(); i++)
			for(int j=0; j<field.getWigth(); j++){
				field.place(i, j, new Cell());
				}
		for(int i=0; i<field.getHeigth(); i++)
			for(int j=0; j<field.getWigth(); j++){
				Cell ret = field.get(i, j); // 这里的ret，其实只是一个管理者，并非new了一个新的对象
				if(Math.random() < 0.2 )
					ret.reborn();
			}
		
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		JButton button = new JButton("Go on");
		frame.add(view);
		frame.add(button, BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {
			// 按钮动作
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("one step");
				
				
				
					for(int i=0; i<field.getHeigth(); i++)
						for( int j=0; j<field.getWigth(); j++){
							int aliveNum = 0;
							Cell []neighbors = field.getNeighbour(i, j);
							Cell cell = field.get(i, j);
							for( Cell ret: neighbors){
								if( ret.isalive())
									aliveNum++;
							}
							if(aliveNum>3 || aliveNum <2)
								cell.die();
							if(aliveNum == 3)
								cell.reborn();
						}	
				
			
				frame.repaint();
			}
		});
		
		
		
	}
}
