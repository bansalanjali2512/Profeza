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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://54.144.245.87/test/login-page.html')

WebUI.setText(findTestObject('LoginOR/T5_registeredemail_shortpassword/Page_Login  Profeza/input_email'), 'anjalibansal079@gmail.com')

WebUI.setText(findTestObject('LoginOR/T5_registeredemail_shortpassword/Page_Login  Profeza/input_password'), 'abc')

WebUI.click(findTestObject('LoginOR/T5_registeredemail_shortpassword/Page_Login  Profeza/a_Login'))

WebUI.click(findTestObject('LoginOR/T5_registeredemail_shortpassword/Page_Login  Profeza/div_password should have 8 or'))

WebUI.verifyElementPresent(findTestObject('LoginOR/T5_registeredemail_shortpassword/Page_Login  Profeza/div_password should have 8 or'), 
    0)

WebUI.closeBrowser()

