package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		//driver.findElement(By.xpath("//label[contains(@for,'check-box-one')]"));
		
		List<WebElement>box=driver.findElements(By.xpath("//label[contains(@for,'check-box')]"));
		for(int i=0;i<5;i++) {
			String text=box.get(i).getText();
			System.out.println(text);
		}

	}

}
