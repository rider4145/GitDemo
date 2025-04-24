package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowactivity {

	public static void main(String[] args) throws InterruptedException {
		// the below line is suppressed by selenium manager (beta state)
		//System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");					// will wait until all the components are fully loaded
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");		//similar to get() method but it won't wait till all the components are fully loaded
		driver.navigate().back();								// navigate back to the previous page
		driver.navigate().forward();							//navigate forward to next page
		driver.close();
		

	}

}
