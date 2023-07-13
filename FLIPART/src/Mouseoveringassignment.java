import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouseoveringassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

	     Thread.sleep(2000);
      driver.findElement(By.xpath("//button[text()='✕']")).click();
      WebElement fashionlis = driver.findElement(By.xpath("//div[text()='Fashion']"));
      Actions act = new Actions(driver);
       act.moveToElement(fashionlis).perform();
     Thread.sleep(6000);
     WebElement w = driver.findElement(By.xpath("//a[text()='Women Western']"));
      act.moveToElement(w).perform();
    Thread.sleep(6000);
      WebElement G = driver.findElement(By.xpath("//a[text()='Women T-shirts & Polo T-shirts']"));
    act.moveToElement(G).perform();
       
       
		WebDriver drivers = new ChromeDriver();
		drivers.get("https://www.ebay.com/");
	System.out.println(drivers.getTitle());
	       drivers.manage().window().maximize();
	       Thread.sleep(2000);
	       WebElement driva = drivers.findElement(By.xpath("(//a[text()='Motors'])[2]"));
	       Actions veh = new Actions(drivers);
	       veh.moveToElement(driva).perform();
	     WebElement moto=  drivers.findElement(By.xpath("//a[text()='All Parts & Accessories']"));
	       Actions M = new Actions (drivers);
	       M.moveToElement(moto).perform();
    
     
    		   
	    //a[@class='nav-link nav-item']
       
       //div[@class='nav-title']
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        
        
        
        
  //button[text()='✕"]	
  //div[text()='Fashion']
       //a[text()='Women Western']
		
		
    //a[text()='Women T-shirts & Polo T-shirts']
	}

}
