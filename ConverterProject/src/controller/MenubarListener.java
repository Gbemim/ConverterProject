package controller;

import view.ConverterPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenubarListener implements ActionListener {

	private final ConverterPanel converterPanel;

	public MenubarListener(ConverterPanel panel) {
		converterPanel = panel;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//SoccerGame soccerGame = gamePanel.getGame(); 
		switch (e.getActionCommand()) {
			case "SAVE":
				float userInputInCM = Float.parseFloat(converterPanel.getYellowArea().getText().trim());
				converterPanel.getGreenArea().setText("" + userInputInCM/30.48 + " ft");
				converterPanel.getOrangeArea().setText("" + userInputInCM/100 + " m");
				break;
			default:
				throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}
