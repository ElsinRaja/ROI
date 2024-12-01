package create_organization;

import org.testng.annotations.*;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class create {
  public Page page;
  
 @BeforeMethod
 public void browseropen() {
	 Playwright playwright = Playwright.create();
     Browser browser = playwright.chromium().launch(
     new LaunchOptions().setHeadless(false).setSlowMo(50));
     page = browser.newPage();
     page.navigate("http://13.59.17.106/");
        
 }
@AfterMethod

public void browserclose() {
	page.close();
}

@Test
public void login() {
	
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[1]").type("Raghu");
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]").type("Punithaa#97");
	page.locator("//button[@type='button']").click();
	
	
}


@Test
public void create_user() {
	
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[1]").type("Raghu");
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]").type("Punithaa#97");
	page.locator("//button[@type='button']").click();
	
	
}
}









