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

WebUI.navigateToUrl('https://edu-demo.amatraedu.com/#/login')

WebUI.setText(findTestObject('Object Repository/Page_Login  AMATRA EDUCATION/input_text'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  AMATRA EDUCATION/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login  AMATRA EDUCATION/select_Select Parent Student Internal'), 
    'Internal', true)

WebUI.click(findTestObject('Object Repository/Page_Login  AMATRA EDUCATION/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  AMATRA EDUCATION/div_Log Out_opacity-50  origin-left w-full _193505'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  AMATRA EDUCATION/svg_Log Out_inline-block inline-flex justif_853cdd'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  AMATRA EDUCATION/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  AMATRA EDUCATION/input_Title_title'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  AMATRA EDUCATION/input_Show Time_date'))

WebUI.closeBrowser()

