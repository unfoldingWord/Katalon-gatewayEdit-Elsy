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

//WebUI.click(findTestObject('Object Repository/First/svg_gatewayEdit_combo-box-arrow-bible'))

//WebUI.click(findTestObject('First/bookname_parmed'))
//WebUI.click(findTestObject('Object Repository/First/p_Titus (tit)'))

WebUI.click(findTestObject('Object Repository/First/div_1 of 4'))

WebUI.click(findTestObject('Object Repository/First/svg_translationNotes_resource_card_tn_next'))

WebUI.click(findTestObject('Object Repository/First/label_'))

WebUI.click(findTestObject('Object Repository/First/label_ (1)'))

//WebUI.closeBrowser()

