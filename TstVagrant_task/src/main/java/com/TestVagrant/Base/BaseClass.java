package com.TestVagrant.Base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String imdbCountry;
	public static String wikiCountry;
	public static String wikireleasedate;
	public static String imdbreleasedate;
	
	
public BaseClass() throws IOException {
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("D:\\Anil\\JAVA_Selenium\\Selenium_Workspace\\TestVagrant\\src\\main\\java\\com\\TestVagrant\\Config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public static void initialization(String browser) {


	WebDriverManager.chromedriver().setup();
	if(browser.contains("Chrome")) {
		driver= new ChromeDriver();
	}
	else if(browser.contains("ff")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else {
		System.out.println("no browser is defined");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	
}
	


////
public static void initializ(String browser){

	
	WebDriverManager.chromedriver().setup();
	if(browser.contains("Chrome")) {
		driver= new ChromeDriver();
	}
	else if(browser.contains("ff")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else {
		System.out.println("no browser is defined");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("urll"));
	
	}
}

	
//	
//	
//	
//







