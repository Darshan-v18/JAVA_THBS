package com.ST.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\darshan_vishwa\\Downloads\\edgedriver_win64 (2)");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
	}

}
