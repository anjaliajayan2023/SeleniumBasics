package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListWebElements {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElements(By.xpath("//div[@class='form-group']//div//input[@class='check-box-list']"));
	List<WebElement>box=driver.findElements(By.xpath("//div[@class='form-group']//div//input[@class='check-box-list']"));
	System.out.println(box.size());
	
	for(WebElement element:box) {
		System.out.println(element.getText());
		element.click();
		
		
	}
	
	}

}
