package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropYellow {
	String color;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		WebElement colorelement=driver.findElement(By.xpath("//select[@id='single-input-field']"));
Select colordropdown=new Select(colorelement);
colordropdown.selectByIndex(2);
colordropdown.selectByValue("Yellow");
}
}
