import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login{

	public static void main(String[] args)  
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        Select s= new Select(driver.findElement(By.id("combo_facility")));
        s.selectByValue("Hongkong CURA Healthcare Center");
        driver.findElement(By.id("chk_hospotal_readmission")).click();
        driver.findElement(By.id("radio_program_medicaid")).click();
        WebElement dateBox = driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
        dateBox.sendKeys("18072021");
        driver.findElement(By.id("txt_comment")).sendKeys("Hello!");
        driver.findElement(By.id("btn-book-appointment")).click();
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[contains(text(),'History')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Go to Homepage')]")).click();
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        driver.close();
 
}
}
