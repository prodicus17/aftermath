package ca.elliottanderson.aftermath.aftermath;

import ca.elliottanderson.aftermath.display.Display;

public class Aftermath {
	
	private Display display;
	public int width, height;
	
	public Aftermath(String title, int width, int height) {
		this.width = width;
		this.height = height;
		
		display = new Display(title, width, height);
		
	}

}
