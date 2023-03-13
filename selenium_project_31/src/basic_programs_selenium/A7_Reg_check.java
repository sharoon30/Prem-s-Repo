package basic_programs_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A7_Reg_check {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/HTML/Reg.html");
		driver.findElement(By.id("a")).click();
		driver.findElement(By.id("b")).click();
		driver.findElement(By.id("c")).click();
		driver.findElement(By.className("master")).click();
		driver.close();
		
	}
}
