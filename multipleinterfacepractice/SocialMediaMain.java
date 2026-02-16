package com.multipleinterfacepractice;

public class SocialMediaMain {

	public static void main(String[] args) {

		ReelsFeature rs;
		rs = new SocialApp();
		rs.uploadLReels();
		
		ChatFetures cf;
		cf = new SocialApp();
		cf.sendMessages();		
	}
}
