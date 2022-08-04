package com.nextgenai.registerdemotestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nextgenai.crossbrowsertesting.MultiBrowser; 
/*=============================================================================
| Author :  Dhanya Balakrishnan
| Project:  Testing Practices 
| Purpose:  Program to automate Register demo page using Testng framework
| Date   :  21/07/2022 
 ===========================================================================*/
public class RegisterDemoTestNG extends MultiBrowser{

	//Storing the values in variable

	String firstNameValue = "Dhanya";
	String lastNameValue = "Balakrishnan";
	String address = "Devajyothi";
	String saddress ="Kisan Road";
	String city = "Kannur";
	String state = "Kerala";
	String pincode = "670014";
	String countryOne = "India";
	String emailID = "dhanya9633@gmail.com";
	String dateOfDemo ="07/11/2022";
	String hour = "09";
	String minute = "30";
	String mobileNumber = "9633311635";
	String query = "How many days online training?";
	String successMsgText = "Registration Form is Successfully Submitted";

	//Storing the locator values
	String qaAutomationLocator = "QA AUTOMATION";
	String practiseAutomationLocator = "Practice Automation";
	String registrationFormLocator = "Registration Form";
	String regTitleTextLocator = "	//*[@id=\"item-vfb-1\"]/div/h3";
	String firstNameLocator = "vfb-5";
	String lastnameLocator = "vfb-7";
	String femaleRadioBtnLocator = "vfb-8-2";
	String addressLocator = "vfb-13[address]";
	String streetLocator = "vfb-13[address-2]";
	String cityLocator = "//*[@id=\"vfb-13-city\"]";
	String stateLocator = "//*[@id=\"vfb-13-state\"]";
	String postalCodeLocator = "vfb-13-zip";
	String countryLocator = "vfb-13-country";
	String emailIdLocator = "vfb-14";
	String dateOfDemoLocator = "vfb-18";
	String hourLocator = "vfb-16-hour";
	String minuteLocator = "vfb-16-min";
	String mobileNoLocator = "vfb-19";
	String uftChkBoxLocator = "vfb-20-1";
	String funTestChckBoxLocator = "vfb-20-4";
	String queryLocator = "vfb-23";
	String twoDigitNoLocator = "vfb-3";
	String tDLocator = "//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label";
	String submitBtnLocator = "vfb-4";
	String successMsgLocator = "//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div[1]/div/div/div/div/div";


