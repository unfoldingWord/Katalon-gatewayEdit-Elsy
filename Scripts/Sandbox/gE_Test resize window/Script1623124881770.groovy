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
import javax.swing.JOptionPane;
CustomKeywords.'loginHelper.loginToApp.logintoapp'()
CustomKeywords.'loginHelper.AccountSettings.organization'('')
CustomKeywords.'loginHelper.AccountSettings.language'('')
CustomKeywords.'loginHelper.selectFile.book'('Matthew')
WebUI.delay(2)
WebUI.setViewPortSize(1360, 876)
WebUI.delay(2)
//large= WebUI.takeScreenshot()
WebUI.verifyImagePresent(findTestObject('Object Repository/screenshot elements/Large size'), FailureHandling.STOP_ON_FAILURE)
WebUI.setViewPortSize(900, 1076) //large
JOptionPane.showMessageDialog(null,"large size",
	"Message",
	JOptionPane.PLAIN_MESSAGE);
//WebUI.verifyImagePresent(findTestObject('Object Repository/screenshot elements/Large size'), FailureHandling.STOP_ON_FAILURE)
WebUI.setViewPortSize(680, 976) //
WebUI.delay(2)
JOptionPane.showMessageDialog(null,"small size",
	"Message",
	JOptionPane.PLAIN_MESSAGE);
WebUI.verifyImagePresent(findTestObject('Object Repository/screenshot elements/small size'), FailureHandling.STOP_ON_FAILURE)
WebUI.setViewPortSize(500, 976)//max shrink
WebUI.delay(2)
WebUI.setViewPortSize(300, 976)
WebUI.delay(2)

WebUI.scrollToPosition(60, 20)
WebUI.delay(2)

JOptionPane.showMessageDialog(null,"Xs size",
	"Message",
	JOptionPane.PLAIN_MESSAGE);
WebUI.verifyImagePresent(findTestObject('Object Repository/screenshot elements/xs'), FailureHandling.STOP_ON_FAILURE)
WebUI.setViewPortSize(645, 976)//desired
WebUI.delay(2)




WebUI.closeBrowser()