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

WebUI.click(findTestObject('TrueNTH/Patients page/Create patient button'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/New Patient Page/New Patient form'), 30)

WebUI.delay(1)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/First name field'), firstName)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Last name field'), lastName)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Birthdate/Date field'), birthdayDate)

WebUI.selectOptionByLabel(findTestObject('TrueNTH/New Patient Page/Birthdate/Month field'), birthdayMonth, false)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Birthdate/Year field'), birthdayYear)

randomNum = (new Random().nextInt(1000000) + 1)

randomEmail = ((((emailAddress - '@gmail.com') + '+') + randomNum) + '@gmail.com')

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Email address field'), randomEmail)

'If user has no email address, change the "noEmail" variable to true'
if (noEmail == true) {
    WebUI.click(findTestObject('TrueNTH/New Patient Page/No email address checkbox'))
}

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Cell field'), cellNumber)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Phone (other) field'), otherPhoneNumber)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Study ID field'), studyID)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Study Consent Date/Date field'), consentDate)

WebUI.selectOptionByLabel(findTestObject('TrueNTH/New Patient Page/Study Consent Date/Month field'), consentMonth, false)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Study Consent Date/Year field'), consentYear)

'Must select the same test object as the "Check" step below (the clinic that this user is a patient of)\n'
WebUI.scrollToElement(findTestObject('TrueNTH/New Patient Page/Sites/Australia/Australia Recruiting Site B/AU B Child Site 2'), 
    0)

'To change the clinic, change to the appropriate test object. Don\'t forget to change "Scroll to Element" step\'s test object to the same site\n'
WebUI.check(findTestObject('TrueNTH/New Patient Page/Sites/Australia/Australia Recruiting Site B/AU B Child Site 2'))

WebUI.scrollToElement(findTestObject('TrueNTH/New Patient Page/Save button'), 0)

WebUI.click(findTestObject('TrueNTH/New Patient Page/Save button'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/Patient Profile page - staff/Profile form'), 30)

