package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\shiny\\SeleniumTask\\driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	WebElement cls = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	cls.click();
	WebElement item = d.findElement(By.xpath("//input[@name='q']"));
	item.sendKeys("story books");
	Thread.sleep(2000);
	WebElement search = d.findElement(By.xpath("//button[@class='vh79eN']"));
	search.click();

}
}
