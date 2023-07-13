import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class overingandprintassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
//	driver.findElement(By.xpath("(//span[@class='a-button-text'])[1]")).click();

    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    Thread.sleep(6000);
     WebElement hov = driver.findElement(By.xpath("//span[text()= 'Account & Lists']"));
     Actions mov = new Actions(driver);
     mov.moveToElement(hov).perform();
     Thread.sleep(6000);
     List<WebElement> li=  driver.findElements(By.xpath("//div[@class='nav-title']|//a[@class='nav-link nav-item']"));
     System.out.println(li.size());
     
     
    
      for(int i=0; i<=li.size()-1; i++)
     {
    	 System.out.println(li.get(i).getText());
  }
     
    // for(int i= li.size()-1; i>=0; i--)
     //{
    //	 System.out.println(li.get(i).getText());
     //}
     
//
  
}
}
