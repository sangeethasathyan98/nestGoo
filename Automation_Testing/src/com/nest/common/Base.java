package com.nest.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	private WebDriver driver;
	public static Properties properties;
	public void OnSetUp() throws IOException {
		properties=new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\com\\nest\\common\\config.properties");
		FileInputStream inputstream= new FileInputStream(file);
        properties.load(new InputStreamReader(inputstream,Charset.forName("UTF-8")));
        if(properties.getProperty("browser").equals("chrome")) {
        driver= new ChromeDriver();
        }
        else if(properties.getProperty("browser").equals("firefox")) {
        driver= new FirefoxDriver();	
        }
        else if(properties.getProperty("browser").equals("edge")) {
        driver= new EdgeDriver();	
        }
        getDriver().get(properties.getProperty("url"));
	}	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}		
}
