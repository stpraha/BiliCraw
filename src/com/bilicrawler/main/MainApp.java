package com.bilicrawler.main;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.bilicrawler.*;
import com.bilicrawler.db.FansStoreToMysql;
import com.bilicrawler.fans.Fans;
import com.bilicrawler.crawl.*;

public class MainApp {
	public static void main(String[] args) {
//		FansStoreToMysql store = new FansStoreToMysql();
//		UserInfo userInfo = new UserInfo();
//		
//		Fans fan = null;
//		for(int i = 1; i <= 2222; i++) {
//			if(i%100 == 0) {
//				System.out.println("now the mid is: " + i);
//			}
//
//			try {
//				fan = userInfo.extrateData("" + i);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if(fan.getFansNumber().length() > 3) {
//				System.out.println("Create Record Name = " + fan.getName() + "mid = " + fan.getMid());
//				store.getOneFan(fan);
//				store.fanStore();
//			}
//		}
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 2; i++) {
			exec.execute(new Crawl(i));
		}
	}
}

class Crawl implements Runnable {
	private int taskNum;
	Crawl(int i) {
		this.taskNum = i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		FansStoreToMysql store = new FansStoreToMysql();
		UserInfo userInfo = new UserInfo();
		
		Fans fan = null;
		for(int i = taskNum*1000000+1; i <= (taskNum+1)*1000000; i++) {
			if(i%100 == 0) {
				System.out.println("now the mid is: " + i);
			}
	
			try {
				fan = userInfo.extrateData("" + i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(fan.getFansNumber().length() > 3) {
				System.out.println("Create Record Name = " + fan.getName() + "  mid = " + fan.getMid());
				store.getOneFan(fan);
				store.fanStore();
			}
		}
	}	
}