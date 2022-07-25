package com.TestVagrant.Tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.TestVagrant.Base.BaseClass;
import com.TestVagrant.Pages.imdbData;
import com.TestVagrant.Pages.wikiData;

public class wikiDataTest extends BaseClass{
	imdbData wikii=new imdbData();
	wikiData wiki=new wikiData();
	
	

	public wikiDataTest() throws IOException {
		super();
		
	}
	@Parameters("browsername")
	@BeforeMethod
	public void setUp(String browsername) {
		initialization(browsername);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
////	
	@Test(priority=1)
	
	public void validatewikiCountryNameTest() throws InterruptedException {
		wikiCountry=wiki.getCountry();
		System.out.println(wikiCountry+ "wikipedia country name");
		Assert.assertEquals(wikiCountry, "India");
	}
//		
//		
	@Test(priority=2)
	public void validatewikiReleaseDateTest() {
		wikireleasedate=wiki.getReleaseDate();
		System.out.println(wikireleasedate +"wikipedia release date");
		Assert.assertEquals(wikireleasedate, "17 December 2021");
	}
//	@Test
//	public void validateBothCountryTest() {
//		String a=wiki.getCountry();
//		System.out.println(a+" "+ "00000000000000000");
//		String b=wikii.getimdb_country();
//		System.out.println(b+ " "+"00000000000000000");
//			
//	}
//	
//	@Test
//	public void validateBothSiteReleaseDate() {
//		Assert.assertEquals(wikireleasedate, imdbreleasedate,"both release dates are not matching");
//		
//	}
//		
	
//	
		
	}
	


