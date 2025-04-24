package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;			//used for assertions feature

public class checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		
//		Assertions used to validate whether the data fetched is correct or not				
		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());			//check it is false
		Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());	//check it is true
		
//		to validate checkbox is selected or not used isSelected() element	
		boolean data= driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected();
		boolean data1= driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected();
		System.out.println(data + " " + data1);
		
//		count the no of checkbox 
		int count =driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		Assert.assertEquals(count, 5);
		Thread.sleep(2000);
		driver.close();
	}

}
