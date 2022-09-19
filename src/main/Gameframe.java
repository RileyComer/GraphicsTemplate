package main;

public class Gameframe {
	
	private String mode;
	
	public Gameframe() {
		mode="Menu";
	}
	
	public void update() {
	 
	}
	
	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode=mode;
	}
	
	/*
	private static void playSound(File Sound) {// just put name of file
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	*/
}
