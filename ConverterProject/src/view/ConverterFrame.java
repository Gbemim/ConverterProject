package view;

import javax.swing.*;

import controller.MenubarListener;

import java.awt.*;

public class ConverterFrame extends JFrame{
	
	ConverterPanel panel = new ConverterPanel();
	MenubarListener menubarListener = new MenubarListener(panel);
	ConverterMenuBar menuBar = new ConverterMenuBar(menubarListener);
	
	public ConverterFrame() {
		add(panel);
		setJMenuBar(menuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
