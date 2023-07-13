import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dds1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.cheaptickets.com/");
		  driver.manage().window().maximize();
		  System.out.println(driver.getTitle());
		  Thread.sleep(6000);
		  driver.findElement(By.xpath("//span[text()='Cruises']")).click();
		 // Thread.sleep(2000);
		 WebElement sel = driver.findElement(By.id("cruise-destination"));
		 Select dropdown = new Select(sel);
		 dropdown.selectByVisibleText("Europe");
		 System.out.println(driver.getTitle());
		 driver.close();


	}

}
