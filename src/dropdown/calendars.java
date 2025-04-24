package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calendars {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
//		ui-state-default ui-state-highlight-->   no spacing allowed in the values 
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		calendars cal= new calendars();
		cal.updatesecond(driver);
	}

	public void updatesecond(WebDriver driver) throws InterruptedException
	{
		boolean roundtrip= driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).isEnabled();
		Assert.assertTrue(roundtrip);
		String style= driver.findElement(By.id("Div1")).getAttribute("style");
		if(style.contains("1"))
		{
			System.out.println(style);
			driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		  /*random date selection not working
			driver.findElement(By.xpath("//td [@data-month='9']//a[text()='18']")).click();*/		
		}
	}
}
