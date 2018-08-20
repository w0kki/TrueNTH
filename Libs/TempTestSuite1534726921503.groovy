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


suiteProperties.put('id', 'Test Suites/Create a new patient')

suiteProperties.put('name', 'Create a new patient')

suiteProperties.put('description', 'This includes logging in, and creating a new patient')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/warren.cheong/Desktop/Katalon Studio tests/TrueNTH/Reports/Create a new patient/20180820_110201/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Create a new patient', suiteProperties, [new TestCaseBinding('Test Cases/ePROMS/1. Log in/1.2. Log in - Staff', 'Test Cases/ePROMS/1. Log in/1.2. Log in - Staff',  null), new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2a. Create a new patient - with email address', 'Test Cases/ePROMS/2. Create new patient record/2.2a. Create a new patient - with email address',  null), new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2b. Send patient Email', 'Test Cases/ePROMS/2. Create new patient record/2.2b. Send patient Email',  null), new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2c. Log in to gmail', 'Test Cases/ePROMS/2. Create new patient record/2.2c. Log in to gmail',  null), new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2d. Check first email', 'Test Cases/ePROMS/2. Create new patient record/2.2d. Check first email',  null), new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2e. Verify email and create account', 'Test Cases/ePROMS/2. Create new patient record/2.2e. Verify email and create account',  null)])
