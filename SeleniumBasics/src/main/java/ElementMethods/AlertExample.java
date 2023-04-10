package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertExample {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement JSAlert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement JsConfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement JSprompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		JSAlert.click();
		driver.switchTo().alert().accept();//alert gets accepted
		String Alerttext=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("Hello");
		
		
	}

}
