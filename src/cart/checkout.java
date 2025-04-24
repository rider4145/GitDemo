package cart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkout {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] names = { "Cucumber", "Brocolli","Fruit"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//Below are the syntax for implicit wait 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Below alternate syntax fo explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));	
		int j=0;
		test(driver,names,j);
		driver.findElement(By.cssSelector("a[class='cart-icon']")).click();	//alternate cssselector "img[alt='Cart']"		
		coupon(driver,w);

	}
		public static int test(WebDriver driver, String [] names, int j)
		{
			List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
			for(String name: names) {
				for (int i = 0; i < product.size(); i++) {
					String[] nam = product.get(i).getText().split("-");
					if (nam[0].contains(name)) {
//						driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
						driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
						j++;
					}
				}
			}
			return j;	
		}
		
		public static void coupon(WebDriver driver,WebDriverWait w)
		{	
			String[] span={".totAmt",".discountPerc",".discountAmt"};
			driver.findElement(By.cssSelector(".cart-preview.active .action-block")).click();  //alternate xpath "//button[contains(text(),'PROCEED TO CHECKOUT')]"
			
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));	//explicit wait
			
			driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
//			driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacadem");
			driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

			//	Explicit wait syntax
//			WebDriverWait w = new WebDriverWait(driver, 5);   (throwing error msg)	
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
			
			String text=driver.findElement(By.cssSelector(".promoInfo")).getText();	
			if(text.equalsIgnoreCase("Code applied ..!"))
			{
				System.out.println("Code applied successfully"); 
				for(String lol:span) {
					String txt = driver.findElement(By.cssSelector(lol)).getText();
					System.out.println(txt);
				}
			}
			else
			{	
				System.out.println("Invalid Code");
			}
		}		
}	
