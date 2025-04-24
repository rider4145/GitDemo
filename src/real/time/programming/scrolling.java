package real.time.programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		exceute javascript scroll using browser-> open chrome-> inspect-> open console-> Run window.scrollBy(x,y)-> find values of x,y by doing trail and error method
/*		to scroll the particular element using javascript-> open chrome-> inspect-> open console
		-> Run document.querySelector(".tableFixHead").scrollTop=500 -> to scroll to bottom
		-> Run document.querySelector(".tableFixHead").scrollBy(x,y) -> to scroll bottom using x and y values
		-> Run document.querySelector(".tableFixHead").scrollLeft=100 -> to scroll to right if there is horizontal scroll */
		
		//used to excute JS related scripts
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,500)");				//to scroll the window
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500"); //to scroll any particular element
		
		List<WebElement> td =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<td.size();i++)
		{
			int d=Integer.parseInt(td.get(i).getText());
			sum=sum+d;			
		}
		System.out.println(sum);
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		//Assertion of total value
		//get text-> split the text-> use trim to remove the spaces
		int d = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, d);
		
		
		
		
	}

}
