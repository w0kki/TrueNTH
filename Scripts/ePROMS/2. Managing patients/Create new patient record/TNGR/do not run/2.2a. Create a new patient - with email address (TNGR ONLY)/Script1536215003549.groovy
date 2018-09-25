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

WebUI.waitForElementVisible(findTestObject('TrueNTH/New Patient Page/New Patient form'), 120)

WebUI.delay(1)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/First name field'), GlobalVariable.firstName)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Last name field'), GlobalVariable.lastName)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Birthdate/Date field'), GlobalVariable.birthdateDay)

WebUI.selectOptionByLabel(findTestObject('TrueNTH/New Patient Page/Birthdate/Month field'), GlobalVariable.birthdateMonthName, 
    false)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Birthdate/Year field'), GlobalVariable.birthdateYear)

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

randomTreatment = (new Random().nextInt(9) + 1)

WebUI.scrollToElement(findTestObject('TrueNTH/New Patient Page/Clinical Data/Treatment options'), 0)

WebUI.selectOptionByIndex(findTestObject('TrueNTH/New Patient Page/Clinical Data/Treatment options'), randomTreatment, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Clinical Data/Treatment Day field'), GlobalVariable.treatmentDay)

WebUI.selectOptionByLabel(findTestObject('TrueNTH/New Patient Page/Clinical Data/Treatment Month field'), GlobalVariable.treatmentMonthName, 
    false)

WebUI.setText(findTestObject('TrueNTH/New Patient Page/Clinical Data/Treatment Year field'), GlobalVariable.treatmentYear)

WebUI.scrollToElement(findTestObject('TrueNTH/New Patient Page/Save button'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('TrueNTH/New Patient Page/Save button'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/Patient Profile page - staff/Send email to patient dropdown'), 180)

