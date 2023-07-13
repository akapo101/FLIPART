import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Premierinnreg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure2.premierinn.com/gb/en/account/register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
		WebElement hovering = driver.findElement(By.xpath("(//a[contains(text(),display)])[34]"));
		Actions act = new Actions(driver);
		act.moveToElement(hovering).perform();
		Thread.sleep(4000);
		WebElement BA= driver.findElement(By.xpath("(//span[contains(text(),language)])[38]"));
        act.moveToElement(BA).perform();
        Thread.sleep(2000);
        WebElement CB= driver.findElement(By.xpath("(//div[text()='Discover Premier Inn'])[2\"]"));
        act.moveToElement(CB).perform();
        Thread.sleep(2000);
       WebElement CD=  driver.findElement(By.xpath("(//div[text()='Business'])[2]"));
       act.moveToElement(CD).perform();
       
        

}
}