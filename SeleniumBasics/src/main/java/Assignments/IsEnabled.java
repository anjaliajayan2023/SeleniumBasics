package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
driver.manage().window().maximize();
//radiobutton-male
		
driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
WebElement radiobttnmale=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
System.out.println(radiobttnmale.isEnabled());
System.out.println(radiobttnmale.isDisplayed());
//radiobutton-female

WebElement radiobttnfemale=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
 boolean b=radiobttnfemale.isSelected();

if(!radiobttnfemale.isSelected()){
radiobttnfemale.click();
}


System.out.println(radiobttnfemale.isEnabled());
System.out.println(radiobttnfemale.isDisplayed());

WebElement showselectedbtn=driver.findElement(By.xpath("//button[@id='button-one']"));

System.out.println(showselectedbtn.isEnabled());
System.out.println(showselectedbtn.isDisplayed());



	}

}
