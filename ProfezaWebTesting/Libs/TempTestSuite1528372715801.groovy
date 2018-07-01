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


suiteProperties.put('id', 'Test Suites/ForgotPasswordTS')

suiteProperties.put('name', 'ForgotPasswordTS')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Anjali\\Katalon Studio\\ProfezaWebTesting\\Reports\\ForgotPasswordTS\\20180607_172830\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/ForgotPasswordTS', suiteProperties, [new TestCaseBinding('Test Cases/ForgotPassword/T1_correctemail', 'Test Cases/ForgotPassword/T1_correctemail',  null), new TestCaseBinding('Test Cases/ForgotPassword/T2_unregisteredmail', 'Test Cases/ForgotPassword/T2_unregisteredmail',  null), new TestCaseBinding('Test Cases/ForgotPassword/T3_registeredmail_invalidcode', 'Test Cases/ForgotPassword/T3_registeredmail_invalidcode',  null), new TestCaseBinding('Test Cases/ForgotPassword/T4_registeredmail_validcode', 'Test Cases/ForgotPassword/T4_registeredmail_validcode',  null)])
