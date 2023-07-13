import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframprac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		driver.switchTo().frame("gdpr-consent-notice");
		driver.findElement(By.id("denyAll")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gdpr-consent-notice");
		driver.findElement(By.xpath("//span[text()='Reject']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("cusid")).sendKeys("Jam1212");
		driver.findElement(By.name("submit")).click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		System.out.println(popup.getText());
		popup.dismiss();
	 //span[text()='Reject']  

	}

}

