package com.swing.app;

import javax.swing.SwingUtilities;

import com.swing.layout.MainFrame;

public class App {

	public static void main(String[] args) {
		/* Swing thread needs to be run in Special Thread */
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame(); 
			}
		});	
	}

}
