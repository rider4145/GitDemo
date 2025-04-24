package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		//chropath extension is similar to selectors hub extension
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		dynamicdropdown drop = new dynamicdropdown();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		drop.test(driver);
}

	public void test(WebDriver driver) throws InterruptedException
	{
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();		cannot use this line of code due to duplicate tag names
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
		
//		parent-child xpath -->another way of identifying the element using xpath without using index
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CJB'])")).click();
		
	}
}
