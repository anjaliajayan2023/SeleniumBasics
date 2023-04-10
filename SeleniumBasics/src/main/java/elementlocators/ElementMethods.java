package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementMethods {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
					
					ChromeOptions co=new ChromeOptions();
					co.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver(co);
					driver.manage().window().maximize();
					
					driver.get("https://the-internet.herokuapp.com/checkboxes");
					WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
					//checkbox1.click();
					WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
					//checkbox2.click();
					boolean b1=checkbox1.isSelected();
					
					boolean b2=checkbox2.isSelected();
					System.out.println(b2);
					if(!checkbox1.isSelected()) {
						checkbox1.click();
					}
					System.out.println(b1);
					if(!checkbox2.isSelected()) {
						checkbox2.click();
					}
					

	}

}
