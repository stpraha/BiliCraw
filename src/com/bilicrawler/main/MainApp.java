package com.bilicrawler.main;

import com.bilicrawler.*;
import com.bilicrawler.db.FansStoreToMysql;
import com.bilicrawler.fans.Fans;

public class MainApp {
	public static void main(String[] args) {
		FansStoreToMysql store = new FansStoreToMysql();
		Fans fan = new Fans();
		fan.setName("SDFA");
		fan.setFollowNumber(123);
		fan.setFansNumber(234);
		fan.setRegisterTime("2015-9-7");
		fan.setCollectionNumber(13213);
		
		store.getOneFan(fan);
		store.fanStore();
	}
}
