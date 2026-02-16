package com.multipleinterfacepractice;

public class SocialApp implements ReelsFeature,ChatFetures{

	@Override
	public void sendMessages() {

		System.out.println("This is a Methos of Chat Features");
	}

	@Override
	public void uploadLReels() {
		System.out.println("This is a Methos of Reels Feature");		
	}

}
