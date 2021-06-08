package loginHelper

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class AccountSettings {
	@Keyword
	def organization(String organization) {
		if (organization == '') {
			organization = GlobalVariable.organization
		}
		println('Choosing organization ' + organization)

		WebUI.click(findTestObject('Object Repository/First/div_org'))

		WebUI.click(findTestObject('Object Repository/First/org-parmed', [('org_code') : organization]))

		def alerted = WebUI.waitForAlert(2)

		if (alerted == true) {
			println('Alerted on Organization')

			//GlobalVariable.alertFlag = true
		} else {
			println('Not alerted on organization')

			//GlobalVariable.alertFlag = false
		}
	}
	@Keyword
	def language(String language) {
		if (language == '') {
			language = GlobalVariable.langCode
		}
		println('Choosing language ' + language)

		WebUI.click(findTestObject('Object Repository/First/div_lang'))
		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/First/language parmed', [('lang_code') : language]))


		WebUI.click(findTestObject('Object Repository/First/span_Save and Continue'))
	}
}
