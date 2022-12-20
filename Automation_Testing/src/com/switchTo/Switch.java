package com.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
	  public static void main(String[] args) {
          // TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
//          driver.get("https://www.rediff.com/");
//          driver.manage().window().maximize();
//          //driver.switchTo().frame("moneyiframe");
//          driver.switchTo().frame(0);
//          
//          System.out.println(driver.findElement(By.id("bseindex")).getText());
//          System.out.println(driver.findElement(By.id("nseindex")).getText());
//          driver.switchTo().defaultContent();
//          driver.findElement(By.id("srchword")).sendKeys("boost");
         
        
       
      driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
      driver.manage().window().maximize();
      
      String childwindow;
          childwindow= driver.getWindowHandles().toArray()[1].toString();
          driver.switchTo().window(childwindow);
          


         
      }





 }
