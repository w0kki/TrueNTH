import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/lk/qb8jdl254rn9yvjjv3_5vgrh0000gn/T/Katalon/Test Cases/ePROMS/2. Create new patient record/2.2e. Verify email and create account/20180817_113654/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/ePROMS/2. Create new patient record/2.2e. Verify email and create account', new TestCaseBinding('Test Cases/ePROMS/2. Create new patient record/2.2e. Verify email and create account',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
