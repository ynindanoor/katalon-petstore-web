package petstoreweb

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

public class login {
	@Keyword
	def loginSteps(String username, String password, String testType, String expected) {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login-Page/btnSignIn'), 0)
		WebUI.click(findTestObject('Object Repository/Login-Page/btnSignIn'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login-Page/inputUsername'), 0)
		WebUI.setText(findTestObject('Object Repository/Login-Page/inputUsername'), username)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login-Page/inputPassword'), 0)
		WebUI.setText(findTestObject('Object Repository/Login-Page/inputPassword'), password)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login-Page/btnLogin'), 0)
		WebUI.click(findTestObject('Object Repository/Login-Page/btnLogin'))
		
		if(testType == 'P') {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Login-Page/btnSignOut'), 0)
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Login-Page/btnSignOut'))
		} else {
			if (!(username || password)) {
				WebUI.verifyTextPresent(WebUI.verifyTextPresent('Invalid username or password. Signon failed.', false), false)
			}
			WebUI.verifyTextPresent(expected, false)
		}
		WebUI.delay(5)
	}
	
}
