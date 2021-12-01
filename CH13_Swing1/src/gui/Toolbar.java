package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar() {
		// 툴바에 버튼을 붙임
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
	}
}
