
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

// 1. FIND THE THING YOU WANT TO INTERACT WITH
// THING = input box, button, image, dropdown, link

// 2. WHAT DO YOU WANT TO DO WITH IT?

// 3. Convert this into code

/// ---------
// I want to downaload an image from Instagram
// Precondition -- Go to the instagram page
// Steps: <------ converting into code
// 1.  Find the image
// 2.  Right click > Save Image As
// 3.  Done


// ------------
// Example 2 - I want to test Login on Facebook website
// Precondition - you need to go to facebook.com
// Steps:  <--- convert this to code using the selenium functions
// 1. Find the username login box
// 2. Click on the box
// 3. Enter a username:  jenelle@gmail.com
// 4. Find the password login box
// 5. Click on the password box
// 6. Enter a password:  1111
// 7. Find the login button
// 8. Click on the login button
// 9. Make sure that it goes to the next page

//-------------
// Example 3 - Testing the search on duckduckgo.com
// Precondition - you need to be on duckduckgo.com
// Steps:
// 1. Find the search box
// 2. Type a search term into the box (example: how to install eclipse)
// 3. Find the search button
// 4. Click on search button
// 5. Check that you went to the next page
// 6. Find (Look at) the search results
// 7. Check that first result is a page with title = "Eclipse Installer 2018-12 R | Eclipse Packages"

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// Windows
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//String baseUrl = "http://demo.guru99.com/test/newtours/";
		String baseUrl = "http://www.cestarcollege.com/";
		
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		// launch Chrome and direct it to the Base URL
		driver.get(baseUrl);
		
		// get the actual value of the title
		actualTitle = driver.getTitle();
		System.out.println("Title of webpage: " + actualTitle);
		

				
		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)){
		    System.out.println("Test Passed!");
		} else {
		    System.out.println("Test Failed");
		    }
		   
		    //close Chrome
		    driver.close();
		   
	}

}
