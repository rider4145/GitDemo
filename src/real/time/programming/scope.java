package real.time.programming;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// to count no of links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// to count no of links in footer of page
		// To create a subset driver with the main driver using WebElement
		WebElement footdriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		System.out.println(footdriver.findElements(By.tagName("a")).size());

		// to count no of links in the footer of a particular column
		WebElement footerlinks = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int links = footerlinks.findElements(By.tagName("a")).size();
		System.out.println(links);

		// click on links and check the page is opening
		Actions a = new Actions(driver); // used to perform actions
		for (int i = 1; i < links; i++) {
			//way opening all the links in different tabs of the browser
			 String ctrlEnter = Keys.chord(Keys.CONTROL, Keys.ENTER);
			 footerlinks.findElements(By.tagName("a")).get(i).sendKeys(ctrlEnter);		 

			 //Another way opening all the links in different tabs of the browser
/*			 WebElement link = footerlinks.findElements(By.tagName("a")).get(i);
			 a.moveToElement(link).keyDown(Keys.CONTROL).click();  */
		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it =window.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
