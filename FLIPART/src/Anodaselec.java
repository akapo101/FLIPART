import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Anodaselec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tesco.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(6000);
	WebElement drop =	driver.findElement(By.name("beans-masthead-desktop-search-dropdown"));
		Select dropdown = new Select(drop);
		List<WebElement> li = dropdown.getOptions();
		System.out.println(li.size());
		for(int i = 0 ; i<=2 ; i++)
		{
		 System.out.println(li.get(i).getText());
		}
		
		
		
		
		
	}

}
