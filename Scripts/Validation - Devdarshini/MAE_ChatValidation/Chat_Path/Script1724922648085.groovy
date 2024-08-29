import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Validation - Devdarshini/MAE_LoginApplication/MAE_Login_WithoutValidations'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.startExistingApplication('com.maybank2u.life.uat')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Chat_Path/APPLICATION_Tap'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Chat_Path/APPLICATION_Tap'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Chat_Path/Applicant'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Chat_Path/Applicant'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Scan_Property/ScanPropery_Tap'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Scan_Property/ScanPropery_Tap'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Scan_Property/Scan Property QR'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Scan_Property/ORCode_Scanning Area'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Scan_Property/Place QR code in the scan area'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Scan_Property/Trouch_ON'), GlobalVariable.Timeout)
