package org.test;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Sample extends BaseClass{
	
	public static void main(String[] args) {
		
		WebDriver driver = browserLaunch();
		urlLaunch("https://www.facebook.com/");
		wait(10);
		
		
		WebElement txtUser = driver.findElement(By.id("email"));
sendKeys(txtUser, "priya@gmail.com");		
		WebElement txtPass = driver.findElement(By.id("pass"));
sendKeys(txtPass, "ashok");		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
