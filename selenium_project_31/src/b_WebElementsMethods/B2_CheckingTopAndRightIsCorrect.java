package b_WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2_CheckingTopAndRightIsCorrect {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	System.out.println("chromedriver is launched");
	driver.manage().window().maximize();
	System.out.println("windows maximised");
	driver.get("https://demo.actitime.com/login.do");
	System.out.println("acti time website is opened");
	WebElement Email=driver.findElement(By.id("username"));
	System.out.println("email text field is found");
	int X1=Email.getRect().getX();
	int W1=Email.getRect().getWidth();
    WebElement Pass=driver.findElement(By.xpath("//input[@name='pwd']"));
    System.out.println("password text field is found ");
    int X2=Pass.getRect().getX();
    int W2=Pass.getRect().getWidth();
    if((X1+W1)==(X2+W2)) {
    	System.out.println("the top allignment of the Email text field and password Textfield is correct");
    }
    else {
    	System.out.println("the allignemet is incorrect ");
    }
    driver.close();
}
	
}
