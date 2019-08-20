import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.click(findTestObject('CNN/search_Button_HomePage'))

WebUI.waitForElementPresent(findTestObject('CNN/input_text_bar'), 5)

WebUI.click(findTestObject('CNN/input_text_bar'))

WebUI.waitForElementPresent(findTestObject('CNN/searchText_button'), 5)

WebUI.setText(findTestObject('CNN/input_text_bar'), GlobalVariable.invalidsearchString)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CNN/searchText_button'))

WebUI.waitForElementPresent(findTestObject('CNN/div_resultlist'), 5)

WebUI.takeScreenshot()

CustomKeywords.'cnn.VerifySearchResult.verifyUnSuccessfullCNNPageSearch'()



