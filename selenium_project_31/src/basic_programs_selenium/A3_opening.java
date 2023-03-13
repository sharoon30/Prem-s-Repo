package basic_programs_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_opening {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
		String s1=d1.getCurrentUrl();
		System.out.println(s1);
		String s2=d1.getTitle();
		System.out.println(s2);
		d1.get("https://www.testyantra.com/");
		
		
		
		
	}

}
