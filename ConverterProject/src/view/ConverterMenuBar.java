package view;

import javax.swing.*;

import controller.ActionListenerCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterMenuBar extends JMenuBar{
	ActionListenerCommand saveAction;
	
	/*
	 * This is a constructor to build a structure of a menu bar.
	 * 
	 * @param menubarListener this would help detecting user commands
	 */
	public ConverterMenuBar(ActionListenerCommand action) {
		super();
		this.saveAction = action;
		JMenu updateMenu = new JMenu("Update model");
		JMenuItem saveButton = new JMenuItem("Save input centimeters");
		saveButton.setActionCommand("SAVE");
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickSave();
			}
		});
		
		updateMenu.add(saveButton);
		super.add(updateMenu);
	}
	
	
	public void clickSave() {
		saveAction.execute();	
	}
	
}
