import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
		 driver.manage().window().maximize();
		 //driver.findElement(By.xpath("(//span[contains(text(),'Change')])[1]")).click();
		 System.out.println(driver.getTitle());
		 Thread.sleep(6000);
		  WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		  Select sel = new Select(dropdown);
		  List<WebElement> li = sel.getOptions();
		  System.out.println(li.size());
		  for (int i = 0; i<li.size(); i++)
		  {
			  li.get(i).click();
			  System.out.println(li.get(i).getText());
			  driver.close();
		  }

	}

}
