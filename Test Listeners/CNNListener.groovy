import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

class CNNListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	public void beforeTestCase(TestCaseContext testCaseContext) {
		WebUI.openBrowser('')
		
		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.CNNurl)
		
		WebUI.waitForElementPresent(findTestObject('CNN/search_Button_HomePage'), 5)
		
		WebUI.takeScreenshot()
		
		String Title = WebUI.getWindowTitle()
		
		assert Title.contains("CNN")
		
		KeywordUtil.logInfo(Title)
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	public void afterTestCase(TestCaseContext testCaseContext) {
		WebUI.closeBrowser()
	}
}