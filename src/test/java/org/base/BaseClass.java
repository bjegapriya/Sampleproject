package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

public static WebDriver browserLaunch() {

	WebDriverManager.chromedriver().setup();
	
	 driver = new ChromeDriver();
	return driver;
}

public static void urlLaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}

public static void wait(int a) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));

}

public static void sendKeys(WebElement a, String name) {
	a.sendKeys(name);

}

public static void close() {
driver.close();
}
}
