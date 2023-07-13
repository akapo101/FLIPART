import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arsenalconcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   Thread.sleep(6000);
   driver.get("https://www.arsenal.com/");
  WebElement mou = driver.findElement(By.xpath("//a[text()='News']"));
  Actions act = new Actions(driver);
  act.moveToElement(mou).perform();
  Thread.sleep(6000);
  WebElement m= driver.findElement(By.xpath("//a[text()='Video']"));
  act.moveToElement(m).perform();
   WebElement d= driver.findElement(By.id("user"));
   act.moveToElement(d).perform();
	}

}
