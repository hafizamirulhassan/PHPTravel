package com.phpt.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.TestUtil;

public class TestBase {

	public WebDriver driver;
	String baseURL="https://www.phptravels.net/home";
	
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PHPTravels\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implecite_Wait, TimeUnit.SECONDS);
		
		driver.get(baseURL);
	}
	
	
}


