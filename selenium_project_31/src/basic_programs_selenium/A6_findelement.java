package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_findelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.navigate().to("file:///D:/HTML/sam.html");
	String s1=d1.getCurrentUrl();
	System.out.println(s1);
	d1.findElement(By.className("main")).click();
	d1.findElement(By.className("method")).click();
	//	d1.findElement(By.id("sh")).click();
	//	d1.findElement(By.id("ro")).click();
	//	d1.close();
		
	}

}
