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

WebUI.callTestCase(findTestCase('ePROMS/1. Log in/1.2. Log in - Staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ePROMS/2. Managing patients/Create new patient record/TNGR/do not run/2.2a. Create a new patient - with email address (TNGR ONLY)'), 
    [('birthdayDate') : '1', ('birthdayMonth') : 'January', ('birthdayYear') : '1960', ('emailAddress') : 'truenthauto@gmail.com'
        , ('noEmail') : false, ('cellNumber') : '1234567890', ('otherPhoneNumber') : '12345678', ('studyID') : '', ('consentDate') : '1'
        , ('consentMonth') : 'August', ('consentYear') : '2018'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ePROMS/2. Managing patients/Create new patient record/TNGR/do not run/2.2b. Send patient Email (TNGR ONLY)'), 
    [('emailType') : 'Invite'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Wait 5 mins'), [('minutes') : 5], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Wait 10 mins'), [('minutes') : 10], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Wait 30 mins'), [('minutes') : 30], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ePROMS/2. Managing patients/Create new patient record/TNGR/do not run/2.2c. Log in to gmail'), 
    [('email') : 'truenthauto@gmail.com', ('password') : 'truenth!'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ePROMS/2. Managing patients/Create new patient record/TNGR/do not run/2.2d. Check first email'), 
    [('emailType') : 'invite'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ePROMS/2. Managing patients/Create new patient record/TNGR/do not run/2.2e. Verify email and create account'), 
    [:], FailureHandling.STOP_ON_FAILURE)

