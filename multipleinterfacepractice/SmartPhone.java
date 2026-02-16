package com.multipleinterfacepractice;

public class SmartPhone implements Camera,MusicPlayer {

	@Override
	public void playMusic() {

		System.out.println("This is a Music Player Method");
	}

	@Override
	public void takePhoto() {

		System.out.println("This is a Camera Method");
	}

}
