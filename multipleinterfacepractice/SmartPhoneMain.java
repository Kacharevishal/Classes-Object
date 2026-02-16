package com.multipleinterfacepractice;

public class SmartPhoneMain {

	public static void main(String[] args) {

		Camera c;
		c = new SmartPhone();
		c.takePhoto();
		
		MusicPlayer m;
		m = new SmartPhone();
		m.playMusic();
	}

}
