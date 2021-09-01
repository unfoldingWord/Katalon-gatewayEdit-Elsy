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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

import org.apache.commons.io.FileUtils

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


Path projectdir = Paths.get(RunConfiguration.getProjectDir())
Path datadir = projectdir.resolve('Data Files/images')
Path workdir = projectdir.resolve('tmp/TC2')
if (Files.exists(workdir)) {
	FileUtils.deleteDirectory(workdir.toFile())
}
Files.createDirectories(workdir)

CustomKeywords.'loginHelper.loginToApp.logintoapp'()
CustomKeywords.'loginHelper.AccountSettings.organization'('')
CustomKeywords.'loginHelper.AccountSettings.language'('')
CustomKeywords.'loginHelper.selectFile.book'('Matthew')

//TestObject LargeImage = findTestObject('Object Repository/screenshot elements/Large size')

//WebUI.verifyElementPresent(LargeImage, 10)

CustomKeywords.'unfoldingWord.captureScreenshot.setForceSnapshots'(true)
TestObject Image = findTestObject('Object Repository/screenshot elements/Large size')
File file1 = datadir.resolve('large-image.png').toFile()
CustomKeywords.'unfoldingWord.captureScreenshot.saveElementImage'(
	Image,
	file1)
CustomKeywords.'unfoldingWord.captureScreenshot.verifyImagesAreSimilar'(
	file1,
	Image,
	3.0,
	workdir.resolve('a').toFile(),
	FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setViewPortSize(680, 976) //
WebUI.delay(2)
CustomKeywords.'unfoldingWord.captureScreenshot.setForceSnapshots'(true)
TestObject imageSmall = findTestObject('Object Repository/screenshot elements/small size')
File file2 = datadir.resolve('small-image.png').toFile()
CustomKeywords.'unfoldingWord.captureScreenshot.saveElementImage'(
	imageSmall,
	file2)
CustomKeywords.'unfoldingWord.captureScreenshot.verifyImagesAreSimilar'(
	file2,
	imageSmall,
	3.0,
	workdir.resolve('a').toFile(),
	FailureHandling.CONTINUE_ON_FAILURE)

/*CustomKeywords.'unfoldingWord.captureScreenshot.verifyImagesAreDifferent'(
	file2,
	imageSmall,
	3.0,
	workdir.resolve('a').toFile(),
	FailureHandling.CONTINUE_ON_FAILURE)*/

WebUI.closeBrowser()