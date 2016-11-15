package ca.elliottanderson.aftermath.aftermath;

import ca.elliottanderson.aftermath.display.Display;

public class Aftermath implements Runnable{
	
	private Thread thread; 
	private Display display;
	public int width, height;
	private boolean running = false;
	public String title;
	
	public Aftermath(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;

	}
	
	private void tick(){
		
	}

	private void render(){
		
		
	}
	 
	public void run() {

		init();
		while(running){
			
			tick();
			render();
		}
		
		stop();
		
	}
	
	private void init() {
		 
		display = new Display(title, width, height);
	}

	public synchronized void start(){
		if(!running){	
			thread = new Thread(this);
			thread.start();
			running = true;
		}
		
	}
	
	public synchronized void stop(){
		
		if(running){
			try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			running = false;
		}
		
	}

}
