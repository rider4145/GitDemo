package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Ctrl+shift+F -> to format the code in eclipse
public class handlingalerts {

	public static void main(String[] args) throws InterruptedException {
		String name = "Ajith";
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.id("alertbtn")).click();

//		swtich the driver to alert pop up use switch() method
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		Thread.sleep(1000);

//		to accept/click the  option in alert
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());

//		to click the cancel option in alert
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.close();

	}

}
