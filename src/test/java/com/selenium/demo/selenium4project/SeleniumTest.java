package com.selenium.demo.selenium4project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	static WebDriver driver;
	@Test
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(Duration.ofSeconds(10));
		System.out.println("test test");
		driver.close();
	}
}
