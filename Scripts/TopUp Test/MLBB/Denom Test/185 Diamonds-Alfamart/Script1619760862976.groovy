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

WebUI.navigateToUrl('https://www.unipin.com/id/mobile-legends')

WebUI.delay(2)

WebUI.click(findTestObject('Minimize Zendesk/btn_Minimize Zendesk'))

WebUI.setText(findTestObject('Page_UniPin - Mobile Legends Bang Bang/id_MLBB'), '688306526')

WebUI.setText(findTestObject('Page_UniPin - Mobile Legends Bang Bang/input_(_zoneid'), '8749')

WebUI.delay(2)

WebUI.click(findTestObject('Page_UniPin - Mobile Legends Bang Bang/button_185 Diamonds (167  18 Bonus)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_UniPin - Mobile Legends Bang Bang/div_Indomaret  Alfamart Payment Point'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_UniPin - Mobile Legends Bang Bang/btn_Alfamart'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_UniPin - Checkout/checkoutpage_Indomaret'), '')

WebUI.closeBrowser()

