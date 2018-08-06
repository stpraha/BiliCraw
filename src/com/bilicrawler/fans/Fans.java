package com.bilicrawler.fans;

public class Fans {
	private String name;
	private String registeTime;
	private Integer followNumber;
	private Integer fansNumber;
	private Integer collectionNumber;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegisterTime(String time) {
		this.registeTime = time;
	}
	
	public void setFollowNumber(int followNum) {
		this.followNumber = followNum;
	}
	
	public void setFansNumber(int fansNum) {
		this.fansNumber = fansNum;
	}
	
	public void setCollectionNumber(int collectionNum) {
		this.collectionNumber = collectionNum;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRegisterTime() {
		return registeTime;
	}
	
	public Integer getFollowNumber() {
		return followNumber;
	}
	
	public Integer getFansNumber() {
		return fansNumber;
	}
	
	public Integer getCollectionNumber() {
		return collectionNumber;
	}

}
