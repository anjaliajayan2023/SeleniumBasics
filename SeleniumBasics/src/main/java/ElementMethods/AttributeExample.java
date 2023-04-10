package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AttributeExample {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
String idfield=searchfield.getAttribute("id");
System.out.println(idfield);

WebElement searchin=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
String tooltip=searchin.getAttribute("title");//tooltip value searchin is stored in attribute title
System.out.println(tooltip);
WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
String tooltip1=searchbutton.getAttribute("searchbutton");
System.out.println(tooltip1);
String color= searchin.getCssValue("color");
String color1= searchin.getCssValue("background-color");
System.out.println(color);
driver.get("https://www.irctc.co.in/nget/train-search");
WebElement searchbtn=driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		String backgroundcolor= searchbtn.getCssValue("background-color");
		System.out.println(backgroundcolor);

	}

}

