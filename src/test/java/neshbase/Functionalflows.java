package neshbase;

import java.security.cert.X509Certificate;

import org.testng.annotations.*;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Functionalflows {
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
//@AfterMethod
//
//public void browserclose() {
//
//page.pause();
//}


@Test(priority = 1)
public void add_organization() throws InterruptedException {

//	//Create new Organization
//	
	page.locator("(//div[@class='MuiListItemText-root css-r1v2vr']//span)[1]").click();
	page.locator("//div[@class='MuiBox-root css-12vle5y']//button[1]").click();  
	page.locator("(//label[normalize-space(text())='Organization Name']/following::input)[1]").type("Apolloriosin"); //organiztion name 
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").type("James");  //First Name
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[3]").type("Sudhan"); // Last Name
	page.locator("//div[@aria-labelledby='standard-select-currency-label standard-select-currency']").click(); //select org type
    page.locator("//li[normalize-space(text())='Testing org']").click();
    page.locator("(//label[normalize-space(text())='Business']/following::input)[1]").type("Medical"); // Business
    page.locator("(//label[normalize-space(text())='Additional Information']/following::input)[1]").type("Test notes"); //Additional Information
    page.locator("(//label[normalize-space(text())='Street']/following::input)[1]").type("Noble street"); //Street
    page.locator("(//label[normalize-space(text())='City']/following::input)[1]").type("Chennai");   // City
    page.locator("(//label[normalize-space(text())='Zipcode']/following::input)[1]").type("600025");  //Zipcode
    page.locator("(//label[normalize-space(text())='State']/following::input)[1]").type("Tamilnadu"); //State 	
    page.locator("(//label[normalize-space(text())='Country']/following::input)[1]").type("India");   //Country
    page.locator("//label[normalize-space(text())='Email']/following::input").type("elsinraja4@gmail.com"); //Email
    Thread.sleep(2000);
    page.locator("//button[normalize-space(text())='Submit']").click(); //Submit
    Thread.sleep(5000);
  	
	
}
//Select the organization type and assign the role

@Test(priority = 2)
public void select_org_type() throws InterruptedException { 
	
	Thread.sleep(2000);
	page.locator("//span[normalize-space(text())='Settings']").click();
	Thread.sleep(3000);
  page.locator("//button[normalize-space(text())='OrgType']").click();
  Thread.sleep(1000);
////	page.locator("//label[contains(@class, 'MuiInputLabel-root') and contains(text(), 'Select org')]").click(); //select org type
	page.locator("//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]//div[1]").click();
	Thread.sleep(3000);
	page.locator("//li[normalize-space(text())='Testing org']").click();                       //list 
	Thread.sleep(2000);
	page.locator("//input[@name='1']").click();      // Super Admin
	page.locator("//input[@name='2']").click();      // Admin
	page.locator("//input[@name='3']").click();      //User
	page.locator("//input[@name='1006']").click();  // Account
	page.locator("//input[@name='1007']").click();   //Executive
	page.locator("//input[@name='1009']").click();   //Nurse
	page.locator("//input[@name='1008']").click();   //Tester
	Thread.sleep(2000);
	page.locator("//button[normalize-space(text())='Submit']").click();
	Thread.sleep(5000);
	
}


@Test(priority = 3)
public void assign_setup() throws InterruptedException { 
	
	//Select the role and grant the access rights for the menu
	
	page.locator("//span[normalize-space(text())='Settings']").click();
	Thread.sleep(3000);
	page.locator("//button[normalize-space(text())='Assign Setup']").click(); //Assign setup
	Thread.sleep(3000);
	page.locator("//div[contains(@class,'MuiSelect-select MuiSelect-outlined')]").click(); //select the role
	Thread.sleep(1000);
	page.locator("//li[normalize-space(text())='Tester']").click(); //list 
	Thread.sleep(3000);	
//	 Locator checkbox = page.locator("//input[@name='1']");
//	 checkbox.check();
	page.locator("//input[@name='1']").click();   //organization
	Thread.sleep(2000);
//	page.locator("(//label[normalize-space(text())='Select the role']/following::input)[3]").check();   //Read
	page.locator("//input[@name='1-checkbox-1']").click();   //Create
//	Thread.sleep(2000);
	page.locator("//input[@name='1-checkbox-3']").click();  //Edit
//	Thread.sleep(2000);
	page.locator("//input[@name='1-checkbox-4']").click();   //Delete
//	Thread.sleep(2000);
	page.locator("//input[@name='7']").click();              //User
	page.locator("//input[@name='7-checkbox-2']").click();  //Read
	page.locator("//input[@name='7-checkbox-1']").click();   //create
	page.locator("//input[@name='7-checkbox-3']").check();   //Edit
	page.locator("//input[@name='985']").check();            //Products
	page.locator("//input[@name='985-checkbox-2']").check();   //User
	Thread.sleep(2000);
	page.locator("//button[normalize-space(text())='Submit']").click();
	Thread.sleep(5000);
		
	
}

 


@Test(priority = 4)
public void new_user() throws InterruptedException { 

	//Add a new user
	
	page.locator("//span[normalize-space(text())='User']").click();
	page.locator("//button[normalize-space(text())='Add User']").click();
	page.locator("(//label[normalize-space(text())='User Name']/following::input)[1]").type("Jamesorg");   //User Name
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").type("Admin");     //First Name
	page.locator("(//label[normalize-space(text())='Last Name']/following::input)[1]").type("Test");       //Last Name
	page.locator("(//label[normalize-space(text())='Email Id']/following::input)[1]").type("elsinraja4@gmail.com"); //Eamil id
	page.locator("(//div[@aria-labelledby='standard-select-currency-label standard-select-currency'])[1]").click(); //Select organization
	page.locator("//li[normalize-space(text())='Apolloriosin']").click();         
	page.locator("(//div[@aria-labelledby='standard-select-currency-label standard-select-currency'])[2]").click();  //Select Role
	page.locator("//li[normalize-space(text())='Tester']").click();
	page.locator("(//label[normalize-space(text())='Password']/following::input)[1]").type("Welcome@20");   //Password
	page.locator("//label[normalize-space(text())='Confirm Password']/following::input").type("Welcome@20"); //Confirm Password
	Thread.sleep(3000);
	page.locator("//button[normalize-space(text())='Submit']").click();                                      //Submit
	Thread.sleep(5000);
//	
}

@Test(priority = 5)

//Edit User
 
public void edit_user() throws InterruptedException {
	Thread.sleep(2000);
	page.locator("//span[normalize-space(text())='User']").click();
	page.locator("//div[normalize-space(text())='Jamesorg']").click();
	page.locator("//button[normalize-space(text())='Edit User']").click();
	page.locator("//input[@name='lastname']").fill("Raja");
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").fill("Elsin"); 
    page.locator("//button[normalize-space(text())='Submit']").click();
    
}

@Test(priority = 6)

//Delete User

public void delete_user() throws InterruptedException {
	Thread.sleep(2000);
	page.locator("//span[normalize-space(text())='User']").click();
     
	
	
	


}
	
   }










