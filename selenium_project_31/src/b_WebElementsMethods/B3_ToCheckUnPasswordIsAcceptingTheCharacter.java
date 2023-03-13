package b_WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B3_ToCheckUnPasswordIsAcceptingTheCharacter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("The window is launched ");
		driver.manage().window().maximize();
		System.out.println("The windows is maximised");
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("The Actitime is opened ");
		String un="rozario123@gmail.com";
		String psw="SharoonRozario";
	WebElement Email=	driver.findElement(By.xpath("//input[@ id='username']"));
	Email.sendKeys(un);
	WebElement pass=driver.findElement(By.xpath("//input[@ name='pwd']"));
	pass.sendKeys(psw);
	String title="actiTIME -  Enter Time-Track";
	
	
	}

}
