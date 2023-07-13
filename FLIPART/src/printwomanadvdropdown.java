import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printwomanadvdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//span[contains(text(), Don)])[42]")).click();
		WebElement dropdownsele = driver.findElement(By.id("searchDropdownBox"));
		Select printall = new Select(dropdownsele);
		List<WebElement> li = printall.getOptions();
	    System.out.println(li.size());
				
		//for(int i=0; i<=27; i++)
		//{
		//	System.out.println(li.get(i).getText());
		//}

		
	for (int i = li.size()-1; i>0; i--)
	{
		System.out.println(li.get(i).getText());
	}

	}

}
