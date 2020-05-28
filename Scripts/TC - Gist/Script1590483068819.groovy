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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('https://github.com/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Gist/button - sign in'))

WebUI.delay(5)

WebUI.click(findTestObject('Gist/textfield - email login'))

WebUI.setText(findTestObject('Gist/textfield - email login'), ' ')

'Enter the Github Email'
WebUI.delay(10)

WebUI.click(findTestObject('Gist/textfield - password login'))

WebUI.setText(findTestObject('Gist/textfield - password login'), ' ')

'Enter the Github Password'
WebUI.delay(10)

WebUI.click(findTestObject('Gist/button - sign in (submit)'))

WebUI.delay(5)

WebUI.click(findTestObject('Gist/button - add'))

WebUI.click(findTestObject('Gist/button - add gist'))

WebUI.delay(5)

WebUI.click(findTestObject('Gist/textfield - gist descriptions'))

WebUI.setText(findTestObject('Gist/textfield - gist descriptions'), 'testing qa')

WebUI.delay(5)

WebUI.click(findTestObject('Gist/textfield - filename extention 1'))

WebUI.setText(findTestObject('Gist/textfield - filename extention 1'), 'qa-gists.md')

WebUI.delay(5)

WebUI.click(findTestObject('Gist/textfield - filename 1'))

WebUI.setText(findTestObject('Gist/textfield - filename 1'), '# Hello World')

WebUI.delay(5)

WebUI.click(findTestObject('Gist/button - create gist public'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Gist/button - edit gist'))

WebUI.delay(5)

WebUI.click(findTestObject('Gist/button - add file'))

WebUI.delay(5)

WebUI.click(findTestObject('Gist/textfield - filename extention 2'))

WebUI.setText(findTestObject('Gist/textfield - filename extention 2'), 'qa-gist.md')

WebUI.delay(5)

WebUI.click(findTestObject('Gist/textfield - filename 2'))

WebUI.delay(10)

WebUI.setText(findTestObject('Gist/textfield - filename 2'), '## Hello World')

WebUI.click(findTestObject('Gist/button - update gist public'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Gist/button - edit gist'))

WebUI.click(findTestObject('Gist/button - deleted gist public'))

WebUI.click(findTestObject('Gist/button - update gist public'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Gist/button - profile'))

WebUI.click(findTestObject('Gist/button - my gist'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.closeBrowser()

