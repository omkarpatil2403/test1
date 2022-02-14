package saleniumdemo;


import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class Demo {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
	/*
	 * File screenshots = ((TakesScreenshot)driver)
	 * .getScreenshotAs(OutputType.FILE); FileUtils.copyFile(screenshots, new
	 * File(".//screenshot/screen1.png"));
	 */

	}
	}

	

