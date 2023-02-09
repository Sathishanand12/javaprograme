package com.Maven_Day1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Runner extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
			
		//launchBrowser("chrome");
		
		launchBrowser("chrome");
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");	
	
		WebElement email = driver.findElement(By.id("username"));
		passinput(email, "Sathishanand");
		
		WebElement password = driver.findElement(By.id("password"));
		passinput(password, "Test@000");
		
		WebElement loginbutton = driver.findElement(By.id("login"));
		clickonelement(loginbutton);
		
		WebElement location = driver.findElement(By.id("location"));
		Dropdown(location, "London");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Dropdown(hotels, "Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Dropdown(roomtype, "Standard");
		
		WebElement roomnum = driver.findElement(By.id("room_nos"));
		Dropdown(roomnum, 1);
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		clear(checkin);
		passinput(checkin, "20/09/2022");
		
		
		WebElement checkout = driver.findElement(By.xpath("//input[@type='text']"));
		clear(checkout);
		passinput(checkout, "22/09/2022");
		
		WebElement adultcount = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Dropdown(adultcount, 2);
	
		WebElement childcount = driver.findElement(By.xpath("//select[@name='child_room']"));
		Dropdown(childcount, 1);
		
		WebElement clicksearch = driver.findElement(By.id("Submit"));
		clickonelement(clicksearch);
		
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		clickonelement(radiobtn);
		
		WebElement click = driver.findElement(By.id("continue"));
		clickonelement(click);
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		passinput(firstname, "Sathish");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		passinput(lastname, "Anand");
		
		WebElement address = driver.findElement(By.id("address"));
		passinput(address, "203,yorkshire,london");
		
		WebElement cardnum = driver.findElement(By.id("cc_num"));
		passinput(cardnum, "5637289020283734");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Dropdown(cardtype, "VISA");
		
		WebElement selectmonth = driver.findElement(By.id("cc_exp_month"));
		Dropdown(selectmonth, "8");
		
		WebElement selectyear = driver.findElement(By.id("cc_exp_year"));
		Dropdown(selectyear, "2022");
	
		WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
		passinput(cvvnum, "456");
		
		WebElement book = driver.findElement(By.id("book_now"));
		clickonelement(book);
		
		//WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		//clickonelement(logout);
	
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sathi\\OneDrive\\Desktop\\Selenium 10AM August\\SeleniumPractice\\Screenshots\\miniproject.png");
		FileHandler.copy(source, des);
		
		Thread.sleep(2000);
		Quit();
	
	}
	
	
}
