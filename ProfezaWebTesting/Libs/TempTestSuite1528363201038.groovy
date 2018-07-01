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


suiteProperties.put('id', 'Test Suites/LoginTS')

suiteProperties.put('name', 'LoginTS')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Anjali\\Katalon Studio\\ProfezaWebTesting\\Reports\\LoginTS\\20180607_144955\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/LoginTS', suiteProperties, [new TestCaseBinding('Test Cases/Login/T1_nodetails', 'Test Cases/Login/T1_nodetails',  null), new TestCaseBinding('Test Cases/Login/T2_invalidemail', 'Test Cases/Login/T2_invalidemail',  null), new TestCaseBinding('Test Cases/Login/T3_unregisteredemail', 'Test Cases/Login/T3_unregisteredemail',  null), new TestCaseBinding('Test Cases/Login/T4_registeredemail_nopassword', 'Test Cases/Login/T4_registeredemail_nopassword',  null), new TestCaseBinding('Test Cases/Login/T5_registeredemail_shortpassword', 'Test Cases/Login/T5_registeredemail_shortpassword',  null), new TestCaseBinding('Test Cases/Login/T6_registeredemail_wrongpassword', 'Test Cases/Login/T6_registeredemail_wrongpassword',  null), new TestCaseBinding('Test Cases/Login/T7_correctdetails', 'Test Cases/Login/T7_correctdetails',  null)])
