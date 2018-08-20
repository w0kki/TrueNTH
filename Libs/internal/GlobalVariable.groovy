package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object buildFileDirectory
     
    /**
     * <p></p>
     */
    public static Object buildTextFile
     
    /**
     * <p></p>
     */
    public static Object profile
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object birthdateDay
     
    /**
     * <p></p>
     */
    public static Object birthdateMonthName
     
    /**
     * <p></p>
     */
    public static Object birthdateYear
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object birthdateMonth
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('ePROMS - demo', allVariables['default'] + ['url' : 'https://demo-eproms.us.truenth.org/', 'buildFileDirectory' : '/Users/warren.cheong/Desktop/Katalon Studio tests/TrueNTH builds', 'buildTextFile' : 'ePROMS_demo.txt', 'profile' : 'demo', 'firstName' : 'Auto', 'lastName' : 'Demo', 'birthdateDay' : '1', 'birthdateMonthName' : 'January', 'birthdateYear' : '1990', 'password' : 'Truenth1', 'birthdateMonth' : '01'])
        allVariables.put('ePROMS - stg', allVariables['default'] + ['url' : 'https://stg-eproms.us.truenth.org/', 'buildFileDirectory' : '/Users/warren.cheong/Desktop/Katalon Studio tests/TrueNTH builds', 'buildTextFile' : 'ePROMS_stg.txt', 'profile' : 'Stg', 'firstName' : 'Auto', 'lastName' : 'Stg', 'birthdateDay' : '1', 'birthdateMonthName' : 'January', 'birthdateYear' : '1990', 'password' : 'Truenth1', 'birthdateMonth' : '01'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        url = selectedVariables['url']
        buildFileDirectory = selectedVariables['buildFileDirectory']
        buildTextFile = selectedVariables['buildTextFile']
        profile = selectedVariables['profile']
        firstName = selectedVariables['firstName']
        lastName = selectedVariables['lastName']
        birthdateDay = selectedVariables['birthdateDay']
        birthdateMonthName = selectedVariables['birthdateMonthName']
        birthdateYear = selectedVariables['birthdateYear']
        password = selectedVariables['password']
        birthdateMonth = selectedVariables['birthdateMonth']
        
    }
}
