package cart;
//Add items to cart 
//check whether the items added to cart are same using names 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] names = { "Cucumber", "Brocolli","Fruit"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j=0;
		
//		greenkart kart= new greenkart();
//		kart.test(driver,names,j);
//		kart.items(driver,names,j);
		
		test(driver,names,j);  // use static keyword to avoid declaration of object
		items(driver,names,j);
}
		public static int test(WebDriver driver,String[] names,int j)
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


		public static void items(WebDriver driver,String[] names,int j) throws InterruptedException
		{	
			driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
			Thread.sleep(1000);
			List<WebElement> carts = driver.findElements(By.cssSelector(".cart-preview .cart-items .product-name"));
			for(String name: names)	
			{			
			for (WebElement cartitem : carts) {
				String cart =cartitem.getText();
				if(cart.contains(name))
				{
					System.out.println(cart);
				}
//				else
//				{
//					System.out.println(name +"Not found");
//				}
				}
			}
			if(j==names.length)		// to close the driver
			{	
				Thread.sleep(2000);
				driver.close();
			}
		}

}