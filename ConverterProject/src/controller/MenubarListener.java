package controller;

import view.ConverterPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ValueToConvert;

/* The Controller comprises a class that
 * 1)retrieves each value specified by the user in the CentimetersConversionArea JTextArea
 * 2)sets the new state of ValueToConvert with it.
*/

public class MenubarListener implements ActionListener {
	private ValueToConvert valueModel;
	private final ConverterPanel panel;
	
	/*
	 * This is a constructor which sets up a main panel
	 * and initializes a class for converting values.
	 * 
	 *  @param converterPanel the main interface for the application
	 */
	public MenubarListener(ConverterPanel converterPanel) {
		this.panel = converterPanel;
		valueModel = new ValueToConvert(converterPanel);
	}

	/*
	 * Invoked when an action occurs.
	 * When a user clicked a save button on the menu bar,
	 * this method would be called and obtain a user input. 
	 * 
	 * @param e an action which is always a click command
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "SAVE":
				//Satisfies 1)
				float userInputInCM = Float.parseFloat(panel.getCmArea().getText().trim());
				//Satisfies 2)
				valueModel.updateValue(userInputInCM);
				break;
			default:
				throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}
