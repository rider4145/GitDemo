package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		// sytx to find all the elements (li[class='ui-menu-item'] a)
		// used to fetch
		List<WebElement> country =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//		country will be stored all the webelements fetched when text is entered 
//		each time data is passed to countries web element and enter into for loop, fetched text to compare
		for(WebElement countries: country)
		{
			if(countries.getText().equalsIgnoreCase("India"))
			{
				countries.click();
				String count =countries.getText();
				System.out.println(count);
				break;
			}
		}
		
	}

}
