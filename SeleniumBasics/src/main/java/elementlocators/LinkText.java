package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		

driver.get("https://selenium.obsqurazone.com/check-box-demo.php");

WebElement chck1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
System.out.println(chck1.isDisplayed());
System.out.println(chck1.isEnabled());

int x=chck1.getLocation().getX();
System.out.println(x);

int y=chck1.getLocation().getY();
System.out.println(y);




	}

}
