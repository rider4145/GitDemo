package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//drop down with select tag - static(if the tag name is select it will be always static)
		WebElement drops = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(drops);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());		// to get the first selected drop down option
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");											// select the drop down using the attribute value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
	}

}
