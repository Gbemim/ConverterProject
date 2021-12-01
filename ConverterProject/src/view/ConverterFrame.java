package view;

import javax.swing.*;

import controller.ActionListenerCommand;
import controller.ActionSave;

/* The view package consists in a Jframe 
  1)that comprises a JPanel and a JMenuBar.
  2)That JPanel comprises three views (i.e. JTextArea): CentimetersConversionArea, FeetConversionArea, MeterConversionArea
*/

public class ConverterFrame extends JFrame{
	private ConverterPanel panel;
	private ConverterMenuBar menuBar;
	public ActionListenerCommand clickSave;
	/*
	 * This is a default constructor to initialize the whole interface
	 * with a main panel and menu bar.
	 */
	public ConverterFrame() {
		panel = new ConverterPanel();
		clickSave = new ActionSave(panel);
		menuBar = new ConverterMenuBar(clickSave);
		
		add(panel);
		setJMenuBar(menuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
