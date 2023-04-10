package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassLocator {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();//uses for chrome 111
		co.addArguments("--remote-allow-origins=*");//uses for chrome 111
		WebDriver driver=new ChromeDriver(co);
		
        driver.manage().window().maximize();//to maximize the window
        driver.get("https://www.facebook.com/login/");//to get the fb url
        WebElement emailidfield=driver.findElement(By.name("email"));//fb username field-inspect
        emailidfield.sendKeys("mailid@gmail.com");
        //emailidfield.clear();
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("abcdefg");
        driver.findElement(By.className("loginbutton")).click();//class locator is used for login button
        //driver.close();

	}


}
