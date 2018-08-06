package com.bilicrawler.crawl;

import java.io.IOException;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class FanInforGet {
	public void fanInfoGet(String mid) throws IOException {
		//System.out.println(initialUrl.getUrl());
		//url = initialUrl.getUrl();
		String url = "https://api.bilibili.com/x/web-interface/card?mid=" + mid + "&jsonp=jsonp&article=true";
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse httpResponse = client.execute(httpGet);
		
		System.out.println(httpResponse.toString());
		
		HttpEntity httpEntity = httpResponse.getEntity();
		
		System.out.println(EntityUtils.toString(httpEntity));	
	}
}
