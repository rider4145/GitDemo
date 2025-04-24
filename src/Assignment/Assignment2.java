package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("Ajith");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("ajith@yahoo.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ajith@123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		WebElement drops = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(drops);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01-10-1999");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		String data = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		System.out.println(data);
		
	}

}
