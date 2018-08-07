package com.bilicrawler.db;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bilicrawler.fans.*;

public class FansStoreToMysql {
	@SuppressWarnings("all")
	
	private String name;
	private String registeTime;
	private String followNumber;
	private String fansNumber;
	private String mid;
	
	public void getOneFan(Fans fan) {
		this.name = fan.getName();
		this.registeTime = fan.getRegisterTime();
		this.followNumber = fan.getFollowNumber();
		this.fansNumber = fan.getFansNumber();
		this.mid = fan.getMid();
	}
	
	public void fanStore() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		FansJDBCTemplate fansJDBCTemplate = (FansJDBCTemplate) context.getBean("fansJDBCTemplate");
		
		//fansJDBCTemplate.deleteAll();
		fansJDBCTemplate.create(name, registeTime, followNumber, fansNumber, mid);
	}
}
