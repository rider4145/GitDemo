package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(6));
		String[] models= {"iphone","Samsung","nokia","black"};
		int j=0;
		String name =driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[7]/p/b[1]")).getText(); //to fetch username
		String pass =driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[7]/p/b[2]")).getText(); //to fetch passwrord
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[wfd-id='id3']")).click();
		 
//		w.until(ExpectedConditions.alertIsPresent()); Alternate way of defining to wait for alert
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
				
		WebElement drops = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		Select dropdown = new Select(drops);
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("signInBtn")));
		

		List<WebElement> names=driver.findElements(By.cssSelector("h4.card-title"));
		for(String model:models) {
			for(int i=0;i<names.size();i++)
			{		
				if(names.get(i).getText().toLowerCase().contains(model.toLowerCase())){					//contains() is case-senseitive convert to lower/upper case
					driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
					j++;
				}
			}
		}
		
		driver.findElement(By.cssSelector(".navbar-nav.ml-auto")).click();
	}

}
