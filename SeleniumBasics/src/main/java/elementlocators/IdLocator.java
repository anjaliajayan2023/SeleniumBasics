package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocator {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
//driver.manage().window().maximize();
//to get the current URL of loaded page 
driver.get("https://www.amazon.in/");
//refer web element-searchbar
WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));//searchfield-reference
searchfield.sendKeys("Iphone");//to enter the bytext-sendkeys
WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
searchbutton.click();
//System.out.println(searchbutton.isDisplayed());


//terminates the browser
//driver.quit();
driver.get("https://www.facebook.com/login/");
WebElement emailidfield=driver.findElement(By.name("email"));//fb username field-inspect
emailidfield.sendKeys("mailid@gmail.com");
//emailidfield.clear();
WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("abcdefg");
WebElement loginbutton=driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt"));
loginbutton.sendKeys("login");
driver.quit();

driver.get("https://selenium.obsqurazone.com/check-box-demo.php");

WebElement chck1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
System.out.println(chck1.isDisplayed());

	}

}
