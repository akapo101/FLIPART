import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//	driver.manage().window().maximize();
	//	System.out.println(driver.getTitle());
	//	Thread.sleep(6000);
		
	//WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//Actions act = new Actions(driver);
	//act.doubleClick(clickbutton).perform();
		

	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(6000);
	driver.findElement(By.name("q")).sendKeys("manunited");
	driver.findElement(By.name("btnK")).click();
	driver.manage().window().maximize();
	}

}
