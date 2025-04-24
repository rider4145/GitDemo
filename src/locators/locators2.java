package locators;
//import Statements can be using command -> Ctrl+shift+o

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class locators2 
{
	public static void main(String[] args) throws InterruptedException
	{	
		String user="Ajith";
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		locators2 word = new locators2();
		String pass = word.password(driver);							
		//password.driver();     to call the 2nd function and make the method as static
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(user);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		System.out.println(pass);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.tagName("p")).getText());					//remove scope pom.xml file of testng to display all the assertions
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div.login-container > h2")).getText(), "Hello "+user+",");
		Thread.sleep(2000);
//		driver.findElement(By.className("logout-btn")).click();								//logout function using class locator
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); 				//another path locator to identify the element using text
		System.out.println("logged out");
		Thread.sleep(1000);
		driver.close();
	}
	public String password(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();				
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pass =driver.findElement(By.cssSelector("form p")).getText();
		String []text= pass.split("'");
		String password = text[1];
		driver.findElement(By.className("go-to-login-btn")).click();
		return password;		
	}
}
