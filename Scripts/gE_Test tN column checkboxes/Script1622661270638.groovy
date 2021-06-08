import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
CustomKeywords.'loginHelper.loginToApp.logintoapp'()
CustomKeywords.'loginHelper.AccountSettings.organization'('')
CustomKeywords.'loginHelper.AccountSettings.language'('')
CustomKeywords.'loginHelper.selectFile.book'('')
WebUI.click(findTestObject('Object Repository/tN Card/svg_translationNotes_resource_card_tn_card_menu'))
WebUI.delay(2)
if (WebUI.verifyElementChecked(findTestObject('Object Repository/tN Card/input_Reference_ID'), 1))
//if (WebUI.verifyElementAttributeValue(findTestObject('Object Repository/tN Card/input_Reference_ID'), 'checked','true', 2))
{
	println("Id checkbox is checked")
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/tN Card/input_Reference_ID'))
	println("Id checkbox is unchecked by the script successfully")
}
else
{
	println("Id checkbox was unchecked when file is opened")
}
if (WebUI.verifyElementChecked(findTestObject('Object Repository/tN Card/input_ID_Occurrence'), 1))
	{
		println("Occurrence checkbox is checked")
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/tN Card/input_ID_Occurrence'))
		println("Occurrence checkbox is unchecked by the script successfully")
	}
	else
	{
		println("Occurrence checkbox was unchecked when file is opened")
	}

//check the checkbox
WebUI.click(findTestObject('Object Repository/tN Card/input_Reference_ID'))
WebUI.click(findTestObject('Object Repository/tN Card/input_ID_Occurrence'))
if (WebUI.verifyElementChecked(findTestObject('Object Repository/tN Card/input_Reference_ID'), 1))
	{
	
		println("Id checkbox is checked by the script successfully")
	}
	else
	{
		println("Error: ID checkbox was not checked again")
	}
	// checking for duplicate columns for new TSV formats
	
	//list all the columns in test_org
	ColumnList= WebUI.getText(findTestObject('Object Repository/tN Card/div_Show ColumnsList'))
	println("The columns in tN card are"+ ColumnList)
	WebUI.click(findTestObject('Object Repository/tN Card/svg_translationNotes Settings_settings_card_close'))
	//Change org
	WebUI.click(findTestObject('Object Repository/tN Card/button_gatewayEdit_Hamburger menu'))
	WebUI.click(findTestObject('Object Repository/tN Card/font_Account Settings'))
	CustomKeywords.'loginHelper.AccountSettings.organization'('test_org2')
	WebUI.click(findTestObject('Object Repository/First/span_Save and Continue'))
	WebUI.click(findTestObject('Object Repository/tN Card/svg_translationNotes_resource_card_tn_card_menu'))
	ColumnList2= WebUI.getText(findTestObject('Object Repository/tN Card/div_Show ColumnsList'))
	println("The columns in tN card are"+ ColumnList2)
	if (ColumnList == ColumnList2)
	{
		println("Columns are in same order")
	}
	else {
		println("Columns are in different order")
	}
	//CHECK the extra checkboxes
	//test element code
	if(WebUI.verifyElementChecked(findTestObject('Object Repository/tN Card/input_Occurrence Note'), 2, FailureHandling.OPTIONAL))
	{
		println("Column Occurrence Note is checked")

	}
	else
	{
		println("Column Occurrence Note is not checked")
	}
	WebUI.click(findTestObject('Object Repository/tN Card/input_Occurrence Note'))
	//test element code
	if(WebUI.verifyElementChecked(findTestObject('Object Repository/tN Card/input_Occurrence Note'), 2, FailureHandling.OPTIONAL))
		{
			println("Column Occurrence Note is checked")
	
		}
		else
		{
			println("Column Occurrence Note is not checked")
		}
		if(WebUI.verifyElementChecked(findTestObject('Object Repository/tN Card/input_Original Quote'), 2, FailureHandling.OPTIONAL))
			{
				println("Column OriginaL Quote is checked")
		
			}
			else
			{
				println("Column OriginaL Quote is not checked")
			}
	WebUI.click(findTestObject('Object Repository/tN Card/input_Original Quote'))
	WebUI.click(findTestObject('Object Repository/tN Card/input_GL Quote'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/tN Card/svg_translationNotes Settings_settings_card_close'))
	WebUI.delay(2)
	//login to test_org
	WebUI.click(findTestObject('Object Repository/tN Card/button_gatewayEdit_Hamburger menu'))
	WebUI.click(findTestObject('Object Repository/tN Card/font_Account Settings'))
	CustomKeywords.'loginHelper.AccountSettings.organization'('test_org')
	WebUI.click(findTestObject('Object Repository/First/span_Save and Continue'))
	WebUI.click(findTestObject('Object Repository/tN Card/div_tN Card'))
	//WebUI.verifyElementChecked(findTestObject('Object Repository/tN Card/div_tN Card'), 2, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('Object Repository/tN Card/legend_Note'), 2)
	// verify the extra columns

	if(WebUI.verifyElementPresent(findTestObject('Object Repository/tN Card/legend_GLQuote'), 1, FailureHandling.OPTIONAL))
	{
		println("Error:Duplicate column for GLQuote is present in the card")
	}
	else {
		println("Duplicate column for GL Quote is not present in the card")
	}
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/tN Card/legend_OccurrenceNote'), 1, FailureHandling.OPTIONAL ))
		{
			println("Error:Duplicate column for Note is present in the card")
		}
		else {
			println("Duplicate column for Note is not present in the card")
		}
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/tN Card/legend_OrigQuote'), 1, FailureHandling.OPTIONAL ))
		{
			println("Error:Duplicate column for Original Quote is present in the card")
		}
		else {
			println("Duplicate column for Original Quote is not present in the card")
		}
	
	WebUI.closeBrowser()