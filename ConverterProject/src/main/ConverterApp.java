package main;

//import controller.NewValueToConvert;
import controller.MenubarListener;
import view.ConverterMenuBar;
import view.ConverterPanel;

import javax.swing.*;

public class ConverterApp {

	public static void main(String[] args) {
		JFrame gameFrame = new JFrame("");
		ConverterPanel gamePanel = new ConverterPanel();
		MenubarListener menubarListener = new MenubarListener(gamePanel);
		ConverterMenuBar gameMenuBar = new ConverterMenuBar(menubarListener);
		gameFrame.add(gamePanel);
		//gameFrame.addKeyListener(gameListener);
		gameFrame.setJMenuBar(gameMenuBar);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setSize(600, 600);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);
	}

}
