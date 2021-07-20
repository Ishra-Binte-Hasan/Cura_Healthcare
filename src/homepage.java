import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class homepage {

	public static void main(String[] args)  
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("menu-toggle")).click();  
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.xpath("//a[contains(text(),'info@katalon.com')]")).click();
        System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'CURA Healthcare Service')]")).getText());
        System.out.println(driver.findElement(By.tagName("p")).getText());
        //System.out.println(driver.findElement(By.xpath("//*[text='(678)813-1KMS']")).getText());
         driver.close();

	}

}






