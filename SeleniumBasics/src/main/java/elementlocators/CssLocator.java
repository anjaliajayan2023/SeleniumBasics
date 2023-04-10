package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssLocator {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");//to get the url
        WebElement searchfield=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchfield.sendKeys("Pen");
        //WebElement searchbutton=driver.findElement(By.cssSelector("#nav-search-submit-button"));
        //searchbutton.click();
        //driver.close();
        
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchbar=driver.findElement(By.className("gLFyf"));
        searchbar.sendKeys("Javatpoint");
        
        driver.get("https://www.ebay.com/");
        WebElement searchtext=driver.findElement(By.id("gh-ac"));
        searchtext.sendKeys("Poco F1");
        searchtext.click();
        
        
        
        
	}

}
