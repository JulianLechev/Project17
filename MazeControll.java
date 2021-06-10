package encaraMessi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MazeControll extends JPanel {

	private MazePanel mazePanel = new MazePanel();
	
	private JButton findPathBtn = new JButton("Find Path");
	private JButton clearPathBtn = new JButton("Clear Path");
	
	public MazeControll() {
		
		setLayout(new BorderLayout());
		add(mazePanel, BorderLayout.CENTER);
		JPanel btnPanel = new JPanel();
		btnPanel.add(findPathBtn);
		btnPanel.add(clearPathBtn);
		add(btnPanel,BorderLayout.SOUTH);
		
		findPathBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mazePanel.findPath();
				
			}});
		
		clearPathBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mazePanel.clearPath();
				
			}});
		
	}
	
	
}
