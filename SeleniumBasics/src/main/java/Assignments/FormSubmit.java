package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormSubmit {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
firstname.sendKeys("Arya");
WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
	lastname.sendKeys("Krishna");
	WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
	username.sendKeys("aryakrish");
	WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
	city.sendKeys("Kollam");
	WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
	state.sendKeys("Kerala");
	WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
	zip.sendKeys("123456");
	WebElement agreebutton=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
	agreebutton.isSelected();
	if(!agreebutton.isSelected()) {
		agreebutton.click();
	}
	WebElement submitform=driver.findElement(By.xpath("//button[text()='Submit form']"));
	submitform.click();
	WebElement successmsg=driver.findElement(By.xpath("//div[@id='message-one']"));
	String message=successmsg.getText();
	System.out.println(message);
	
	
	
	}

}
