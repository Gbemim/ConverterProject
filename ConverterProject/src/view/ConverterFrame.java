package view;

import javax.swing.*;

import controller.MenubarListener;

import java.awt.*;

/* The view package consists in a Jframe 
  1)that comprises a JPanel and a JMenuBar.
  2)That JPanel comprises three views (i.e. JTextArea): CentimetersConversionArea, FeetConversionArea, MeterConversionArea
*/

public class ConverterFrame extends JFrame{
	//Satisfies 1 and 2 (within ConverterPanel)
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
