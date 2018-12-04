package com.seleniumlearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pushkar\\Videos\\Setup files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title = driver.getTitle();
		driver.findElement(By.name("proceed")).click();;
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		String text =a.getText();
		
		if(text.equals("Please enter aa valid user name")){
			System.out.println("Text found");
		}
		else{
			System.out.println("No Popup displayed");
		}
		Thread.sleep(5000);
		a.accept();//click on ok or accept
		
		
		//a.dismiss();//Cancel button on popup
	}

}
