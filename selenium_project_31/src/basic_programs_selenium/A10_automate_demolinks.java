package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10_automate_demolinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/register");
	    WebElement regLink=driver.findElement(By.linkText("Register"));
	    regLink.click();
	    WebElement loginLink=driver.findElement(By.partialLinkText("Log"));
	    loginLink.click();
	    WebElement shoppingCart=driver.findElement(By.partialLinkText("Shopping"));
	    shoppingCart.click();
	    WebElement wishlistLink=driver.findElement(By.linkText("Wishlist"));
	    wishlistLink.click();
	    //Automating the major tab
	    WebElement Books=driver.findElement(By.linkText("BOOKS"));
	    Books.click();
	    WebElement Computer=driver.findElement(By.linkText("COMPUTERS"));
	    Computer.click();
	    WebElement Electronics=driver.findElement(By.linkText("ELECTRONICS"));
	    Electronics.click();
	    WebElement AandS=driver.findElement(By.partialLinkText("APPAREL"));
	    AandS.click();
	    WebElement DigitalDownloads=driver.findElement(By.partialLinkText("DIGITAL"));
	    DigitalDownloads.click();
	    WebElement Jewelry=driver.findElement(By.linkText("JEWELRY"));
	    Jewelry.click();
	    WebElement GiftCard=driver.findElement(By.partialLinkText("GIFT"));
	    GiftCard.click();
	    //Automating the minor tab links
	    WebElement books=driver.findElement(By.linkText("Books"));
	    books.click();
	    WebElement computer=driver.findElement(By.linkText("Computers"));
	    computer.click();
	    WebElement electronics=driver.findElement(By.linkText("Electronics"));
	    electronics.click();
	    WebElement Aand=driver.findElement(By.partialLinkText("Apparel"));
	    Aand.click();
	    WebElement digitalDownloads=driver.findElement(By.partialLinkText("Digital"));
	    digitalDownloads.click();
	    WebElement jewelry=driver.findElement(By.linkText("Jewelry"));
	    jewelry.click();
	    WebElement giftCard=driver.findElement(By.partialLinkText("Gift"));
	    giftCard.click();
	    
	    driver.close();
		   
	    
		   
	    
	    
	    }

}
