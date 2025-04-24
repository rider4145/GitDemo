package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumInt{

	public static void main(String[] args)
	{
		//Invoke chrome--> access methods ChromeDriver driver= new ChromeDriver();
					
		//invoke the chrome driver manually from local
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		
		//webdriver.chrom.driver--> value to path
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationstepbystep.com/");        //to hit the entered url
		System.out.println(driver.getTitle());                  //to fetch the title of the page
		System.out.println(driver.getCurrentUrl());				//to fetch the current url
		driver.close();											//to close the current window
		driver.quit();											//to close the associated windows
	}

}
