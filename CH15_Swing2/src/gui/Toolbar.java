package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener{
	
	private MainPanel mainPanel;
	private Color color;

	public ColorButtonListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(color);
	}
	
}

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		
		// 툴바에 버튼을 붙임
		add(redButton);
		add(blueButton);
		
		// 버튼에 이벤트를 연결('클릭'이벤트)
		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.BLUE));
	}
}
