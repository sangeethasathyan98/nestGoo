package com.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("(//a[@class='button e.g. button_hilite button_pale small_button'])[1]")).click();
	driver.findElement(By.linkText("Click Here")).click();
	}

}
