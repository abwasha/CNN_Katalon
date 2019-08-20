package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object CNNurl
     
    /**
     * <p></p>
     */
    public static Object validsearchString
     
    /**
     * <p></p>
     */
    public static Object regexStringPart1
     
    /**
     * <p></p>
     */
    public static Object regexStringFull
     
    /**
     * <p></p>
     */
    public static Object invalidsearchString
     
    /**
     * <p></p>
     */
    public static Object UnsuccesfullStringPart1
     
    /**
     * <p></p>
     */
    public static Object UnsuccesfullStringPart2
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('CNN', allVariables['default'] + ['CNNurl' : 'https://edition.cnn.com/', 'validsearchString' : 'NFL', 'regexStringPart1' : 'Displaying results \\d*\\S\\d* out of \\d* for ', 'regexStringFull' : '', 'invalidsearchString' : 'NFLFake', 'UnsuccesfullStringPart1' : 'Your search for ', 'UnsuccesfullStringPart2' : ' did not match any documents.'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        CNNurl = selectedVariables['CNNurl']
        validsearchString = selectedVariables['validsearchString']
        regexStringPart1 = selectedVariables['regexStringPart1']
        regexStringFull = selectedVariables['regexStringFull']
        invalidsearchString = selectedVariables['invalidsearchString']
        UnsuccesfullStringPart1 = selectedVariables['UnsuccesfullStringPart1']
        UnsuccesfullStringPart2 = selectedVariables['UnsuccesfullStringPart2']
        
    }
}
