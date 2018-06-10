package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/bravo/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com");

	}

}
