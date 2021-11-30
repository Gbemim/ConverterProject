package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ConverterMenuBar extends JMenuBar{
	
	/*
	 * This is a constructor to build a structure of a menu bar.
	 * 
	 * @param menubarListener this would help detecting user commands
	 */
	public ConverterMenuBar(ActionListener menubarListener) {
		super();
		JMenu updateMenu = new JMenu("Update model");
		JMenuItem menuItem = new JMenuItem("Save input centimeters");
		menuItem.setActionCommand("SAVE");
		menuItem.addActionListener(menubarListener);
		
		updateMenu.add(menuItem);
		super.add(updateMenu);
	}
}
