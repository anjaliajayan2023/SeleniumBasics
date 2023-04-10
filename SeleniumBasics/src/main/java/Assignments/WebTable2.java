package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//print all details of Cedric Kelly
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.findElements(By.xpath("//table//tbody//tr[4]/td"));
		List<WebElement>details=driver.findElements(By.xpath("//table//tbody//tr[4]/td"));
		for(WebElement element:details) {
			System.out.println(element.getText());
		}

	}

}
