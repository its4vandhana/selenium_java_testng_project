package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.base.BaseClass;
import com.qa.pages.SamplePage;
import com.qa.testdata.CustomDataProvider;

public class SampleTest extends BaseClass {
	public WebDriver driver;

	public SampleTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		driver = intialization();
		sample = new SamplePage();
	}
/*	@Test(priority = 1, dataProvider = "test-data", dataProviderClass = CustomDataProvider.class)
	public void verifyPageTitle(String title) {

		String pageTitle = sample.getPageTitle();

		Assert.assertEquals(sample.getPageTitle(), title);
		System.out.println(pageTitle);
	}*/
/*
	@Test(priority = 2, dataProvider = "test-data", dataProviderClass = CustomDataProvider.class)
	public void verifySearchResult(String key) {
		sample.search(key);
			Assert.assertTrue(true, "Test case Failed");

			}*/

	@Test
	public void openApp(){
		driver.get("https://testing-machine-new.netlify.app");
		driver.findElement(By.id("basic_username")).sendKeys("mno@gmail.com");
		driver.findElement(By.id("basic_password")).sendKeys("RtmTest12$");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath())

	}

}
