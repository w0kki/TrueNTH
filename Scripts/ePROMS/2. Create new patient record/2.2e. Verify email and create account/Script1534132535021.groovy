import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('TrueNTH/Verify Account page (challenge)/First name field'), GlobalVariable.firstName, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TrueNTH/Verify Account page (challenge)/Last name field'), GlobalVariable.lastName, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TrueNTH/Verify Account page (challenge)/Birthdate/Birthdate day field'), GlobalVariable.birthdateDay, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('TrueNTH/Verify Account page (challenge)/Birthdate/Birthdate month field'), GlobalVariable.birthdateMonth, 
    false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TrueNTH/Verify Account page (challenge)/Birthdate/Birthdate year field'), GlobalVariable.birthdateYear, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TrueNTH/Verify Account page (challenge)/Confirm Identity button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('TrueNTH/Register for TrueNTH page/TrueNTH Header Logo'), 30)

WebUI.delay(1)

WebUI.setText(findTestObject('TrueNTH/Register for TrueNTH page/Password field'), GlobalVariable.password)

WebUI.setText(findTestObject('TrueNTH/Register for TrueNTH page/Retype password field'), GlobalVariable.password)

WebUI.waitForElementClickable(findTestObject('TrueNTH/Register for TrueNTH page/Register button'), 5)

WebUI.click(findTestObject('TrueNTH/Register for TrueNTH page/Register button'))

WebUI.waitForElementPresent(findTestObject('TrueNTH/Register for TrueNTH page/Initial Queries page (initial-queries)/Consent checkbox'), 10)

WebUI.scrollToElement(findTestObject('TrueNTH/Register for TrueNTH page/Initial Queries page (initial-queries)/Consent checkbox'), 0)

WebUI.click(findTestObject('TrueNTH/Register for TrueNTH page/Initial Queries page (initial-queries)/Consent checkbox'))

WebUI.click(findTestObject('TrueNTH/Register for TrueNTH page/Initial Queries page (initial-queries)/Privacy policy and terms checkbox'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/Register for TrueNTH page/Initial Queries page (initial-queries)/Continue to TrueNTH button'), 
    8)

WebUI.click(findTestObject('TrueNTH/Register for TrueNTH page/Initial Queries page (initial-queries)/Continue to TrueNTH button'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/Questionnaires page/Go to questionnaire button'), 20)

