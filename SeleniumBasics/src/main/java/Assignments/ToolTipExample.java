package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTipExample {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		
		//likeusonfb button
	driver.get(" https://selenium.obsqurazone.com/window-popup.php");
	WebElement likeusonfb=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String tooltip=likeusonfb.getAttribute("title");	
		System.out.println(tooltip);
		
		//follow all button
		
		WebElement followall=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		String tooltip1=followall.getAttribute("title");	
		System.out.println(tooltip1);
		
	}

}
