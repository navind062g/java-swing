package com.swing.layout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7457830966851549464L;
	private JButton helloButton;
	private JButton goodByeButton;
	private StringListener textListener;

	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}

	public Toolbar() {
		helloButton = new JButton("Hello");
		goodByeButton = new JButton("Good Bye");
		
		//connect the action listeners with toolbar
		helloButton.addActionListener(this);
		goodByeButton.addActionListener(this);
		
		//just add your components to flow layout
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodByeButton);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloButton) {
			textListener.textEmitted("\nThis is a Hello Button!\n");
		}
		else {
			textListener.textEmitted("\nThis is a Good Bye Button!\n");
		}
		
	}
}
