package com.swing.layout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame() {
		super("Hello World");
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Click Me!");
		
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hello\n");
			}
		});
		
		this.add(textArea, BorderLayout.CENTER);
		this.add(btn, BorderLayout.SOUTH);
		
		/* Display window of size 600 x 500 */
		this.setSize(600, 500);
		
		/* Close the App on press of Close Button */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
