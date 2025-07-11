package com.selenium.demo.selenium4project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class SeleniumTest  extends BaseClass{
	
	@Test
	public void launchBrowser() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(Duration.ofSeconds(10));
		System.out.println("test test");
	}
	
	@Test
	public void testcase1() throws InterruptedException {
		System.out.println("testcase 1");
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		System.out.println("testcase 2");
	}
}
