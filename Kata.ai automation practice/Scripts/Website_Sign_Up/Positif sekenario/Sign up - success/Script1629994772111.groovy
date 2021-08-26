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

WebUI.openBrowser(GlobalVariable.webUrl)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/Sign Up/txt_Email'), 'testernext1515@gmail.com')

WebUI.click(findTestObject('Sign Up/btn_Createaccount'))

WebUI.delay(2)

WebUI.click(findTestObject('Sign Up/radioBtn_title'))

WebUI.sendKeys(findTestObject('Sign Up/txt_custFirstName'), 'bay')

WebUI.sendKeys(findTestObject('Sign Up/txt_custLastName'), 'testernext')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Sign Up/txt_password'), '9dpG4+8GpZMVMNeK17QUNw==')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Sign Up/optn_dayBirth'), '2', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Sign Up/optn_montBirth'), '8', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Sign Up/optn_yearsBirth'), '2003', false)

WebUI.delay(2)

//WebUI.sendKeys(findTestObject('Sign Up/txt_firstName'), 'bay')
//WebUI.sendKeys(findTestObject('Sign Up/txt_lastName'), 'testernext')

WebUI.sendKeys(findTestObject('Sign Up/txt_address'), 'jl. tester next')

WebUI.sendKeys(findTestObject('Sign Up/txt_city'), 'bekasi')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Sign Up/optn_state'), '2', false)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Sign Up/txt_postCode'), '15151')

WebUI.sendKeys(findTestObject('Sign Up/txt_mobilePhone'), '085315151515')

WebUI.sendKeys(findTestObject('Sign Up/txt_aliasAddress'), 'jl. tester next1')

WebUI.click(findTestObject('Sign Up/btn_submitRegist'))

WebUI.delay(3)

WebUI.verifyTextPresent('Welcome to your account. Here you can manage all of your personal information and orders.', false)

WebUI.closeBrowser()