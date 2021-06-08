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
CustomKeywords.'loginHelper.selectFile.book'('Philemon')

word1 = findTestObject('Object Repository/twl/td_paul')
word2= findTestObject('Object Repository/twl/td_prison')
word3= findTestObject('Object Repository/twl/td_christ')
greekword1= findTestObject('Object Repository/twl/span_paul greek')
greekword2= findTestObject('Object Repository/twl/span_prison greek')
greekword3= findTestObject('Object Repository/twl/span_Christ greek')
def greekWordList= [greekword1,greekword2,greekword3 ]
def wordList=[word1, word2, word3]

for (j=0; j<greekWordList.size();)
{
	for(i=0; i< wordList.size(); i++)
		{WebUI.click(wordList[i])
		println("Clicking on "+ wordList[i])
	
	if(WebUI.verifyElementAttributeValue(greekWordList[j], 'data-testselected', 'true', 2))
		{
			println("Selected word "+ greekWordList[j] +"is highlighted")
		}
		else {
			println("Selected word "+ greekWordList[j] + "is not highlighted")
		}
	j++
	}
}

WebUI.closeBrowser()