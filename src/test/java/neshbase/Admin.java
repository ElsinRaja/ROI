package neshbase;

import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.*;    // set to all *

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Admin {
	  public Page page;                    //Set a variable to class access 
	  
	  @BeforeMethod
	  public void browseropen() {
	 	 Playwright playwright = Playwright.create();
	      Browser browser = playwright.chromium().launch(
	      new LaunchOptions().setHeadless(false));
	      page = browser.newPage();
	      page.navigate("http://13.59.17.106/");
	  	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[1]").type("superadmin");
	  	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]").type("1234");
	  	page.locator("//button[@type='button']").click();
	  	
	         
	  }

}
