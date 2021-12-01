package view;

import javax.swing.*;

import controller.ActionListenerCommand;
import controller.ActionSave;
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
		//menubarListener = new MenubarListener(panel);
		ActionListenerCommand clickSave = new ActionSave(this);
		menuBar = new ConverterMenuBar(menubarListener);
		//menuBar = new Menubar)
		add(panel);
		setJMenuBar(menuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
