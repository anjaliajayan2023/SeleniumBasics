package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
				
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/login/");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		String loginbuttonvalue=loginbutton.getText();//to get the text(login) as string in console
		System.out.println(loginbuttonvalue);

		 WebElement textfb=driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
		String textfbvalue=textfb.getText();//to get the text(log into fb) as string in console
		System.out.println(textfbvalue);*/
		///getText() example
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermessage.sendKeys("ObsquraZone");
		WebElement showbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showbutton.click();
		String message=entermessage.getText();
		System.out.println("Your Message: "+message);



			}

		}


