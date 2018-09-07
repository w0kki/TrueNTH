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

'ePROMS Demo\n'
WebUI.openBrowser(GlobalVariable.url)

not_run: WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('TrueNTH/TrueNTH Page/Log in button'), 180)

WebUI.delay(1)

WebUI.click(findTestObject('TrueNTH/TrueNTH Page/Log in button'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/Log in page/Email address field'), 30)

WebUI.delay(1)

WebUI.setText(findTestObject('TrueNTH/Log in page/Email address field'), GlobalVariable.staffUsername)

WebUI.setText(findTestObject('TrueNTH/Log in page/Password field'), GlobalVariable.staffPassword)

WebUI.click(findTestObject('TrueNTH/Log in page/Log in'))

WebUI.waitForElementVisible(findTestObject('TrueNTH/Patients page/Patients Table'), 600)

WebUI.delay(1)

