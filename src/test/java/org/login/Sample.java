package org.login;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//code to start the server
		//AppiumServiceBuilder - pre defined class
		//withAppiumJs - method -instance method
		//Appium server js source code -main.js
		AppiumDriverLocalService build =new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\nandh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		//Server Start
		build.start();
		
		
		//UiAutomator2Options
		UiAutomator2Options uiAutomator2Option= new UiAutomator2Options();
		uiAutomator2Option.setCapability("deviceName", "Nan");
		uiAutomator2Option.setCapability("app", "C:\\Users\\nandh\\eclipse-workspace\\Octoberappium20244\\src\\test\\resources\\ApiDemos-debug.apk");
		
		
		//initialization the driver
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),uiAutomator2Option);
		
		
		Thread.sleep(20000);
		
		//server stop
		build.stop();
		
		
	}

}
