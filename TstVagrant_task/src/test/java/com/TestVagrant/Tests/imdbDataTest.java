package com.TestVagrant.Tests;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.TestVagrant.Base.BaseClass;
import com.TestVagrant.Pages.imdbData;
import com.TestVagrant.Pages.wikiData;

public class imdbDataTest extends BaseClass{
	
	imdbData wiki=new imdbData();
	
	public imdbDataTest() throws IOException {
		super();
		
	}
	@Parameters("browsername")
	@BeforeMethod
	public void setUp(String browsername) {
		initializ(browsername);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test(priority=1)
	
	public void validateCountryNameTest() throws InterruptedException {
		imdbCountry=wiki.getimdb_country();

		System.out.println(imdbCountry+"" +"imdb country name");
		Assert.assertEquals(imdbCountry,"India");
	}
	@Test(priority=2)
	public void validateimdbReleaseDateTest() {
		imdbreleasedate=wiki.getimdb_releaseDate();
		System.out.println(imdbreleasedate +" "+ "imdb release date");
		Assert.assertEquals(imdbreleasedate, "January 7, 2022 (United States)");
	}
	@Test(priority=3)
	public void validate_imdb_wiki_country() {
		Assert.assertEquals(imdbCountry, wikiCountry,"both countryis are not matching");
		Assert.assertEquals(imdbCountry, wikiCountry,"both countryis are not matching");
		
	}
	@Test(priority=4)
	public void validate_imdb_wiki_releasedate() {
		Assert.assertEquals(imdbCountry, wikiCountry,"both countryis are not matching");
		Assert.assertEquals(wikireleasedate,imdbreleasedate,"both release dates are not matching");
		
	}

	
	
	
	
//	

}
