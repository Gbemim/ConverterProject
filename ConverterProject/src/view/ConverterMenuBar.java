package view;

import javax.swing.*;
import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;

public class ConverterMenuBar extends JMenuBar{
	
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
