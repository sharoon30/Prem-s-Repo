package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A13_usingCssSelector {
	public static void main(String[] args) {
		String s1="nehareddy@gmail.com";
		String s2="Neha123";
	     System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://demowebshop.tricentis.com/");
	     driver.findElement(By.linkText("Register")).click();
	     driver.findElement(By.id("gender-male")).click();
	     WebElement Fname=driver.findElement(By.id("FirstName"));
	     Fname.sendKeys("neha");
	     WebElement Lname=driver.findElement(By.id("LastName"));
	     Lname.sendKeys("reddy");
	     WebElement Etf=driver.findElement(By.cssSelector("#Email"));
	     Etf.sendKeys(s1);
	     WebElement Pass=driver.findElement(By.cssSelector("#Password"));
	     Etf.sendKeys(s2);
	     WebElement Cpass=driver.findElement(By.cssSelector("input#Password"));
	     Etf.sendKeys(s2);
	     
	    
	     
	     
	     
	     
	    
	}

}
