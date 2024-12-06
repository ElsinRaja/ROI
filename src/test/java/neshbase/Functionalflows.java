package neshbase;
import java.security.cert.X509Certificate;
import org.testng.annotations.*;
import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Functionalflows {
  public Page page;                    //Set a variable to class access 

	@BeforeClass
	public void browseropen() {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		page = browser.newPage();
		page.navigate("http://13.59.17.106/");
		page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[1]").fill("superadmin");
		page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]").fill("1234");
		page.locator("//button[@type='button']").click();
        
 }
@AfterClass
public void browserclose() {

page.pause();
}


@Test(priority = 1)
public void createOrganization() throws InterruptedException {

//	Create a Organization


	page.locator("//div[@class='MuiBox-root css-12vle5y']//button[1]").click();  
	page.locator("(//label[normalize-space(text())='Organization Name']/following::input)[1]").fill("Apollocare"); //organization name 
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").fill("James");  //First Name
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[3]").fill("Sudhan"); // Last Name
	page.locator("//div[@aria-labelledby='standard-select-currency-label standard-select-currency']").click(); //select org type
    page.locator("//li[normalize-space(text())='Testing org']").click();
    page.locator("(//label[normalize-space(text())='Business']/following::input)[1]").fill("Medical"); // Business
    page.locator("(//label[normalize-space(text())='Additional Information']/following::input)[1]").fill("Test notes"); //Additional Information
    page.locator("(//label[normalize-space(text())='Street']/following::input)[1]").fill("Noble street"); //Street
    page.locator("(//label[normalize-space(text())='City']/following::input)[1]").fill("Chennai");   // City
    page.locator("(//label[normalize-space(text())='Zipcode']/following::input)[1]").fill("600025");  //Zipcode
    page.locator("(//label[normalize-space(text())='State']/following::input)[1]").fill("Tamilnadu"); //State 	
    page.locator("(//label[normalize-space(text())='Country']/following::input)[1]").fill("India");   //Country
    page.locator("//label[normalize-space(text())='Email']/following::input").fill("elsinraja4@gmail.com"); //Email
    Thread.sleep(2000);
    page.locator("//button[normalize-space(text())='Submit']").click(); //Submit
    Thread.sleep(5000);
  	
	
}
//Select the organization type and assign the role

@Test(priority = 2)
public void selectOrgtype() throws InterruptedException { 
	
	Thread.sleep(2000);
	page.locator("//span[normalize-space(text())='Settings']").click();
	Thread.sleep(1000);
	page.locator("//button[normalize-space(text())='OrgType']").click();
	Thread.sleep(1000);
	page.locator("//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]//div[1]").click();              //select org type
	Thread.sleep(2000);
	page.locator("//li[normalize-space(text())='Testing org']").click(); // list
	Thread.sleep(1000);
	page.locator("//input[@name='1']").click(); // Super Admin
	page.locator("//input[@name='2']").click(); // Admin
	page.locator("//input[@name='3']").click(); // User
	page.locator("//input[@name='1006']").click(); // Account
	page.locator("//input[@name='1007']").click(); // Executive
	page.locator("//input[@name='1009']").click(); // Nurse
	page.locator("//input[@name='1008']").click(); // Tester
	page.locator("//input[@name='1011']").click(); // Supervisor
	Thread.sleep(2000);
	page.locator("//button[normalize-space(text())='Submit']").click();
	Thread.sleep(5000);
	
}


