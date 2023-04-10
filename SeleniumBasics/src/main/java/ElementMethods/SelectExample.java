package ElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		/*WebElement alltext=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select all=new Select(alltext);//select-class,alltext-constructor
		all.selectByIndex(1);//using index value can select text
		all.selectByValue("search-alias=amazon-devices");//using the value attribute
		all.selectByVisibleText("Amazon Fashion");*/
		
		WebElement alldropdown=driver.findElement(By.xpath("//select[@title='Search in']"));
	Select all=new Select(alldropdown);
	//all.selectByIndex(5);
	//all.selectByValue("search-alias=amazon-pharmacy");
	//all.selectByVisibleText("Amazon Pharmacy");
	WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	//search.click();
	List<WebElement>options=all.getOptions();
	
	for(WebElement element:options) {
		element.getText();
		
		System.out.println(element.getText());
		
	}
			
	}

}
