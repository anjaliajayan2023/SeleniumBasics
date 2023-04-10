package basicsyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
driver.manage().window().maximize();
//to get the current URL of loaded page 
driver.get("https://www.amazon.in/");
//refer web element
WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));//searchfield-reference
searchfield.sendKeys("Headphones");//to enter the text-sendkeys
//WebElement searchbutton=driver.findElement(By.id("nav-search-submit nav-sprite"));
//searchbutton.click();
//terminates the browser
//driver.quit();
//driver.get("https://www.facebook.com/login/");
WebElement searchbutton=driver.findElement(By.cssSelector("nav-search-submit-button"));
searchbutton.sendKeys("Laptop");
searchbutton.click();
	}
}
