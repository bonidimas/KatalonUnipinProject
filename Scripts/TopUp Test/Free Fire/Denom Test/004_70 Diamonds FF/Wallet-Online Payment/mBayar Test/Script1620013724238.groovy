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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.unipin.com/id/garena/free-fire')

WebUI.delay(2)

WebUI.click(findTestObject('Minimize Zendesk/btn_Minimize Zendesk'))

WebUI.setText(findTestObject('Free Fire Page/Input User ID/input_UserID'), '1970017417 ')

WebUI.delay(2)

WebUI.click(findTestObject('Free Fire Page/Denom/004_btn_70 Free Fire Diamonds'))

WebUI.delay(2)

WebUI.click(findTestObject('Free Fire Page/Payment Channel/btn_Online Payment'))

WebUI.delay(2)

WebUI.click(findTestObject('Free Fire Page/Payment Channel/btn_Online Payment_mBayar'))

WebUI.delay(2)

WebUI.closeBrowser()

