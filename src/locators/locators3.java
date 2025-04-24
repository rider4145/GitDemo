package locators;
//import Statements can be using command -> Ctrl+shift+o

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// sibling- parent to child traverse		
		//1. $x('//header/div/button[1]/following-sibling::button')	-> to display the following sibling after reaching to the specified button
		//2. $x('//header/div/button[1]/following-sibling::button[1]') -> to select the following sibling by providing the child no
		
		//sibling -child to parent traverse
		//1. $x('//header/div/button[1]/parent::div')
		//2. $x('//header/div/button[1]/parent::div/parent::header')
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String text= driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		String app= driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText();
		System.out.println(text);
		System.out.println(app);
//		Thread.sleep(1000);
//		driver.close();
	}

}
