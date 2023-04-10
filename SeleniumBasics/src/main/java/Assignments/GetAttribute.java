package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAttribute {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
				
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				
		driver.manage().window().maximize();
				driver.get("https://selenium.obsqurazone.com/index.php");
		WebElement Obsquralogo=driver.findElement(By.xpath("//div[@class='top-logo']//img"));
		//printing value of src attribute
		String logofield=Obsquralogo.getAttribute("src");
		System.out.println(logofield);
		//printing value of alt attribute
		String altvalue=Obsquralogo.getAttribute("alt");
		System.out.println(altvalue);
			}

		}


