import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Shabeer Works\\SHABEER\\SeleniumWorks\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("shabeer");
	WebElement passWord = driver.findElement(By.id("pass"));
	passWord.sendKeys("12345");
	WebElement btnLogIn = driver.findElement(By.xpath("//input[@value='Log In']"));
	btnLogIn.click();
	}
	

}
