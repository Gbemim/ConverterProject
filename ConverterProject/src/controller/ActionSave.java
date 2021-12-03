package controller;


import model.ValueToConvert;
import view.ConverterPanel;

/*
 * This is a concrete command for a Command design pattern
 */
public class ActionSave implements ActionListenerCommand {
	private ConverterPanel document;
	private ValueToConvert valueModel;
	
	/*
	 * This is a constructor which connects to a Receiver.
	 * 
	 * @param converterPanel the Receiver class for a Command design pattern
	 */
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
