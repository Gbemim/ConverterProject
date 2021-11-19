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
	ValueToConvert valueModel;
	private final ConverterPanel panel;
	
	public MenubarListener(ConverterPanel converterPanel) {
		this.panel = converterPanel;
		valueModel = new ValueToConvert(converterPanel);
	}


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
