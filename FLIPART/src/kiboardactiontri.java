import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiboardactiontri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//span[contains (text(), 'Don')]")).click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	    Thread.sleep(3000);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(text(),'GlocalMe ')])[1]")).click();
        System.out.println(driver.getTitle());
	}

} 
