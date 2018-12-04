package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverbasics {

	public static void main(String[] args) {
			
			
		//launch firefox
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pushkar\\Videos\\Setup files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")){
			System.out.println("correct title");
			System.out.println(title);
		}
		else{
			System.out.println("Incorrect title");
		}
		//driver.close();
		driver.quit();
		/*
		//Launch Google.com
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pushkar\\Videos\\Setup files\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.google.com");
		String ctitle = driver.getTitle();
		System.out.println(ctitle);
		cdriver.close();*/
	}

}
