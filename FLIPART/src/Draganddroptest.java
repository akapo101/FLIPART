import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddroptest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	Thread.sleep(6000);
		
       WebElement Leftpickuplocation = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	   WebElement Leftdropofflocation = driver.findElement(By.id("bank"));
	   
	
	   WebElement pickuplocation =  driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	   WebElement dropofflocation = driver.findElement(By.id("amt7"));
	   
	   
	   WebElement Rightpickuplocation =     driver.findElement(By.xpath("//a[text()=' SALES ']"));
	   WebElement Rightdropofflocation =     driver.findElement(By.id("loan"));
	   
       WebElement Targetlocation= driver.findElement(By.xpath("//a[text()=' 5000']"));
       WebElement Targetdlocation = 	   driver.findElement(By.id("amt8"));
       
       Actions act = new Actions(driver);
       act.dragAndDrop(Leftpickuplocation, Leftdropofflocation).perform();
       act.dragAndDrop(pickuplocation, dropofflocation).perform();
       act.dragAndDrop(Rightpickuplocation, Rightdropofflocation).perform();
       act.dragAndDrop(Targetlocation, Targetdlocation).perform();
	}

}
