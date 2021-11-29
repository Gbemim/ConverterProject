package controller;

public interface Subject {

	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notify(String meters, String feet);
}
