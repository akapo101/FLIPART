import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
  WebDriver driver = new ChromeDriver();
  driver.get("https://secure2.premierinn.com/gb/en/account/register.html");
  driver.manage().window().maximize();
  System.out.println(driver.getTitle());
  Thread.sleep(6000);
   WebElement title = driver.findElement(By.name("titleName"));
   Select Sel = new Select(title);
   Sel.selectByVisibleText("Lord") ;
   driver.findElement(By.name("firstName")).sendKeys("Johrun")  ;
   driver.findElement(By.name("lastName")).sendKeys("lala")  ;
   driver.findElement(By.name("email")).sendKeys("jicecag192@ozatvn.com")  ;    
   driver.findElement(By.name("password")).sendKeys("Arsenal101@")  ;     
   driver.findElement(By.name("confirm-password")).sendKeys("Arsenal101@")  ;  
  WebElement code = driver.findElement(By.name("dialingCode"));
     Select dial = new Select(code);
     dial.selectByVisibleText("Nigeria (+234)");
   driver.findElement(By.name("mobile")).sendKeys("809073982");
   driver.findElement(By.name("addressPostcodeLookup")).sendKeys("ch664pj");
   
   driver.findElement(By.xpath("//button[contains(text(),'Find address')]")).click();
   //driver.findElement(By.xpath("//a[text()='Enter your address manually']")).click();
    //label[text()='I don't want to receive email marketing about Premier Inn hotels']

    

        
        
	}

}
