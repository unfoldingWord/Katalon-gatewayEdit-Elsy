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

/**
 * 1. open Google Search page,
 * 2. take screenshot of the logo graphics <canvas id="hpcanvas"> to save it into file,
 * 3. wait for one second ... graphics may change
 * 4. compare the file and the web page; verify 2 images are similar
 */
Path projectdir = Paths.get(RunConfiguration.getProjectDir())
Path datadir = projectdir.resolve('Data Files/images')
Path workdir = projectdir.resolve('tmp/TC2')
if (Files.exists(workdir)) {
	FileUtils.deleteDirectory(workdir.toFile())
}
Files.createDirectories(workdir)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com')

//TestObject btnK = findTestObject('Object Repository/Page_Google/input_btnK')

//WebUI.verifyElementPresent(btnK, 10)

CustomKeywords.'unfoldingWord.captureScreenshot.setForceSnapshots'(true)

TestObject logoArea = findTestObject('Object Repository/First/div_logoArea')
File file1 = datadir.resolve('google_logo.png').toFile()
CustomKeywords.'unfoldingWord.captureScreenshot.saveElementImage'(
	logoArea,
	file1)
CustomKeywords.'unfoldingWord.captureScreenshot.verifyImagesAreSimilar'(
	file1,
	logoArea,
	3.0,
	workdir.resolve('a').toFile(),
	FailureHandling.CONTINUE_ON_FAILURE)


File file2 = datadir.resolve('halloween2.png').toFile()
CustomKeywords.'unfoldingWord.captureScreenshot.verifyImagesAreSimilar'(
	file2,
	logoArea,
	3.0,
	workdir.resolve('b').toFile(),
	FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'unfoldingWord.captureScreenshot.verifyImagesAreDifferent'(
	file1,
	logoArea,
	3.0,
	workdir.resolve('c').toFile(),
	FailureHandling.CONTINUE_ON_FAILURE)


CustomKeywords.'unfoldingWord.captureScreenshot.verifyImagesAreDifferent'(
	file2,
	logoArea,
	3.0,
	workdir.resolve('d').toFile(),
	FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

