package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		boolean data =driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		System.out.println(data);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		boolean data1 =driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		System.out.println(data1);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		
	}

}
