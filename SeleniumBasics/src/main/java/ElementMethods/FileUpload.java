package ElementMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		//choosefile.sendKeys("C:\\Selenium\\Sele.docx");//create a file inside c drive and take the extension
WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
//upload.click();

//using file

File choose=new File("C:\\Selenium\\Sele.docx");
choosefile.sendKeys(choose.getAbsolutePath());// to get the path of the file

	
	}

}
