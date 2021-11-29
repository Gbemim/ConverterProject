package controller;

import view.ConverterPanel;

public class PanelObserver implements Observer {
	private ConverterPanel panel;

	public PanelObserver(ConverterPanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void update(String meters, String feet) {

		panel.getMeterArea().setText(meters);
		panel.getFeetArea().setText(feet);
	}

}
