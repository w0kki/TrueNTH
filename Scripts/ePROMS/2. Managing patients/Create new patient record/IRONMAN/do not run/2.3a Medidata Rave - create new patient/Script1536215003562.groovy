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
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser(medidataRaveUrl)

WebUI.waitForElementPresent(findTestObject('Medidata Rave/Login Page/Log in button'), 60)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Medidata Rave/Login Page/Username field'), '/qjhZNSp4Yii0EIPsBBUbQ==')

WebUI.setEncryptedText(findTestObject('Medidata Rave/Login Page/Password field'), 'skVV2joIL3AAv+yUSGe6LA==')

WebUI.click(findTestObject('Medidata Rave/Login Page/Log in button'))

WebUI.waitForElementClickable(findTestObject('Medidata Rave/Home page/IRONMAN UAT link'), 90)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/Home page/IRONMAN UAT link'))

WebUI.waitForElementPresent(findTestObject('Medidata Rave/IRONMAN Site Selection/Table of sites'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/IRONMAN Site Selection/Roswell Park Cancer Institute'))

WebUI.waitForElementClickable(findTestObject('Medidata Rave/IRONMAN Site Selection/Site Selected/Add Subject'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/IRONMAN Site Selection/Site Selected/Last page button'))

WebUI.waitForPageLoad(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table[@id=\'_ctl0_Content_ListDisplayNavigation_dgObjects\']/tbody' //locate table
        ))

List<WebElement> rows_table = Table.findElements(By.tagName('tr' //locate all the rows on the table
        ))

int rows_count = rows_table.size( //calculate number of rows in table
    )

int last_row = rows_count - 1 //last row

//locate columns of row
List<WebElement> columns_row = rows_table.get(last_row).findElements(By.tagName('td'))

//locate column 2 of last row
String last_subject = columns_row.get(1).getText( //string is in format xxx-yy-zzz, where the subject id is zzz
    )

String[] parts = last_subject.split('-')

String part1 = parts[0]

String part2 = parts[1]

String part3 = parts[2]

int last_id = Integer.parseInt(part3 //convert last subject id to string
    )

new_id = (last_id + 1 //add 1 to last subject id
)

new_id_formatted = String.format('%03d', new_id //convert to the format zzz
    )

WebUI.click(findTestObject('Medidata Rave/IRONMAN Site Selection/Site Selected/Add Subject'))

WebUI.waitForElementPresent(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/Subject ID field'), 0)

WebUI.delay(1)

WebUI.setText(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/Subject ID field'), new_id_formatted)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/Save button'))

WebUI.waitForElementClickable(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/Eligibility'), 
    30)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/Eligibility'))

WebUI.waitForElementPresent(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Demographics/Save button'), 
    0)

WebUI.delay(1)

WebUI.setText(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Demographics/DOB (date)'), 
    GlobalVariable.birthdateDay)

WebUI.selectOptionByValue(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Demographics/DOB (month)'), 
    GlobalVariable.birthdateMonthShort, false)

WebUI.setText(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Demographics/DOB (year)'), 
    GlobalVariable.birthdateYear)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Demographics/Save button'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent link'))

WebUI.waitForElementPresent(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Save button'), 
    30)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Patient signed consent - Yes'))

WebUI.setText(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Consent Date/Consent Day'), 
    GlobalVariable.consentDay)

WebUI.selectOptionByLabel(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Consent Date/Consent Month'), 
    GlobalVariable.consentMonth, false)

WebUI.setText(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Consent Date/Consent Year'), 
    GlobalVariable.consentYear)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Consent archival tissue - Yes'))

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Consent SSN ID'))

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Informed Consent/Save button'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Inclusion criteria link'))

WebUI.waitForElementPresent(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Inclusion criteria/Save button'), 
    30)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Inclusion Criteria/Eligibility requirements - Yes'))

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/2.1 Eligibility/Inclusion Criteria/Save button'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Medidata Rave/Add Subject/1. Enter Subject ID/2. Subject page (after adding new subject)/Subject tab'))

WebUI.waitForElementPresent(findTestObject('Medidata Rave/Add Subject/3. Subject profile after completing eligibility information/TrueNTH Integration link'), 
    0)

WebUI.click(findTestObject('Medidata Rave/Add Subject/3. Subject profile after completing eligibility information/TrueNTH Integration link'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Medidata Rave/Add Subject/3. Subject profile after completing eligibility information/TrueNTH Integration/TrueNTH User ID'), 
    0)

truenthID = WebUI.getText(findTestObject('Medidata Rave/Add Subject/3. Subject profile after completing eligibility information/TrueNTH Integration/TrueNTH User ID'), 
    FailureHandling.STOP_ON_FAILURE)

return truenthID

