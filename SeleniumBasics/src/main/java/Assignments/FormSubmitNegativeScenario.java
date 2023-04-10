package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormSubmitNegativeScenario {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		
	driver.get("https://selenium.obsqurazone.com/form-submit.php");
WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	submitbutton.click();
	
	List<WebElement>errormessage=driver.findElements(By.xpath("//div[@class='card-body']/form/div/div"));
	System.out.println(errormessage.size());
		for(WebElement element:errormessage) {
			System.out.println(element.getText());
			
		}
		
	}
}


