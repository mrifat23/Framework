package com.framework.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public static Properties prop; //Making properties class global
public static WebDriver driver;

	public TestBase()  {
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\framework\\config\\Framework.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	public void initz() {
		String browserName = prop.getProperty("browser1");
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chromedriver.exe" );
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Util.implicitlyWait_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Util.pageLoadTimeout_wait, TimeUnit.SECONDS);

		}
		else if (browserName.equals("FF"));
			System.out.println("Browser not found");
		
			
		
	}
		
	public static void launchApplication(String URL) {
		driver.get(prop.getProperty("qaurl"));
	

	}
}

//Properties class
//FileInputStream class