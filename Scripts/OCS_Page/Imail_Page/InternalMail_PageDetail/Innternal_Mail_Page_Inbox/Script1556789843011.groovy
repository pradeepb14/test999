import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Imail'))

WebUI.click(findTestObject('Internal_Compose mail/Page_Healthcare Manager/span_InternalImail_icon icon-share Int_1'))

WebUI.click(findTestObject('Object Repository/Page_Healthcare Manager/div_From archana mohini'))

WebUI.click(findTestObject('Object Repository/Page_Healthcare Manager/i_test_icon icon-envelope-im active'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Healthcare Manager/i_test_icon icon-favorite-im'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Healthcare Manager/i_test_icon icon-flag-im'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Healthcare Manager/i_test_icon icon-favorite-im'))

WebUI.verifyElementClickable(findTestObject('Page_Healthcare Manager/i_test_icon icon-block-im'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Healthcare Manager/i_test_icon icon-block-im'))