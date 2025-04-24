package locators;
// import Statements can be using command -> Ctrl+shift+o

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException 					//added to prevent exception in line
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Ajith");					//id locator	//rahulshettyacademy
		driver.findElement(By.name("inputPassword")).sendKeys("123");					//name locator
		driver.findElement(By.className("signInBtn")).click();							//class name locator
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));				// implict wait for 4 sec 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	//css selector locator
		
		driver.findElement(By.linkText("Forgot your password?")).click();				//link text locator--use when u have link as tag name
		Thread.sleep(1000);																//not working(need to check once agin this line of code)
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jojo");					//xpath locator
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("jojo@gmail.com");			//another xpath locator format
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("7674898382");	//another css selector locator format
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("jojo@yahoo.com");						//another xpath locator format
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
//		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());						//another cssselector locator format
		
//		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();		//another xpath locator
		Thread.sleep(1000);
		
		//Refilling the login details	
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("yogitha");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");	//find element using regular expression
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.className("logout-btn")).click();
//		driver.close();	
	}	

}
