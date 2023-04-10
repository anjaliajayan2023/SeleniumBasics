package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		//office of Brielle Williamson
		
		WebElement office=driver.findElement(By.xpath("//table/tbody/tr[6]/td[3]"));
		String text=office.getText();
		System.out.println(text);
		
		//salary of all person
		
		driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		List<WebElement>salary=driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		for(WebElement element:salary) {
			System.out.println(element.getText());
		}
		
		

	}

}
