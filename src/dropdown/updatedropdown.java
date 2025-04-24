package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("	");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('divpaxOptions').style.display='block';");
		WebElement adultPlusButton = driver.findElement(By.id("hrefIncAdt"));
		adultPlusButton.click();
		
		
//		WebElement element = driver.findElement(By.id("hrefIncAdt"));
//		if (element.isEnabled()) {
//		    element.click();
//		}
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		for(i=1;i<4;i++) 
//		{
//			driver.findElement(By.id("hrefIncChd")).click();
//		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
