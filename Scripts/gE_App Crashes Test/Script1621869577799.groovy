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
//#87, #124
CustomKeywords.'loginHelper.loginToApp.loginApp'("https://gateway-edit.netlify.app/","test001", "Test2021!")
ErrorMessage= WebUI.getText(findTestObject('Object Repository/First/Error message'))
println(ErrorMessage)
if( ErrorMessage =="The application can not continue. The current username is not part of a DCS organization. Please contact your administrator.")
{
	println("Getting Error message as expected")
}
else {
	println("ERROR: Error message does not show up when user is not part of the org")
}
 WebUI.click(findTestObject('Object Repository/tN Card/button_gatewayEdit_Hamburger menu'))
 WebUI.click(findTestObject('Object Repository/First/span_Logout'))
 CustomKeywords.'loginHelper.loginToApp.logintoapp'()
 CustomKeywords.'loginHelper.AccountSettings.organization'('')
 CustomKeywords.'loginHelper.AccountSettings.language'('')

 WebUI.click(findTestObject('Object Repository/tN Card/button_gatewayEdit_Hamburger menu'))
 WebUI.click(findTestObject('Object Repository/tN Card/font_Account Settings'))
 CustomKeywords.'loginHelper.AccountSettings.organization'('unfoldingWord')
 CustomKeywords.'loginHelper.AccountSettings.language'('es')
 //WebUI.click(findTestObject('Object Repository/First/lang-selection'))
 //WebUI.scrollToElement
 //WebUI.click(findTestObject('Object Repository/First/li_en - English - English'))
// WebUI.click(findTestObject('Object Repository/First/span_Save and Continue'))
 WebUI.delay(2)
//WebUI.closeBrowser()