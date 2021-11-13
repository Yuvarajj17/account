package org.acc;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accountant {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DEEPAK\\eclipse-workspace\\Account\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
Alert a = driver.switchTo().alert();
@SuppressWarnings("deprecation")
WebDriverWait w = new WebDriverWait(driver, 50);
a.getText();
a.sendKeys("yes");
a.accept();
}
}
