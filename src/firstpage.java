import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstpage {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        Thread.sleep(2000);
        driver.findElement(By.id("btn-login")).click();
        Select s= new Select(driver.findElement(By.id("combo_facility")));
        Thread.sleep(2000);
        s.selectByValue("Hongkong CURA Healthcare Center");
        Thread.sleep(2000);
        driver.findElement(By.id("chk_hospotal_readmission")).click();
        
        
        
       // driver.findElement(By.xpath("//a[contains(text(),'info@katalon.com')]")).click();
        System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'CURA Healthcare Service')]")).getText());
        System.out.println(driver.findElement(By.tagName("p")).getText());
        //System.out.println(driver.findElement(By.xpath("//*[text='(678)813-1KMS']")).getText());
        
        
        
        //driver.close();

	}

}
