//package com.bilicrawler.db;
//
//import java.util.*;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class MainApp {
//	@SuppressWarnings("all")
//	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		FansJDBCTemplate fansJDBCTemplate = (FansJDBCTemplate) context.getBean("fansJDBCTemplate");
//		
//		fansJDBCTemplate.deleteAll();
//		fansJDBCTemplate.create("Strp", "2016-5-25", 50, 200, 317);
//	}
//}
