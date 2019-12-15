package temeAgregare;

public class Smartphone {
	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;
	


	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
						int microMaxVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol);
		this.theMicrophone = new Microphone(microMaxVol);
	}
	
	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
						int speakerCrtVol, int microMaxVol, int microCrtVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
		this.theMicrophone = new Microphone(microMaxVol, speakerCrtVol);
	}
	
	public void pressVolumeUp() {
		System.out.println("Smartphone: delegate to Case ->");
	    this.theCase.pressVolumeUp();
	    System.out.println("Smartphone: delegate to Speaker ->");
	    this.theSpeaker.increaseVolume();
	  }
	 
	  public void pressVolumeDown() {
		  System.out.println("Smartphone: delegate to Case ->");
		  this.theCase.pressVolumeDown();
		  System.out.println("Smartphone: delegate to Speaker ->");
		  this.theSpeaker.decreaseVolume();
	  } 
	  
	  public void setPixel(int pixelId, String color) {
		  System.out.println("Smartphone: delegate to Screen ->");
		  this.theScreen.setPixel(pixelId, color);
	  }
	  
	  public void colorScreen(String color) {
		  System.out.println("Smartphone: delegate to Screen ->");
		  this.theScreen.colorScreen(color);
	  }
	  
	  public boolean increaseMicrophoneVolume() {
		  System.out.println("\t Smartphone: delegate to Microphone ->");
		  return this.theMicrophone.increaseVolume();
	  }
	  
	  public boolean decreaseMicrophoneVolume() {
		  System.out.println("\t Smartphone: delegate to Microphone ->");
		  return this.theMicrophone.decreaseVolume();
	  }
	  
	  public void muteMicrophone() {
		  System.out.println("Smartphone: delegate to Microphone ->");
		  this.theMicrophone.muteMicrophone();
	  }
	  
	  public void setSilenceMode() {
		  System.out.println("\t Smartphone: delegate to Speaker ->");
		  this.theSpeaker.setSilenceMode();
	  }
}
