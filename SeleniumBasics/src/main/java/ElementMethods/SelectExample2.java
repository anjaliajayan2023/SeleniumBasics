package ElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectExample2 {

	public static void main(String[] args) {
		String state="Oregon";
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		WebElement states=driver.findElement(By.xpath("//span[text()='Alaska']"));//Alaska-inspect
		states.click();
		WebElement inputselect=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		inputselect.sendKeys(state);
		driver.findElement(By.xpath("//li[text()='"+state+"']")).click();//concatenation//cursorblink-inspect
		

	}

}
