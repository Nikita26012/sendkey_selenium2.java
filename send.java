package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class send {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub)
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		WebElement textbox=dr.findElement(By.id("userName"));
		textbox.sendKeys("I am Nikita");
		Thread.sleep(2000);
		WebElement textbox1=dr.findElement(By.id("userEmail"));
		textbox1.sendKeys("niki@gmail.com");
		WebElement textbox3=dr.findElement(By.id("currentAddress"));
		textbox3.sendKeys("solapur north");
		WebElement textbox4=dr.findElement(By.id("permanentAddress"));
		textbox4.sendKeys("solapur north");

}
}