@Test(priority = 3)
public void assignSetup() throws InterruptedException { 
	
	//Select the role and grant the access rights for the menu
	
	page.locator("//span[normalize-space(text())='Settings']").click();
	page.locator("//button[normalize-space(text())='Assign Setup']").click(); //Assign setup
	Thread.sleep(3000);
	page.locator("//div[contains(@class,'MuiSelect-select MuiSelect-outlined')]").click(); //select the role
	Thread.sleep(1000);
	page.locator("//li[normalize-space(text())='Tester']").click(); //list 
	Thread.sleep(3000);	
	page.locator("//input[@name='1']").click();   //organization
	page.locator("//input[@name='1-checkbox-1']").check();    //Create
	page.locator("//input[@name='1-checkbox-3']").check();    //Edit
	page.locator("//input[@name='1-checkbox-4']").check();    //Delete
//	Thread.sleep(1000);
	page.locator("//input[@name='7']").check();               //User
	page.locator("//input[@name='7-checkbox-1']").check();;   //create
	page.locator("//input[@name='7-checkbox-3']").check();    //Edit
	page.locator("//input[@name='7-checkbox-4']").check();    //Delete
	page.locator("//input[@name='983']").check();             //Dashboard
	page.locator("//input[@name='983-checkbox-1']").check();  //create
	page.locator("//input[@name='983-checkbox-3']").check();  //Edit
	page.locator("//input[@name='983-checkbox-4']").check();   //Delete
//	Thread.sleep(1000);
	page.locator("//input[@name='984']").check();            //Test Page
	page.locator("//input[@name='984-checkbox-1']").check();  //Create
	page.locator("//input[@name='984-checkbox-3']").check();  //Edit
	page.locator("//input[@name='984-checkbox-4']").check();  // Delete
	page.locator("//input[@name='985']").check();             //Products
	page.locator("//input[@name='985-checkbox-1']").check();  //Create
	page.locator("//input[@name='985-checkbox-3']").check();  //Edit
	page.locator("//input[@name='985-checkbox-4']").check();  //Delete
	page.locator("//input[@name='987']").check();             //Audit
	page.locator("//input[@name='987-checkbox-1']").check();
	page.locator("//input[@name='987-checkbox-3']").check(); 
	page.locator("//input[@name='987-checkbox-4']").check();
	Thread.sleep(2000);
	page.locator("//button[normalize-space(text())='Submit']").click();
	Thread.sleep(3000);
			
}

 


@Test(priority = 4)
public void createUser() throws InterruptedException { 

	//Create a User
	
	page.locator("//span[normalize-space(text())='User']").click();
	Thread.sleep(2000);
	page.locator("//button[normalize-space(text())='Add User']").click();
	page.locator("(//label[normalize-space(text())='User Name']/following::input)[1]").fill("Jamesorg");   //User Name
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").fill("Admin");     //First Name
	page.locator("(//label[normalize-space(text())='Last Name']/following::input)[1]").fill("Test");       //Last Name
	page.locator("(//label[normalize-space(text())='Email Id']/following::input)[1]").fill("elsinraja4@gmail.com"); //Eamil id
	page.locator("(//div[@aria-labelledby='standard-select-currency-label standard-select-currency'])[1]").click(); //Select organization
	page.locator("//li[normalize-space(text())='Apollocare']").click();         
	page.locator("(//div[@aria-labelledby='standard-select-currency-label standard-select-currency'])[2]").click();  //Select Role
	page.locator("//li[normalize-space(text())='Tester']").click();
	page.locator("(//label[normalize-space(text())='Password']/following::input)[1]").fill("Welcome@20");   //Password
	page.locator("//label[normalize-space(text())='Confirm Password']/following::input").fill("Welcome@20"); //Confirm Password
	Thread.sleep(3000);
	page.locator("//button[normalize-space(text())='Submit']").click();                                      //Submit
	Thread.sleep(5000);
//	
}

@Test(priority = 5)

//Edit a User
 
public void editUser() throws InterruptedException {
	Thread.sleep(2000);
	page.locator("//span[normalize-space(text())='User']").click();
	Thread.sleep(2000);
	page.locator("//div[normalize-space(text())='Jamesorg']").click();
	Thread.sleep(1000);
	page.locator("//button[normalize-space(text())='Edit User']").click();
	Thread.sleep(1000);
	page.locator("//input[@name='email']").fill("pearlcityelsin@gmail.com");
	Thread.sleep(1000);
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").fill("Elsin"); 
	page.locator("//div[normalize-space(text())='Tester']").click();
	Thread.sleep(1000);
	page.locator("//li[normalize-space(text())='ADMIN']").click();
	Thread.sleep(1000);
    page.locator("//button[normalize-space(text())='Submit']").click();
	Thread.sleep(5000);
    
    
}

