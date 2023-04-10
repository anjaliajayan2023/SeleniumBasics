package basicsyntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
driver.manage().window().maximize();
//to get the current URL of loaded page and prints in console
driver.get("https://www.amazon.in");
String currentUrl=driver.getCurrentUrl();
System.out.println(currentUrl);
driver.get(currentUrl);
//to get the title of the page
String title=driver.getTitle();
driver.getTitle();
System.out.println(driver.getTitle());
//to get the pagesource
String page=driver.getPageSource();
System.out.println(driver.getPageSource());



	}

}
