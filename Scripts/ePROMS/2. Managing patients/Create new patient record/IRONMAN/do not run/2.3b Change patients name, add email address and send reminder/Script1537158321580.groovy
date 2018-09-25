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
import java.util.Random as Random

WebUI.scrollToElement(findTestObject('TrueNTH/Patient Profile page - staff/Edit patient information'), 0)

WebUI.click(findTestObject('TrueNTH/Patient Profile page - staff/Edit patient information'))

randomNum = (new Random().nextInt(1000000) + 1)

randomEmail = ((((emailAddress - '@gmail.com') + '+') + randomNum) + '@gmail.com')

WebUI.setText(findTestObject('TrueNTH/Patient Profile page - staff/Email address field'), randomEmail)

WebUI.click(findTestObject('TrueNTH/Patient Profile page - staff/Study ID field'))

WebUI.delay(2)

WebUI.waitForElementNotVisible(findTestObject('TrueNTH/Patient Profile page - staff/change email progress'), 5)

WebUI.setText(findTestObject('TrueNTH/Patient Profile page - staff/First name field'), GlobalVariable.firstName)

WebUI.click(findTestObject('TrueNTH/Patient Profile page - staff/Study ID field'))

WebUI.delay(2)

WebUI.waitForElementNotVisible(findTestObject('TrueNTH/Patient Profile page - staff/change first name progress'), 5)

WebUI.setText(findTestObject('TrueNTH/Patient Profile page - staff/Last name field'), GlobalVariable.lastName)

WebUI.click(findTestObject('TrueNTH/Patient Profile page - staff/Study ID field'))

WebUI.delay(2)

WebUI.waitForElementNotVisible(findTestObject('TrueNTH/Patient Profile page - staff/change last name progress'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('TrueNTH/Patient Profile page - staff/Done editing patient information'))

WebUI.scrollToElement(findTestObject('TrueNTH/Patient Profile page - staff/Send email to patient dropdown'), 0)

'We send an invite or reminder depending on what the "emailType" variable is'
if (emailType == 'Invite') {
    WebUI.selectOptionByLabel(findTestObject('TrueNTH/Patient Profile page - staff/Send email to patient dropdown'), 'TrueNTH Invite', 
        false)
} else if (emailType == 'Reminder') {
    WebUI.selectOptionByLabel(findTestObject('TrueNTH/Patient Profile page - staff/Send email to patient dropdown'), 'TrueNTH Reminder', 
        false)
}

WebUI.waitForElementClickable(findTestObject('TrueNTH/Patient Profile page - staff/Send email button'), 20)

WebUI.click(findTestObject('TrueNTH/Patient Profile page - staff/Send email button'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/Patient Profile page - staff/Send email spinner'), 1)

WebUI.waitForElementNotVisible(findTestObject('TrueNTH/Patient Profile page - staff/Send email spinner'), 10)

WebUI.delay(2)

