package com.phpt.currency;

import org.testng.annotations.Test;
import com.phpt.base.TestBase;
import utility.TestUtil;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class HomePage_Verification extends TestBase {


	@BeforeMethod
	public void Browser_setUp() throws InterruptedException {

		launchBrowser();
		Thread.sleep(5000);
	}

	/*@Test(priority=1)
	public void HomePage_BuyNow_Button_Verification() throws InterruptedException {

		WebElement buy_Now =driver.findElement(By.linkText("BUY NOW"));
		Boolean actualValue=buy_Now.isEnabled();

		if (actualValue)
			System.out.println("Buy Now button is enabled");
		else
			System.out.println("Buy Now button is disabled");

		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void HomePage_Main_Menu_Verification() throws InterruptedException {

		List<WebElement> tabs =driver.findElements(By.xpath("//*[@id=\"mobileMenuMain\"]/nav"));
		for (int i=0; i<tabs.size();i++){
			System.out.println("Your tabs are:" + "\n" +  tabs.get(i).getText());
		}
	}
                         
	@Test(priority=3)
	public void Change_Currency() throws InterruptedException, IOException {


		Thread.sleep(2000);
		WebElement currency=driver.findElement(By.xpath("//a[contains(text(),'USD')]"));
		currency.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='SAR']")).click();
		Thread.sleep(3000);

		TestUtil.capturescreenshot(driver, "Change Currency");	

		System.out.println("Currency is changed to SAR.");

		WebElement buy_Now =driver.findElement(By.linkText("BUY NOW"));
		Boolean actualValue=buy_Now.isEnabled();


		// Buy Now button verification
		if (actualValue)
			System.out.println("Buy Now button is enabled");
		else
			System.out.println("Buy Now button is disabled");

		Thread.sleep(5000);

		// Main menu verification

		List<WebElement> tabs =driver.findElements(By.xpath("//*[@id=\"mobileMenuMain\"]/nav"));
		for (int i=0; i<tabs.size();i++){
			System.out.println("Your tabs are:" + "\n" +  tabs.get(i).getText());
		}


		Thread.sleep(2000);
		WebElement defaultcurrency=driver.findElement(By.xpath("//a[contains(text(),'ريال')]"));
		defaultcurrency.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='USD']")).click();
		Thread.sleep(3000);

		TestUtil.capturescreenshot(driver, "Default Currency");	

		System.out.println("Currency is changed to default.");

		WebElement buy_Now2 =driver.findElement(By.linkText("BUY NOW"));
		Boolean actualValue2=buy_Now2.isEnabled();

		// Buy Now button verification
		if (actualValue2)
			System.out.println("Buy Now button is enabled");
		else
			System.out.println("Buy Now button is disabled");

		Thread.sleep(5000);

		// Main menu verification

		List<WebElement> tab =driver.findElements(By.xpath("//*[@id=\"mobileMenuMain\"]/nav"));
		for (int i=0; i<tab.size();i++){
			System.out.println("Your tabs are:" + "\n" +  tab.get(i).getText());
		}
	}

	@Test(priority=4)
	public void Change_Language() throws InterruptedException, IOException {

		Thread.sleep(2000);
		WebElement language=driver.findElement(By.xpath("//text()[contains(.,'English')]/ancestor::a[1]"));
		language.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//text()[contains(.,'Arabic')]/ancestor::a[1]")).click();
		Thread.sleep(3000);

		TestUtil.capturescreenshot(driver, "Change Language Default to Arabic");	

		System.out.println("Language is changed default to Arabic.");

		Thread.sleep(2000);
		WebElement def_language=driver.findElement(By.xpath("//text()[contains(.,'Arabic')]/ancestor::a[1]"));
		def_language.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//text()[contains(.,'English')]/ancestor::a[1]")).click();
		Thread.sleep(3000);

		TestUtil.capturescreenshot(driver, "Change Arabic to Default");	

		System.out.println("Language is changed Arabic to default");

		WebElement buy_Now2 =driver.findElement(By.linkText("BUY NOW"));
		Boolean actualValue2=buy_Now2.isEnabled();

		// Buy Now button verification
		if (actualValue2)
			System.out.println("Buy Now button is enabled");
		else
			System.out.println("Buy Now button is disabled");

		Thread.sleep(5000);

		// Main menu verification

		List<WebElement> tab =driver.findElements(By.xpath("//*[@id=\"mobileMenuMain\"]/nav"));
		for (int i=0; i<tab.size();i++){
			System.out.println("Your tabs are:" + "\n" +  tab.get(i).getText());
			Thread.sleep(20000);
		}


		// Verify chat button is clickable

		List<WebElement> element = driver.findElements(By.xpath("//iframe[@id = 'chat-widget']"));
		Thread.sleep(5000);
		if(element.size()>0){
			element.get(0).click();
		}

		Thread.sleep(3000);
		TestUtil.capturescreenshot(driver, "LIVE Chat Window");	
	}*/

	@Test(priority=5)

	public void Live_Chat_Verification() throws InterruptedException, IOException, AWTException {

		List<WebElement> element = driver.findElements(By.xpath("//iframe[@id = 'chat-widget']"));
		Thread.sleep(5000);
		if(element.size()>0){
			element.get(0).click();

			new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='chat-widget']")));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Open LiveChat chat widget']"))).click();
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text'][@name='name']"))).sendKeys("reretr");
			driver.findElement(By.xpath("//label/span[text()='WhatsApp Number:']//following::input[1]")).sendKeys("1234567");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class= 'lc-sgcxhz egtcv0s0']")))).click();
			driver.findElement(By.xpath("//option[text() = 'Yes']")).click();
			driver.findElement(By.xpath("//span[text()='Start the chat']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@class = 'lc-1ksfbg e1m92qam0']")).sendKeys("Test Message");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@aria-label = 'Send a message']")).click();
		}

	}
	
	

	@AfterMethod
	public void tearDown() {

		//driver.close();
	}

}
