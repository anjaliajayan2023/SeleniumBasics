package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocator {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
driver.manage().window().maximize();
/*driver.get("https://www.facebook.com/login/");
WebElement email=driver.findElement(By.xpath("//input[@name='email']"));//xpath using attributes
email.sendKeys("abc@gmail.com");
WebElement paswd=driver.findElement(By.xpath("//input[@id='pass']"));
paswd.sendKeys("xyz");
WebElement loginbutton=driver.findElement(By.xpath("//button[text()='Log in']"));//xpath using text
loginbutton.click();
WebElement forgotpaswd=driver.findElement(By.xpath("//a[text()='Forgotten password']"));//xpath using tagname
forgotpaswd.click();*/
		
driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
WebElement entermsg=driver.findElement(By.xpath("//input[@id='single-input-field']"));
entermsg.sendKeys("Typing message");
WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']"));
showmsg.click();

driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
WebElement singlecheckbox=driver.findElement(By.id("gridCheck"));
singlecheckbox.click();
WebElement checkboxone=driver.findElement(By.className("check-box-list"));
checkboxone.click();
WebElement checkboxtwo=driver.findElement(By.id("check-box-two"));
checkboxtwo.click();
WebElement checkboxthree=driver.findElement(By.id("check-box-three"));
checkboxthree.click();
WebElement checkboxfour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
checkboxfour.click();

	}

}
