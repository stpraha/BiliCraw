package com.bilicrawler.crawl;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.*;
import java.lang.*;

import com.bilicrawler.db.FansJDBCTemplate;
import com.bilicrawler.fans.*;


public class UrlProcess {
	private String url = "";
	
	public static void main(String[] args) {
		FanInforGet fan = new FanInforGet();
		
		
		try {
			fan.fanInfoGet("122879");
		} catch (IOException e) {
			//System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void process() throws IOException {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		Url initialUrl = (Url) context.getBean("initialUrl");
//		
//		System.out.println(initialUrl.getUrl());
//		//url = initialUrl.getUrl();
//		URL url = new URL(initialUrl.getUrl());
//		
//		CloseableHttpClient client = HttpClients.createDefault();
//		HttpGet httpGet = new HttpGet(initialUrl.getUrl());
//		CloseableHttpResponse httpResponse = client.execute(httpGet);
//		
//		System.out.println(httpResponse.toString());
//		
//		HttpEntity httpEntity = httpResponse.getEntity();
//		
//		System.out.println(EntityUtils.toString(httpEntity));	
//	}
}
