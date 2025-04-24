package ajax;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String current = driver.getWindowHandle();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles(); // to fetch all the current tabs opened in the window
		
// Get the index values of each windows using iterator
		Iterator<String> it =window.iterator();
		String parentid =it.next();
		String childid =it.next();
		driver.switchTo().window(childid);	//switch window to child window
		String mail = driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
		String email =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0].trim();
		System.out.println(email);
		driver.switchTo().window(parentid); //switch window to parent window
		driver.findElement(By.id("username")).sendKeys(email);
		
	}

}