	@Test(priority = 1)
	public void navigateToRegistrationForm() throws InterruptedException {

		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));
		action.moveToElement(qaAutomation).perform();

		//For execution purpose only 
		Thread.sleep(3000);
		
		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = driver.findElement(By.linkText(practiseAutomationLocator));
		action.moveToElement(pracAutomation).perform();

		// Click on Registration Form 
		WebElement registrationForm = driver.findElement(By.partialLinkText(registrationFormLocator));
		registrationForm.click();
		Reporter.log("Navigated to Register Demo Page");
	}

	@Test(priority = 2)
	public void registerUser() throws InterruptedException {

		// Declaring the WebElement object for Registration title
		WebElement regTitleText = driver.findElement(By.xpath(regTitleTextLocator));

		//Verify the Registration Title is displayed		
		if(regTitleText.isDisplayed()) {

			Reporter.log("Registration Title is displayed");
		}
		else
		{
			Reporter.log("Registration Title is not displayed");
		}

		// Validating the Registration Title 
		String actRegTitle = regTitleText.getText();
		String expRegTitle = "Register For Demo";

		if(actRegTitle.equals(expRegTitle)) {
			Reporter.log("Title of the Registration page is : "+ actRegTitle);
		}
		else
		{
			Reporter.log("Actual and Expected Registration title are not same");
			Reporter.log("The Actual Registration Title is : "+ actRegTitle);
			Reporter.log("The Expected Registration Title is : "+ expRegTitle);
		}


		// Declaring the WebElement object for First Name
		WebElement firstName = driver.findElement(By.id(firstNameLocator));

		// Verify the first name is displayed or not
		if(firstName.isDisplayed()) {
			Reporter.log("First Name is displayed");
		}
		else{
			Reporter.log("First Name is not displayed");	
		}

		// Verify the first name is enabled or not
		if(firstName.isEnabled()) {
			Reporter.log("First Name is enabled");

			// Enter the First Name
			firstName.sendKeys(firstNameValue);
			Reporter.log("First Name entered is : " + firstNameValue);
		}
		else{
			Reporter.log("First Name is not enabled");
		}

		// Declaring the WebElement object for Last Name
		WebElement lastName = driver.findElement(By.id(lastnameLocator));

		// Verify the lastName name is displayed or not
		if(lastName.isDisplayed()) {
			Reporter.log("Last Name is displayed");
		}
		else{
			Reporter.log("Last Name is not displayed");	
		}

		// Verify the last name is enabled or not
		if(lastName.isEnabled()) {
			Reporter.log("Last Name is enabled");

			// Enter the Last Name
			lastName.sendKeys(lastNameValue);
			Reporter.log("Last Name entered is : " + lastNameValue);
		}
		else{
			Reporter.log("Last Name is not enabled");
		}

		// Declaring the WebElement object for Radio Button
		WebElement femaleRadioBtn = driver.findElement(By.id(femaleRadioBtnLocator));

		//Verify the Female Radio Button displayed
		if(femaleRadioBtn.isDisplayed()) {
			Reporter.log("Female Radio Button is displayed");
		}
		else {
			Reporter.log("Female Radio Button not displayed");
		}

		// Verify the Female Radio Button is enabled
		if(femaleRadioBtn.isEnabled()) {
			Reporter.log("Female Radio Button is enabled");
		}
		else{
			Reporter.log("Female Radio Button not enabled");
		}	

		// Verify the Female Radio Button is selected
		if(femaleRadioBtn.isSelected()) {
			Reporter.log("Female Radio Button is selected");
		}
		else
		{
			Reporter.log("Female Radio Button is not selected");

			//Select the Radio Button
			femaleRadioBtn.click();
		}


		// Verify again Female Radio Button is selected
		if(femaleRadioBtn.isSelected()) {
			Reporter.log("Female Radio Button is now selected");
		}
		else
		{
			Reporter.log("Female Radio Button is not selected");
		}


		// Declaring the WebElement object for address
		WebElement addressobj = driver.findElement(By.name(addressLocator));

		if(addressobj.isDisplayed()) {
			Reporter.log("Address is displayed");
		}
		else {
			Reporter.log("Address is not displayed");
		}

		if(addressobj.isEnabled()) {
			Reporter.log("Address is enabled");
			//Enter the address
			addressobj.sendKeys(address);
			Reporter.log("Address entered is : " + address);

		}
		else {
			Reporter.log("Address is not enabled");
		}

		//Declaring the WebElement object for Street Address
		WebElement streetAddress = driver.findElement(By.name(streetLocator));

		// Verify the Street Address is displayed
		if(streetAddress.isDisplayed()) {
			Reporter.log("Street Address is displayed");
		}
		else {
			Reporter.log("Street Address is not displayed");
		}

		// Verify the Street Address is enabled
		if(streetAddress.isEnabled()) {
			Reporter.log("Street Address is enabled");
			//Enter the Street Address
			streetAddress.sendKeys(saddress);
			Reporter.log("Street Address entered is : " + saddress);

		}
		else {
			Reporter.log("Street Address is not enabled");
		}

		//Declaring the WebElement object for City
		WebElement cityName = driver.findElement(By.xpath(cityLocator));

		// Verify the City is displayed
		if(cityName.isDisplayed()) {
			Reporter.log("City is displayed");
		}
		else {
			Reporter.log("City is not displayed");
		}
		if(cityName.isEnabled()) {
			Reporter.log("City is enabled");
			//Enter the city
			cityName.sendKeys(city);
			Reporter.log("City entered is : "+city);
		}
		else
		{
			Reporter.log("City is not enabled");
		}

		//Declaring the WebElement object for State
		WebElement stateName = driver.findElement(By.xpath(stateLocator));

		// Verify the State is displayed
		if(stateName.isDisplayed()) {
			Reporter.log("State is displayed");
		}
		else {
			Reporter.log("State is not displayed");
		}
		if(stateName.isEnabled()) {
			Reporter.log("State is enabled");
			//Enter the state
			stateName.sendKeys(state);
			Reporter.log("State entered is : "+state);
		}
		else
		{
			Reporter.log("State is not enabled");
		}

		//Declaring the WebElement object for Postal Code
		WebElement postalCode = driver.findElement(By.id(postalCodeLocator));

		// Verify the Postal Code is displayed
		if(postalCode.isDisplayed()) {
			Reporter.log("Postal Code  is displayed");
		}
		else {
			Reporter.log("Postal Code is not displayed");
		}
		if(postalCode.isEnabled()) {
			Reporter.log("Postal Code is enabled");
			//Enter the Postal Code
			postalCode.sendKeys(pincode);
			Reporter.log("Postal Code entered is : "+pincode);
		}
		else
		{
			Reporter.log("Postal Code is not enabled");
		}

		// Declaring the WebElement object for Country DropDown
		WebElement countryDropDown = driver.findElement(By.id(countryLocator));

		// Verify the Country DropDown is displayed
		if(countryDropDown.isDisplayed()) {
			Reporter.log("Country DropDown is displayed");
		}
		else{
			Reporter.log("Country DropDown is not displayed");
		}

		// Verify the Country DropDown is enabled
		if(countryDropDown.isEnabled()) {

			Reporter.log("Country DropDown is enabled");
			// Create the select object	to select value from dropdown	
			Select cDropDown = new Select(countryDropDown);	
			cDropDown.selectByVisibleText(countryOne);
			Reporter.log("Country selected is : "+countryOne);
		}
		else {
			Reporter.log("Country DropDown is not enabled");
		}

		//Declaring the WebElement object for E mail
		WebElement email = driver.findElement(By.id(emailIdLocator));
		// Verify the email is displayed
		if(email.isDisplayed()) {
			Reporter.log("E mail is displayed");
		}
		else{
			Reporter.log("E mail is not displayed");
		}

		// Verify the email is enabled
		if(email.isEnabled()) {
			Reporter.log("E mail is enabled");
			//Enter the E mail
			email.sendKeys(emailID);
			Reporter.log("E mail entered is : " + emailID);

		}
		else {
			Reporter.log("E mail is not enabled");
		}

		//Declaring the WebElement object for Date of Demo
		WebElement dod = driver.findElement(By.id(dateOfDemoLocator));
		// Verify the Date of Demo is displayed
		if(dod.isDisplayed()) {
			Reporter.log("Date of Demo is displayed");
		}
		else{
			Reporter.log("Date of Demo is not displayed");
		}

		// Verify the email is enabled
		if(dod.isEnabled()) {
			Reporter.log("Date of Demo is enabled");
			//Enter the E mail
			dod.sendKeys(dateOfDemo);
			Reporter.log("Date of Demo is : " + dateOfDemo);

		}
		else {
			Reporter.log("Date of Demo is not enabled");
		}

		// Declaring the WebElement object for Convenient time - Hour
		WebElement hourDropDown = driver.findElement(By.id(hourLocator));

		// Verify the Hour DropDown is displayed
		if(hourDropDown.isDisplayed()) {
			Reporter.log("Hour DropDown is displayed");
		}
		else{
			Reporter.log("Hour DropDown is not displayed");
		}

		// Verify the Hour DropDown is enabled
		if(hourDropDown.isEnabled()) {

			Reporter.log("Hour DropDown is enabled");
			// Create the select object	to select value from dropdown	
			Select hDropDown = new Select(hourDropDown);	
			hDropDown.selectByVisibleText(hour);
			Reporter.log("Hour selected is : "+hour);
		}
		else {
			Reporter.log("Hour DropDown is not enabled");
		}

		// Declaring the WebElement object for Convenient time - Minute
		WebElement minDropDown = driver.findElement(By.id(minuteLocator));

		// Verify the Minute DropDown is displayed
		if(minDropDown.isDisplayed()) {
			Reporter.log("Minute DropDown is displayed");
		}
		else{
			Reporter.log("Minute DropDown is not displayed");
		}

		// Verify the Minute DropDown is enabled
		if(minDropDown.isEnabled()) {

			Reporter.log("Minute DropDown is enabled");
			// Create the select object	to select value from dropdown	
			Select mDropDown = new Select(minDropDown);	
			mDropDown.selectByVisibleText(minute);
			Reporter.log("Minute selected is : "+minute);
		}
		else {
			Reporter.log("Minute DropDown is not enabled");
		}

		//Declaring the WebElement object for Mobile Number
		WebElement mobNo = driver.findElement(By.id(mobileNoLocator));

		// Verify the Mobile Number is displayed
		if(mobNo.isDisplayed()) {
			Reporter.log("Mobile Number is displayed");
		}
		else {
			Reporter.log("Mobile Number  is not displayed");
		}

		// Verify the Mobile Number is enabled
		if(mobNo.isEnabled()) {
			Reporter.log("Mobile Number is enabled");
			//Enter the Mobile Number
			mobNo.sendKeys(mobileNumber);
			Reporter.log("Mobile Number entered is : " + mobileNumber);

		}
		else {
			Reporter.log("Mobile Number is not enabled");
		}

		// Declaring the WebElement object for UFT CheckBox
		WebElement uftCheckBox = driver.findElement(By.id(uftChkBoxLocator));

		// Verify the UFT Checkbox is displayed
		if(uftCheckBox.isDisplayed()) {
			Reporter.log("UFT Checkbox is displayed");
		}
		else{
			Reporter.log("UFT Checkbox is not displayed");
		}

		// Verify the UFT Checkbox is enabled
		if(uftCheckBox.isEnabled()) {
			Reporter.log("UFT Checkbox is enabled");
		}
		else{
			Reporter.log("UFT Checkbox is not enabled");
		}

		// Verify the UFT Checkbox is selected
		if(uftCheckBox.isSelected()) {
			Reporter.log("UFT Checkbox is selected");
		}
		else {
			Reporter.log("UFT Checkbox is not selected");

			//Select the UFT Check Box
			uftCheckBox.click();
			Reporter.log("UFT Checkbox is now selected");
		}

		// Declaring the WebElement object for Functional Testing CheckBox
		WebElement ftCheckBox = driver.findElement(By.id(funTestChckBoxLocator));

		// Verify the Functional Testing Checkbox is displayed
		if(ftCheckBox.isDisplayed()) {
			Reporter.log("Functional Testing Checkbox is displayed");
		}
		else{
			Reporter.log("Functional Testing Checkbox is not displayed");
		}

		// Verify the Functional Testing Checkbox is enabled
		if(ftCheckBox.isEnabled()) {
			Reporter.log("Functional Testing Checkbox is enabled");
		}
		else{
			Reporter.log("Functional Testing Checkbox is not enabled");
		}

		// Verify the Functional Testing Checkbox is selected
		if(ftCheckBox.isSelected()) {
			Reporter.log("Functional Testing Checkbox is selected");
		}
		else {
			Reporter.log("Functional Testing Checkbox is not selected");

			//Select the UFT Check Box
			ftCheckBox.click();
			Reporter.log("Functional Testing sCheckbox is now selected");
		}

		// Declaring the WebElement object for Query TestBox
		WebElement queryArea = driver.findElement(By.id(queryLocator));

		// Verify the Query TestBox is displayed
		if(queryArea.isDisplayed()) {
			Reporter.log("Query TestBox is displayed");
		}
		else{
			Reporter.log("Query TestBox is not displayed");
		}

		// Verify the Query TestBox is enabled
		if(queryArea.isEnabled()) {
			Reporter.log("Query TestBox is enabled");
			queryArea.sendKeys(query);
			Reporter.log("Query Entered is : "+query);
		}
		else{
			Reporter.log("Query TestBox is not enabled");
		}

		// Declaring the WebElement object for Entering Two Digit Verification Number
		WebElement twoDigitNumber = driver.findElement(By.id(twoDigitNoLocator));

		// Verify Enter Two Digit TestBox is displayed
		if(twoDigitNumber.isDisplayed()) {
			Reporter.log("Enter Two Digit TestBox is displayed");
		}
		else{
			Reporter.log("Enter Two Digit TestBox is not displayed");
		}

		// Verify Enter Two Digit TestBox TestBox is enabled
		if(twoDigitNumber.isEnabled()) {
			Reporter.log("Enter Two Digit TestBox is enabled");

			//Retrieve the two digit verification no during runtime
			String vNo= driver.findElement(By.xpath(tDLocator)).getText();
			String verfNo[] = vNo.split(":");
			//Enter two digit verification no
			twoDigitNumber.sendKeys(verfNo[1].trim());
			Reporter.log("Two Digit number entered is : "+verfNo[1]);
		}
		else{
			Reporter.log("Enter Two Digit TestBox is not enabled");
		}

		// Declaring the WebElement object for Submit button
		WebElement submitBtn = driver.findElement(By.id(submitBtnLocator));

		// Verify Submit button is displayed
		if(submitBtn.isDisplayed()) {
			Reporter.log("Submit button is displayed");
		}
		else{
			Reporter.log("Submit button is not displayed");
		}

		// Verify Submit button is enabled
		if(submitBtn.isEnabled()) {
			Reporter.log("Submit button is enabled");
			submitBtn.click();
			Reporter.log("Submit button is clicked");

		}
		else{
			Reporter.log("Submit button is not enabled");
		}
		Reporter.log("All details are submitted");

	}

	@Test(priority = 3)
	public void validatingSuccessfulmsg() {

		//Successful messge
		WebElement successfulMsgText = driver.findElement(By.xpath(successMsgLocator));
		//Verify Successful message displayed or not
		if(successfulMsgText.isDisplayed()) {
			Reporter.log("Successful message is displayed");
		}
		else {
			Reporter.log("Successful message is not displayed");
		}

		String actSuccessfulMsgText = successfulMsgText.getText();
		String expSuccessfulMsgText = successMsgText;

		//Retrieving Transaction No from Successful message
		String succMsg[] = actSuccessfulMsgText.split(":");
		String transNo = succMsg[1].trim();

		//Validating the Successful message
		if(actSuccessfulMsgText.contains(expSuccessfulMsgText)) {

			Reporter.log("The successful message text is : "+actSuccessfulMsgText );
			Reporter.log("The Transaction number is : "+transNo);
		}
		else {

			Reporter.log("Actual and Expected message text are not same ");
			Reporter.log("Actual Message Text is : "+actSuccessfulMsgText);
			Reporter.log("Expected Message Text is : "+expSuccessfulMsgText);
		}

	}

}
