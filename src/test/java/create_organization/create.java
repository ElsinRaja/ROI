package create_organization;

import java.security.cert.X509Certificate;

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
     new LaunchOptions().setHeadless(false));
     page = browser.newPage();
     page.navigate("http://13.59.17.106/");
 	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[1]").type("superadmin");
 	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]").type("1234");
 	page.locator("//button[@type='button']").click();
 	
        
 }
@AfterMethod

public void browserclose() {

page.pause();
}


@Test
public void add_organization() {
//	
  //Create new Orgtype
	
//	PlaywrightAssertions.assertThat(page).hasTitle("Nesh Base");
//	page.locator("//span[normalize-space(text())='Settings']").click();
//	page.locator("//input[contains(@class,'MuiInputBase-input MuiInput-input')]").fill("System Engineer");
//	page.locator("  ").click(); need id
//	
//	//Create new Organization
//	
	page.locator("(//div[@class='MuiListItemText-root css-r1v2vr']//span)[1]").click();
	page.locator("//div[@class='MuiBox-root css-12vle5y']//button[1]").click();  
	page.locator("(//label[normalize-space(text())='Organization Name']/following::input)[1]").type("Apollooness"); //organiztion name 
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").type("James");  //First Name
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[3]").type("Sudhan"); // Last Name
	page.locator("//div[@aria-labelledby='standard-select-currency-label standard-select-currency']").click(); //select org type
    page.locator("//li[normalize-space(text())='Testing org']").click();
    page.locator("(//label[normalize-space(text())='Business']/following::input)[1]").type("Medical"); // Business
    page.locator("(//label[normalize-space(text())='Additional Information']/following::input)[1]").type("No notes"); //Additional Information
    page.locator("(//label[normalize-space(text())='Street']/following::input)[1]").type("Noble street"); //Street
    page.locator("(//label[normalize-space(text())='City']/following::input)[1]").type("Chennai");   // City
    page.locator("(//label[normalize-space(text())='Zipcode']/following::input)[1]").type("600025");  //Zipcode
    page.locator("(//label[normalize-space(text())='State']/following::input)[1]").type("Tamilnadu"); //State 	
    page.locator("(//label[normalize-space(text())='Country']/following::input)[1]").type("India");   //Country
    page.locator("//label[normalize-space(text())='Email']/following::input").type("elsinraja4@gmail.com"); //Email
    page.locator("//button[normalize-space(text())='Submit']").click(); //Submit
  	
	
}
//
@Test
public void select_org_type() { 
	
	page.locator("//span[normalize-space(text())='Settings']").click();
	page.locator("//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]").click(); //select org type
	page.locator("//li[normalize-space(text())='Testing org']").click();                       //list 
	page.locator("(//label[normalize-space(text())='Select org type']/following::input)[2]").click(); // Super Admin
	page.locator("(//label[contains(.,'Super Admin')]/following::input)[1]").click(); // Admin
	page.locator("(//label[contains(.,'User')]/following::input)[1]").click();        //User
	page.locator("(//label[contains(.,'Executive')]/following::input)[1]").click();   // Tester
	page.locator("//label[contains(.,'Tester')]/following::input").click();           //Nurse
	page.locator("//button[normalize-space(text())='Submit']").click();
	
}
//
@Test
public void assign_setup() throws InterruptedException { 
	
	page.locator("//span[normalize-space(text())='Settings']").click();
	page.locator("//button[normalize-space(text())='Assign Setup']").click(); //Assign setup
	page.locator("//div[contains(@class,'MuiSelect-select MuiSelect-outlined')]").click(); //select the role
	page.locator("//li[normalize-space(text())='Tester']").click(); //list 
	Thread.sleep(3000);
//	 Locator checkbox = page.locator("//input[@name='1']");
//	 checkbox.check();
	page.locator("//input[@name='1']").click();   //organization
	Thread.sleep(2000);
//	page.locator("(//label[normalize-space(text())='Select the role']/following::input)[3]").check();   //Read
	page.locator("//input[@name='1-checkbox-1']").click();   //Create
	Thread.sleep(2000);
	page.locator("//input[@name='1-checkbox-3']").click();  //Edit
	Thread.sleep(2000);
	page.locator("//input[@name='1-checkbox-4']").click();   //Delete
	Thread.sleep(2000);
	page.locator("//input[@name='7']").click();              //User
	page.locator("//input[@name='7-checkbox-2']").click();  //Read
	Thread.sleep(2000);
	page.locator("//input[@name='7-checkbox-1']").click();   //create
	page.locator("//input[@name='7-checkbox-3']").check();   //Edit
	page.locator("//input[@name='985']").check();            //Products
	page.locator("//input[@name='985-checkbox-2']").check();   //User
	
		
	
}













@Test
public void new_user() { 

	page.locator("//span[normalize-space(text())='User']").click();
	page.locator("//button[normalize-space(text())='Add User']").click();
	page.locator("(//label[normalize-space(text())='User Name']/following::input)[1]").type("Jamesorg");   //User Name
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").type("Admin");     //First Name
	page.locator("(//label[normalize-space(text())='Last Name']/following::input)[1]").type("Test");       //Last Name
	page.locator("(//label[normalize-space(text())='Email Id']/following::input)[1]").type("elsinraja4@gmail.com"); //Eamil id
	page.locator("(//div[@aria-labelledby='standard-select-currency-label standard-select-currency'])[1]").click(); //Select organization
	page.locator("//li[normalize-space(text())='Apollooness']").click();         
	page.locator("(//div[@aria-labelledby='standard-select-currency-label standard-select-currency'])[2]").click();  //Select Role
	page.locator("//li[normalize-space(text())='Tester']").click();
	page.locator("(//label[normalize-space(text())='Password']/following::input)[1]").type("Welcome@20");   //Password
	page.locator("//label[normalize-space(text())='Confirm Password']/following::input").type("Welcome@20"); //Confirm Password
//	page.locator("//button[normalize-space(text())='Submit']").click();                                      //Submit
//	
}

//@Test
//public void new_use() { 
//	
   }
	
//   }










