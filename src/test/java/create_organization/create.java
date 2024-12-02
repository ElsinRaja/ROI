package create_organization;

import org.testng.annotations.*;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class create {
  public Page page;
  
 @BeforeMethod
 public void browseropen() {
	 Playwright playwright = Playwright.create();
     Browser browser = playwright.chromium().launch(
     new LaunchOptions().setHeadless(false).setSlowMo(50));
     page = browser.newPage();
     page.navigate("http://13.59.17.106/");
 	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[1]").type("superadmin");
 	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]").type("1234");
 	page.locator("//button[@type='button']").click();
 	
        
 }
@AfterMethod

//public void browserclose() {
//	page.close();
//}


@Test
public void add_organization() {
	
//	PlaywrightAssertions.assertThat(page).hasTitle("Nesh Base");
//	page.locator("//span[normalize-space(text())='Settings']").click();
//	page.locator("//input[contains(@class,'MuiInputBase-input MuiInput-input')]").fill("System Engineer");
////	page.locator("  ").click(); need id
	
	page.locator("(//div[@class='MuiListItemText-root css-r1v2vr']//span)[1]").click();
	page.locator("//div[@class='MuiBox-root css-12vle5y']//button[1]").click();  
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[1]").type("Apollo"); //organiztion name 
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[2]").type("James");  //First Name
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[3]").type("Sudhan"); // Last Name
//	 Locator option = page.locator("text='Option Text'"); // Replace with your option's text or selector
//     option.click();
     page.locator("(//span[normalize-space(text())='​']/following::input)[2]").type("Medical"); // Business
     page.locator("(//span[normalize-space(text())='​']/following::input)[3]").type("No notes"); //Additional Information
     page.locator("(//label[normalize-space(text())='Street']/following::input)[1]").type("Noble street"); //Street
     page.locator("(//label[normalize-space(text())='City']/following::input)[1]").type("Chennai");    // City
     page.locator("(//label[normalize-space(text())='Zipcode']/following::input)[1]").type("600025");  //Zipcode
     page.locator("(//label[normalize-space(text())='State']/following::input)[1]").type("Tamilnadu"); //State 	
     page.locator("(//label[normalize-space(text())='Country']/following::input)[1]").type("India");   //Country
     page.locator("//label[normalize-space(text())='Email']/following::input").type("elsinraja4@gmail.com");
     page.locator("//button[normalize-space(text())='Submit']").click(); //Submit
     
	
	
	
	
	
}
}









