package com.TestVagrant.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.TestVagrant.Base.BaseClass;

public class imdbData extends BaseClass{
	
	private By imdb_country=By.xpath("//span[contains(text(),'Country of origin')]/parent::li/div[1]");
	
	private By imdb_releaseDate=By.xpath("//a[contains(text(),'Release date')]/parent::li/div[1]");
	
	


	public imdbData() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String getimdb_country(){
		
		imdbCountry=driver.findElement(imdb_country).getText();
		return imdbCountry;
	
		
	}
	public String getimdb_releaseDate() {
		
		 imdbreleasedate=driver.findElement(imdb_releaseDate).getText();
		 return imdbreleasedate;
	}
	
	
}



