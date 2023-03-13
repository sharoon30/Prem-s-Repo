package b_WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_getRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
WebElement login=driver.findElement(By.partialLinkText("Log"));
login.click();
WebElement Et=driver.findElement(By.id("Email"));
int d1=Et.getRect().getX();
int d2=Et.getRect().getY();
int d3=Et.getRect().getHeight();
 System.out.println(d1+" "+d2+" "+d3);
 
driver.close();
	}
}
