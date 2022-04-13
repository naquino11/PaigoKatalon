import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

'Javascript para abrir nueva pestaña'
String currentPage = WebUI.getUrl()

'Javascript para abrir nueva pestaña'
int currentTab = WebUI.getWindowIndex()

'Javascript para abrir nueva pestaña'
WebDriver driver = DriverFactory.getWebDriver()

'Javascript para abrir nueva pestaña'
JavascriptExecutor js = ((driver) as JavascriptExecutor)

'Javascript para abrir nueva pestaña'
js.executeScript('window.open();')

'Javascript para abrir nueva pestaña'
WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl(GlobalVariable.Admin)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin/Logueo/input_Usuario'), findTestData('DatosUsuario').getValue(2, 1))

WebUI.setText(findTestObject('Admin/Logueo/input_Contrasena'), findTestData('DatosUsuario').getValue(2, 2))

WebUI.enhancedClick(findTestObject('Admin/Logueo/button_Ingresar'))

