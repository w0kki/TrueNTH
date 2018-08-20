import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/gmail')

suiteProperties.put('name', 'gmail')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/warren.cheong/Desktop/Katalon Studio tests/TrueNTH/Reports/gmail/20180817_113025/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/gmail', suiteProperties, [new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2c. Log in to gmail', 'Test Cases/ePROMS/2. Create new patient record/2.2c. Log in to gmail',  null), new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2d. Check first email', 'Test Cases/ePROMS/2. Create new patient record/2.2d. Check first email',  null), new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2e. Verify email and create account', 'Test Cases/ePROMS/2. Create new patient record/2.2e. Verify email and create account',  null)])
