package controller;


import model.ValueToConvert;
import view.ConverterPanel;

public class ActionSave implements ActionListenerCommand {
	private ConverterPanel document;
	private ValueToConvert valueModel;
	
	public ActionSave(ConverterPanel converterPanel) {
		this.document = converterPanel;
		valueModel = new ValueToConvert(converterPanel);

	}

	/*
	 * Retrieves the value specified by user in CentimeterConversionArea
	 * Updates the model by passing the retrieved value
	 */
	@Override
	public void execute() {
		String userInputInCM = document.getCmArea().getText().trim();
		valueModel.save(userInputInCM);
	}
}
