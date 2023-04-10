package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		///isSelected Example
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singlecheckbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		WebElement checkbox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		
		WebElement checkbox4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		WebElement checkbox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
	
		boolean b1=checkbox1.isSelected();
		boolean b2=checkbox2.isSelected();
		boolean b3=checkbox3.isSelected();
		boolean b4=checkbox4.isSelected();
		boolean b5=singlecheckbox.isSelected();
		
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}
		if(!checkbox2.isSelected()) {
			checkbox2.click();
		}
		if(!checkbox3.isSelected()) {
			checkbox3.click();
		}
		if(!checkbox4.isSelected()) {
			checkbox4.click();
			
		}
		if(!singlecheckbox.isSelected()) {
			singlecheckbox.click();
			
		}
		System.out.println(checkbox2.isSelected());
		System.out.println(checkbox4.isSelected());
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox3.isSelected());
		System.out.println(singlecheckbox.isSelected());
	}

}


