package view;

import javax.swing.*;

import controller.MenubarListener;

/* The view package consists in a Jframe 
  1)that comprises a JPanel and a JMenuBar.
  2)That JPanel comprises three views (i.e. JTextArea): CentimetersConversionArea, FeetConversionArea, MeterConversionArea
*/

public class ConverterFrame extends JFrame{
	//Satisfies 1 and 2 (within ConverterPanel)
	private ConverterPanel panel;
	private MenubarListener menubarListener;
	private ConverterMenuBar menuBar;
	
	/*
	 * This is a default constructor to initialize the whole interface
	 * with a main panel and menu bar.
	 */
	public ConverterFrame() {
		panel = new ConverterPanel();
		menubarListener = new MenubarListener(panel);
		menuBar = new ConverterMenuBar(menubarListener);
		
		add(panel);
		setJMenuBar(menuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
