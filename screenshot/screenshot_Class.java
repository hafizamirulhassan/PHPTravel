package screenshotpakage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot_Class {

	  public static void capturescreenshot(WebDriver driver, String ScreenshotName) {
			
			
			try {
				
				TakesScreenshot ts=(TakesScreenshot)driver; 
				File source=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./Screenshots/"+ScreenshotName+".png"));
				System.out.println("Screenshot Taken");	
			} 
			
			catch (Exception e) {
				System.out.println("excption while taking  screenshot"+e.getMessage());
			}
			
		}

  }

