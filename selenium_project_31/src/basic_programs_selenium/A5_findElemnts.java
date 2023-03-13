package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_findElemnts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.navigate().to("file:///D:/HTML/sam.html");
		//d1.findElement(By.tagName("a")).click();
		d1.findElement(By.id("ro")).click();
		d1.findElement(By.id("za")).click();
		
	}

}
