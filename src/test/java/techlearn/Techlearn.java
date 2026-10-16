package techlearn;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Techlearn {
  WebDriver driver;	
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev");
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");

  }
  @Test
  public void techlearn() {
	  driver.get("https://www.techlearn.in");

  }
  @Test
  public void twitter() {
	  driver.get("https://www.x.com");

  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
