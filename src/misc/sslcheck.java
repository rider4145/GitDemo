package misc;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslcheck {

	public static void main(String[] args) 
	{
		//to by-pass the certificate warning when launching the website
		ChromeOptions option =  new ChromeOptions();	// based on browser change the name to firefox and edge
		option.setAcceptInsecureCerts(true);		// setting the value to true to by pass the  certificate
		
		System.setProperty("WebDriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);	//to update the by-pass send the value to driver function
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
//		option.addExtensions("");    used to add extension to the browser, pass the extension file path
//		Proxy proxy = new Proxy();	 used to set up the proxy for browser set at the beginning of code
//		proxy.setHttpProxy(null);	check with network engineer to set which type of proxy 
//		option.setCapability("proxy", proxy);
//		https://developer.chrome.com/docs/chromedriver/capabilities  -> to know more about capabilities
		
		
	}

}
