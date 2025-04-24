package ajax;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

// to perform mouse actions		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
// build is used tell the driver is ready and perform is used to perform the task
		a.moveToElement(move).build().perform(); 
													

// wait until sign-in button is visible			
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-action-inner")));
//		driver.findElement(By.cssSelector(".nav-action-inner")).click();

// To handle the keyboard buttons
// Performed [click shift and enter text-> doubleclick text-> release shift-> click left arow-> enter text-> click enter button]   
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello")
				.doubleClick().keyUp(Keys.SHIFT).keyDown(Keys.ARROW_LEFT).sendKeys("hi").keyDown(Keys.ENTER).build()
				.perform();

// click perform left-click action and contextclick perform right-click action
		a.moveToElement(move).contextClick().build().perform();
	}

}
