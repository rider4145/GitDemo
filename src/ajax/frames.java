package ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//to find the no of frames in the code
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	
		//unable to find the element becoz the element is present in the frame. we need to switch to frame
		//insted of webdriver u can use index to find the frame, frame index is started with zero index
//		driver.switchTo().frame(0);                                                    //using frame index value
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));    //using frame webdriver
		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		driver.switchTo().defaultContent();
		
/*		switching back to new frames and performing actions
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		a.dragAndDrop(driver.findElement(By.id("draggable-nonvalid")), driver.findElement(By.id("droppable"))).build().perform();
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		driver.switchTo().defaultContent();*/
		
	}

}
