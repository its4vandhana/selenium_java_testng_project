package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import com.qa.pages.SamplePage;
import com.qa.util.Utility;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Utility {

	public SamplePage sample;
	public String BASE_URL = "https://yahoo.com";

	public BaseClass() {

		propertyInit();
	}

	public static WebDriver intialization() {

		/*String browserName = prop.getProperty("Browser");
		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {*/
			/*
			This is linux chrome driver, for other operating systems please download respective chrome drivers.
			* */
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--no-sandbox");
				options.addArguments("addArguments");
				options.addArguments("--window-size=1920,1080");
				//options.addArguments("--headless");
				//options.addArguments("start-maximized");
				options.addArguments("disable-infobars");
				options.addArguments("--disable-extensions");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--disable-browser-side-navigation");
				options.addArguments("--disable-gpu");
				driver = new ChromeDriver(options);
		//}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		//driver.get(prop.getProperty("url"));

	}

	@AfterTest
	public void tearDown() {
		// closes all the browser windows opened by web driver
		//driver.quit();
	}

}
