package org.tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\naveen\\eclipse\\java-2018-12\\eclipse\\Java\\locator\\webdriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://demo.guru99.com/test/drag_drop.html");
	   WebElement S=driver.findElement(By.id("credit2"));
	   WebElement d=driver.findElement(By.id("bank"));
	   Actions acc=new Actions(driver);
	   
	}

}
