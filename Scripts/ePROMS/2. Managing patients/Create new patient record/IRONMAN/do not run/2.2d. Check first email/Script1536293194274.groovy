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

if (emailType == 'invite') {
    emailSubject = 'Get Started: Verify Your TrueNTH Account'
} else if (emailType == 'reminder') {
    emailSubject = 'Reminder: Complete Your IRONMAN Questionnaire'
} else if (emailType == 'password') {
    emailSubject == 'TrueNTH Reset Password'
}

WebUI.waitForElementPresent(findTestObject('Gmail/Inbox/Search bar'), 0)

WebUI.delay(1)

unreadClass = WebUI.getAttribute(findTestObject('Gmail/Inbox/First email read status'), 'class')

'If the email is unread, it will have the class "zF".\nIf the email is read, it will have the class "yP"'
assert WebUI.verifyMatch(unreadClass, 'zF', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Gmail/Inbox/First email read status'))

WebUI.delay(1)

WebUI.click(findTestObject('Gmail/Inbox/Verification email/Verify Account button'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('TrueNTH/Register for TrueNTH page/TrueNTH Header Logo'), 60)

