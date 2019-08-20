package cnn
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class VerifySearchResult {

	@Keyword
	public void verifySuccessfullCNNPageSearch(){
		WebDriver myDriver = DriverFactory.getWebDriver()

		ArrayList<WebElement> links = new ArrayList<WebElement>()

		links = myDriver.findElements(By.xpath('//div[@class="cnn-search__results-list"]/descendant::a'));

		KeywordUtil.logInfo("Number of links present on current page for the search invoked "+links.size)

		//Validation-1 where we check if some url's are returned for our search

		try {
			if(links.size==0)
				KeywordUtil.markErrorAndStop("Seems no result is found")

			//Validation-2 where we the text displayed above search result contains the keyword user entered (Here we use Regex to validate the text)
			GlobalVariable.regexStringFull = GlobalVariable.regexStringPart1 + GlobalVariable.validsearchString

			KeywordUtil.logInfo(GlobalVariable.regexStringFull)

			WebUI.verifyTextPresent(GlobalVariable.regexStringFull, true)
		}

		catch(Exception e){
			KeywordUtil.markErrorAndStop("Some error in validation of search result")
		}
	}

	@Keyword
	public void verifyUnSuccessfullCNNPageSearch(){
		WebDriver myDriver = DriverFactory.getWebDriver()

		ArrayList<WebElement> links = new ArrayList<WebElement>()

		links = myDriver.findElements(By.xpath('//div[@class="cnn-search__results-list"]/descendant::a'));

		KeywordUtil.logInfo("Number of links present on current page for the search invoked "+links.size)

		// To make sure the results returns no links
		try{
			if(links.size()==0)
			{
				String resultText=WebUI.getText(findTestObject('CNN/div_resultlist'))
				KeywordUtil.logInfo("Result text on CNN Webpage after search result")
				KeywordUtil.logInfo(resultText.trim())
				KeywordUtil.logInfo("Result text expected from code")
				String expected=GlobalVariable.UnsuccesfullStringPart1+GlobalVariable.invalidsearchString+GlobalVariable.UnsuccesfullStringPart2
				KeywordUtil.logInfo(expected)
				assert resultText.trim().contains(expected)
			}
		}
		catch(Exception e)
		{
			if(links.size()!=0)
			{
				KeywordUtil.markFailedAndStop("Some failure in validation of search result")
			}

			else
				KeywordUtil.markErrorAndStop("Some error in validation of search result")


		}


	}
}
