import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Morrisonstryovernrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.get("https://groceries.morrisons.com/webshop/startWebshop.do");
 driver.manage().window().maximize();
 System.out.println(driver.getTitle());
 Thread.sleep(6000);
 WebElement hovering = driver.findElement(By.xpath("//div[@class='browseShop']"));
 Actions tohov = new Actions(driver);
 tohov.moveToElement(hovering).perform();
 Thread.sleep(6000);
 List<WebElement> li = driver.findElements(By.xpath("(//div[@class='level-base'])[2]//li[@class='level-item has-children']"));
 System.out.println(li.size());
 
 
// for(int i= 0; i>=li.size(); i++ )
 //{
	// System.out.println(li.get(i).getText());
 //}
 
 
 
 //(//div[@class='grocery-section level-0'])[2]//li[@class='level-item has-children']
 
// (//div[@class='level-base'])[2]
 
 //li[@class='level-item has-children']
 
 //div[@class='level-base']
 //div[@class='grocery-section level-0']
  //(//div[@class='grocery-section level-0'])[2]
 
 //span[text()='Shop ']
 
 

 
 
 
	}

}
