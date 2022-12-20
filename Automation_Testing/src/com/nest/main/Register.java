package com.nest.main;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.nest.common.Base;
import com.nest.constants.AutomationConstants;

class Register extends Base {

	@Test
	void test() throws IOException, InterruptedException {
		OnSetUp();
	
		getDriver().switchTo().frame("moneyiframe");
		getDriver().switchTo().frame(0);
		WebElement element=getDriver().findElement(By.xpath("//span[@id='nseindex\']"));
        System.out.println(element.getText());
        getDriver().switchTo().parentFrame();
        WebElement element1=getDriver().findElement(By.linkText("PIX: Many injured in vehicle pile-up on Pune bridge"));
        System.out.println(element1.getText());
        
        
        
        
        
        
        
        
        
        
        
       
		
	      

	}

}
