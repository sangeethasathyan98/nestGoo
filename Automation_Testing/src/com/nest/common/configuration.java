package com.nest.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class configuration {

	public static WebDriver CreateFirefox() {
		return new FirefoxDriver();
		
	}
	public static WebDriver CreateChrome() {
		return new ChromeDriver();
		
	}
	public static WebDriver CreateEdge() {
		return new EdgeDriver();
		
	}
}
