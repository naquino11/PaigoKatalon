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

WebUI.openBrowser('https://app.slack.com/client/TBW67BVRP/CBWFDSKL4')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Slack/1. Definir Entorno/Ingresar_URL_Slack'), 'paigo')

WebUI.enhancedClick(findTestObject('Slack/1. Definir Entorno/button_Continuar'))

WebUI.setText(findTestObject('Slack/2. Logeo/input_Ingresar_Email'), email)

WebUI.setText(findTestObject('Slack/2. Logeo/input_Ingresar_Password'), password)

WebUI.enhancedClick(findTestObject('Slack/2. Logeo/button_Conectarse'))

WebUI.waitForElementPresent(findTestObject('Slack/3. Elegir Canal/span_Canal_QA'), 0)

WebUI.enhancedClick(findTestObject('Slack/3. Elegir Canal/span_Canal_QA'))

WebUI.setText(findTestObject('Slack/4. Enviar Mensaje/Escribir_Mensaje'), 'Buenas! les dejamos listado de cedulas para la marca Credito Uruguayo')

WebUI.sendKeys(findTestObject('Slack/4. Enviar Mensaje/Escribir_Mensaje'), Keys.chord(Keys.SHIFT, Keys.ENTER))

WebUI.sendKeys(findTestObject('Slack/4. Enviar Mensaje/Escribir_Mensaje'), Keys.chord(Keys.CONTROL, Keys.ALT, Keys.SHIFT, 
        'c'))

WebUI.setText(findTestObject('Slack/4. Enviar Mensaje/div_Escribir_Codigo'), cedulas)

