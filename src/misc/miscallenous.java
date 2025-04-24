package misc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class miscallenous {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("WebDriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();		//delete all the cookies
//		driver.manage().deleteCookieNamed("asdf"); //delete specific cookie
		
		driver.get("https://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	//to take screenshot
		FileUtils.copyFile(src,new File("C:\\Users\\Trsit\\AppData\\Local\\Temp\\screen.png"));
		
	}

}
