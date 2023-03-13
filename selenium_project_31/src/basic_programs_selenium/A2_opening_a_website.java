package basic_programs_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_opening_a_website {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
	}

}
