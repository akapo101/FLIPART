import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class combineproj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://secure2.premierinn.com/gb/en/account/register.html");
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
	WebElement titlez = driver.findElement(By.name("titleName"));
	Select dropdown = new Select(titlez);
    //dropdown.selectByVisibleText("Mr");
	List <WebElement> li = dropdown.getOptions();
	System.out.println(li.size());
	
	for (int i=0; i<=12; i++)
	{
	System.out.println(li.get(i).getText());
	}
	
	}

}
