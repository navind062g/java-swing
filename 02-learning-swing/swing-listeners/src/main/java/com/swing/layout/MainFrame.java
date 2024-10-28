package com.swing.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TextPanel textPanel;
	private Toolbar toolBar;
	
	public MainFrame() {
		super("Hello World");
		setLayout(new BorderLayout());
		
		new JTextArea();
		
		textPanel = new TextPanel();
		toolBar = new Toolbar();
		toolBar.setTextPanel(textPanel);
		
		this.add(toolBar, BorderLayout.NORTH);
		this.add(textPanel, BorderLayout.CENTER);
		
		/* Display window of size 600 x 500 */
		this.setSize(600, 500);
		
		/* Close the App on press of Close Button */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
