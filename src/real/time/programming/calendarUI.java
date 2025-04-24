package real.time.programming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarUI {

	public static void main(String[] args) {
		
        LocalDateTime now = LocalDateTime.now();		// to fetch the local data and time
        String date = now.toLocalDate().toString();		// to split only date
        String time = now.toLocalTime().toString();		// to split only time
        System.out.println(date + time);
		
		System.setProperty("WebDriver.chrome.driver", "C://Users//Trsit//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String month ="12";
		String Date="28";
		String year ="2028";

	}

}
