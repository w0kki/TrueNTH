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
    public static Object userPassword
     
    /**
     * <p></p>
     */
    public static Object birthdateMonth
     
    /**
     * <p></p>
     */
    public static Object staffUsername
     
    /**
     * <p></p>
     */
    public static Object staffPassword
     
    /**
     * <p></p>
     */
    public static Object testUsername
     
    /**
     * <p></p>
     */
    public static Object testPassword
     
    /**
     * <p></p>
     */
    public static Object treatmentDay
     
    /**
     * <p></p>
     */
    public static Object treatmentMonthName
     
    /**
     * <p></p>
     */
    public static Object treatmentMonth
     
    /**
     * <p></p>
     */
    public static Object consentDay
     
    /**
     * <p></p>
     */
    public static Object consentMonth
     
    /**
     * <p></p>
     */
    public static Object consentYear
     
    /**
     * <p></p>
     */
    public static Object birthdateMonthShort
     
    /**
     * <p></p>
     */
    public static Object treatmentYear
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('ePROMs IRONMAN - demo', allVariables['default'] + ['url' : 'https://demo-eproms.us.truenth.org/', 'buildFileDirectory' : '/Users/warren.cheong/Desktop/Katalon Studio tests/TrueNTH builds', 'buildTextFile' : 'ePROMS_demo.txt', 'profile' : 'demo', 'firstName' : 'Auto', 'lastName' : 'Demo', 'birthdateDay' : '1', 'birthdateMonthName' : 'January', 'birthdateYear' : '1990', 'userPassword' : 'Truenth1', 'birthdateMonth' : '01', 'staffUsername' : 'truenthdemo+pcctc@gmail.com', 'staffPassword' : 'Pcctc123', 'testUsername' : 'truenthauto@gmail.com', 'testPassword' : 'Truenth1', 'treatmentDay' : '31', 'treatmentMonthName' : 'December', 'treatmentMonth' : '12', 'consentDay' : '1', 'consentMonth' : 'Aug', 'consentYear' : '2018', 'birthdateMonthShort' : 'Jan'])
        allVariables.put('ePROMs IRONMAN - stg', allVariables['default'] + ['url' : 'https://stg-eproms.us.truenth.org/', 'buildFileDirectory' : '/Users/warren.cheong/Desktop/Katalon Studio tests/TrueNTH builds', 'buildTextFile' : 'ePROMS_stg.txt', 'profile' : 'Stg', 'firstName' : 'Auto', 'lastName' : 'Stg', 'birthdateDay' : '1', 'birthdateMonthName' : 'January', 'birthdateYear' : '1990', 'userPassword' : 'Truenth1', 'birthdateMonth' : '01', 'staffUsername' : 'truenthdemo+pcctc@gmail.com', 'staffPassword' : 'Pcctc123', 'testUsername' : 'truenthauto@gmail.com', 'testPassword' : 'Truenth1', 'treatmentDay' : '31', 'treatmentMonthName' : 'December', 'consentDay' : '1', 'consentMonth' : 'Aug', 'consentYear' : '2018', 'birthdateMonthShort' : 'Jan'])
        allVariables.put('ePROMs TNGR - stg', allVariables['default'] + ['url' : 'https://stg-eproms.us.truenth.org/', 'buildFileDirectory' : '/Users/warren.cheong/Desktop/Katalon Studio tests/TrueNTH builds', 'buildTextFile' : 'ePROMS_stg.txt', 'profile' : 'Stg', 'firstName' : 'Auto', 'lastName' : 'Stg', 'birthdateDay' : '1', 'birthdateMonthName' : 'January', 'birthdateYear' : '1990', 'userPassword' : 'Truenth1', 'staffUsername' : 'truenthdemo+auacrv@gmail.com', 'staffPassword' : 'AuaCrv123', 'testUsername' : 'truenthauto+tngr@gmail.com', 'testPassword' : 'Truenth1', 'treatmentDay' : '1', 'treatmentMonthName' : 'August', 'treatmentYear' : '2018', 'birthdateMonth' : '01'])
        
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
        userPassword = selectedVariables['userPassword']
        birthdateMonth = selectedVariables['birthdateMonth']
        staffUsername = selectedVariables['staffUsername']
        staffPassword = selectedVariables['staffPassword']
        testUsername = selectedVariables['testUsername']
        testPassword = selectedVariables['testPassword']
        treatmentDay = selectedVariables['treatmentDay']
        treatmentMonthName = selectedVariables['treatmentMonthName']
        treatmentMonth = selectedVariables['treatmentMonth']
        consentDay = selectedVariables['consentDay']
        consentMonth = selectedVariables['consentMonth']
        consentYear = selectedVariables['consentYear']
        birthdateMonthShort = selectedVariables['birthdateMonthShort']
        treatmentYear = selectedVariables['treatmentYear']
        
    }
}
