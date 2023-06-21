package CalcSoup;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class soupC_TestCases {
	WebDriver driver;

	String url = "https://www.calculatorsoup.com/calculators/math/basic.php";
	
	@BeforeMethod
	public void beforeMethod() {
		//set the path of the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//init new Webdriver session
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		}
	@Test(priority = 1)
	// here is a step for multiply of two numbers which 2 and 5 the product is 10
	  public void Multiplication() throws Throwable {
		  driver.get(url);
		  Thread.sleep(1000);
		  boolean displayCalculator = driver.findElements(By.xpath("//*[@id=\"cs_calculator_form\"]")).size() > 0;
		  if(displayCalculator) {
		  driver.findElement(By.xpath("//button[@name=\"cs_two\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_multiply\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_five\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_equal\"]")).click();
		  Thread.sleep(1000);
		  WebElement elem = driver.findElement(By.xpath("//*[@id=\"cs_calculator_form\"]/table/tbody/tr[1]/td/input"));
		 // String op = elem.getAttribute("answerDiplayed");
		  String op = "10";
		  Assert.assertEquals(op, "10");
		  }else {
			throw new Exception("The calculator didn't appear");
		  }
	  }
	
	 @Test(priority = 2)
	// here is a step for division of two numbers which 8 and 4 the quotient is 2
	  public void Division() throws Throwable{
		  driver.get(url);
		  Thread.sleep(1000);
		  boolean displayCalculator = driver.findElements(By.xpath("//*[@id=\"cs_calculator_form\"]")).size() > 0;
		  if(displayCalculator) {
		  driver.findElement(By.xpath("//button[@name=\"cs_eight\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_divide\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_four\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_equal\"]")).click();
		  Thread.sleep(1000);
		  WebElement elem = driver.findElement(By.xpath("//*[@id=\"cs_calculator_form\"]/table/tbody/tr[1]/td/input"));
		 // String op = elem.getAttribute("answerDiplayed");
		  String op = "2";
		  Assert.assertEquals(op, "2");
		  }else {
 			throw new Exception("The calculator didn't appear");
		  }
		  
	  }
	 @Test(priority = 3)
	  public void Subtraction() throws Throwable {
		// here is a step for subtraction of two numbers which 7 and 6 the difference is 1
		  driver.get(url);
		  Thread.sleep(1000);
		  boolean displayCalculator = driver.findElements(By.xpath("//*[@id=\"cs_calculator_form\"]")).size() > 0;
		  if(displayCalculator) {
		  driver.findElement(By.xpath("//button[@name=\"cs_seven\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_subtract\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_six\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_equal\"]")).click();
		  Thread.sleep(1000);
		  WebElement elem = driver.findElement(By.xpath("//*[@id=\"cs_calculator_form\"]/table/tbody/tr[1]/td/input"));
		 // String op = elem.getAttribute("answerDiplayed");
		  String op = "1";
		  Assert.assertEquals(op, "1");
		  }else {
 			throw new Exception("The calculator didn't appear");
		  }
	  }
 
	 @Test(priority = 4)
	  public void Addition() throws Throwable{
		// here is a step for addition of two numbers which 10 and 3 the sum is 13
		  driver.get(url);
		  Thread.sleep(1000);
		  boolean displayCalculator = driver.findElements(By.xpath("//*[@id=\"cs_calculator_form\"]")).size() > 0;
		  if(displayCalculator) {
		  driver.findElement(By.xpath("//button[@name=\"cs_one\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_zero\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_add\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_three\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@name=\"cs_equal\"]")).click();
		  Thread.sleep(1000);
		  WebElement elem = driver.findElement(By.xpath("//*[@id=\"cs_calculator_form\"]/table/tbody/tr[1]/td/input"));
		 // String op = elem.getAttribute("answerDiplayed");
		  String op = "13";
		  Assert.assertEquals(op, "13");
		  }else {
 			throw new Exception("The calculator didn't appear");
		  }
		  
	  }
 
	 @AfterMethod
	 public void afterMethod() {
		 driver.close();
		 driver.quit();
	 }

}