@Test(priority = 6)

//Delete a User

public void deleteUser() throws InterruptedException {
	page.locator("//span[normalize-space(text())='Settings']").click();
	Thread.sleep(1000);
	page.locator("//span[normalize-space(text())='User']").click();
	Thread.sleep(1000);
	page.locator("//div[normalize-space(text())='Jamesorg']").click();
	page.locator("//button[normalize-space(text())='Delete User']").click();
	Thread.sleep(1000);
	page.locator("//button[normalize-space(text())='Delete']").click();
	Thread.sleep(5000);
	
}
@Test(priority = 7)

//edit Organization

public void editOrganization() throws InterruptedException {


////	page.locator("//div[@class='MuiBox-root css-12vle5y']//button[1]").click();  
//	page.evaluate("window.scrollTo(0, 500)");
	page.locator("//span[normalize-space(text())='Organization']").click();
	page.locator("(//button[@type='button'])[31]").click();
	Thread.sleep(2000);
	page.locator("(//label[normalize-space(text())='Organization Name']/following::input)[1]").fill("Infant"); //organiztion name 
	page.locator("(//label[normalize-space(text())='First Name']/following::input)[1]").fill("Vignesh");  //First Name
	page.locator("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[3]").fill("Raja"); // Last Name
	Thread.sleep(1000);
	page.locator("//div[@aria-labelledby='standard-select-currency-label standard-select-currency']").click(); //select org type
    page.locator("//li[normalize-space(text())='Company']").click();
    Thread.sleep(2000);
    page.locator("(//label[normalize-space(text())='Business']/following::input)[1]").fill("Education"); // Business
    page.locator("(//label[normalize-space(text())='Additional Information']/following::input)[1]").fill("Automation demo"); //Additional Information
    page.locator("(//label[normalize-space(text())='Street']/following::input)[1]").fill("Esswaran street"); //Street
    page.locator("(//label[normalize-space(text())='City']/following::input)[1]").fill("Chennai");   // City
    Thread.sleep(1000);
    page.locator("(//label[normalize-space(text())='Zipcode']/following::input)[1]").fill("600089");  //Zipcode
    page.locator("(//label[normalize-space(text())='State']/following::input)[1]").fill("Tamilnadu"); //State 	
    page.locator("(//label[normalize-space(text())='Country']/following::input)[1]").fill("India");   //Country
    Thread.sleep(1000);
    page.locator("//label[normalize-space(text())='Email']/following::input").fill("elsinraja5@gmail.com"); //Email
    Thread.sleep(2000);
    page.locator("//button[normalize-space(text())='Submit']").click(); //Submit
    Thread.sleep(5000);
	
   
}
	

@Test(priority = 8)

//Logout

public void logout() throws InterruptedException {
   
  Thread.sleep(2000);
  page.locator("(//div[@class='profile-sec']//div)[2]").click();
  Thread.sleep(3000);
  page.locator("//div[normalize-space(text())='Logout']").click();
  Thread.sleep(3000);
  
}

//@Test(priority = 9)
//
////Error handling in login screen
//
//public void errorcheckkinLogin() throws InterruptedException {
//	
//	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[1]").fill("superadmins");
//	page.locator("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]").fill("1234");
//	page.locator("//button[@type='button']").click();
//	
//	
//}











	
//@Test(priority = 8)
//
////delete a organization
//
//public void deleteOrganization() throws InterruptedException {
//
//	Thread.sleep(3000);
//	page.locator("//span[normalize-space(text())='Settings']").click();
//	Thread.sleep(1000);
//    page.locator("//button[normalize-space(text())='OrgType']").click();
//	Thread.sleep(5000);
//	page.locator("(//div[@class='rlcol-n'])[17]").check();
//	Thread.sleep(2000);
//	page.locator("(//input[@type='text'])[2]").fill("Test");
//	Thread.sleep(2000);
//
//
//	
//	
//}


	
}










