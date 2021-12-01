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

	@Override
	public void execute() {
		String userInputInCM = document.getCmArea().getText().trim();
		
		//updates model only if its a whole number
		if (userInputInCM.matches("^\\d+$")) {
			valueModel.setValue(Integer.parseInt(userInputInCM));
		} else {
			document.getCmArea().setText("");
		}	
	}
}
