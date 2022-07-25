package com.TestVagrant.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestVagrant.Base.BaseClass;



public class wikiData extends BaseClass{
	
	private By country=By.xpath("//th[normalize-space()='Country']/following-sibling::td");
	
	private By releaseDate=By.xpath("//div[text()='Release date']/parent::th/following-sibling::td");
	


	public wikiData() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String getCountry(){
		
		return driver.findElement(country).getText();
//		return wikiCountry;
	
		
	}
	public String getReleaseDate() {
		
		return driver.findElement(releaseDate).getText();
//		return wikireleasedate;
	}
	

}
