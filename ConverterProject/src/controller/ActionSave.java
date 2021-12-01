package controller;

import javax.swing.text.Document;

import view.ConverterFrame;

public class ActionSave implements ActionListenerCommand {
	private ConverterFrame doc;
	
	public ActionSave(ConverterFrame converterFrame) {
		this.doc = converterFrame;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
}
