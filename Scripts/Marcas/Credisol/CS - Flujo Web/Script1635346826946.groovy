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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

/*
WebUI.openBrowser('https://picandocodigo.github.io/ci_js/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Generador de cedulas/botonGenerar'))

GlobalVariable.cedulaRandom = WebUI.getAttribute(findTestObject('Generador de cedulas/obtenerCedulaRandom'), 'value')

while (GlobalVariable.cedulaRandom >= '60000000') {
    WebUI.click(findTestObject('Generador de cedulas/botonGenerar'))

    GlobalVariable.cedulaRandom = WebUI.getAttribute(findTestObject('Generador de cedulas/obtenerCedulaRandom'), 'value')
}
*/
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

WebUI.navigateToUrl(GlobalVariable.Credisol)

WebUI.waitForElementPresent(findTestObject('Credisol/Inicio/h3_InicioFlujo'), 0)

WebUI.enhancedClick(findTestObject('Credisol/Inicio/h3_InicioFlujo'))

WebUI.waitForElementPresent(findTestObject('Credisol/Flujo 1/input_Cedula'), 0)

WebUI.setText(findTestObject('Credisol/Flujo 1/input_Cedula'), GlobalVariable.cedulaRandom)

WebUI.setText(findTestObject('Credisol/Flujo 1/input_Celular'), findTestData('DatosUsuario').getValue(2, 3))

WebUI.enhancedClick(findTestObject('Credisol/Flujo 1/input_TyC-1'))

WebUI.enhancedClick(findTestObject('Credisol/Flujo 1/div_Continuar-1'))

WebUI.waitForElementPresent(findTestObject('Credisol/Flujo 2/input_Nombre'), 0)

WebUI.setText(findTestObject('Credisol/Flujo 2/input_Nombre'), findTestData('DatosUsuario').getValue(2, 7))

WebUI.setText(findTestObject('Credisol/Flujo 2/input_Apellido'), findTestData('DatosUsuario').getValue(2, 8))

WebUI.selectOptionByValue(findTestObject('Credisol/Flujo 2/select_Anio'), '1970', false)

WebUI.selectOptionByValue(findTestObject('Credisol/Flujo 2/select_Mes'), '2', false)

WebUI.selectOptionByValue(findTestObject('Credisol/Flujo 2/select_Dia'), '14', false)

WebUI.delay(0.7)

WebUI.setText(findTestObject('Credisol/Flujo 2/input_Email'), findTestData('DatosUsuario').getValue(2, 6))

WebUI.delay(0.7)

WebUI.sendKeys(findTestObject('Credisol/Flujo 2/input_EmailInvalido'), Keys.chord(Keys.BACK_SPACE))

WebUI.selectOptionByValue(findTestObject('Credisol/Flujo 2/select_Departamento'), 'Montevideo', false)

WebUI.selectOptionByValue(findTestObject('Credisol/Flujo 2/select_Localidad'), 'Pocitos', false)

WebUI.setText(findTestObject('Credisol/Flujo 2/input_Ingresos'), '12000')

WebUI.selectOptionByValue(findTestObject('Credisol/Flujo 2/select_Genero'), 'Male', false)

WebUI.enhancedClick(findTestObject('Credisol/Flujo 2/div_Continuar-2'))

WebUI.waitForElementPresent(findTestObject('Credisol/Flujo 3/select_Vencimiento'), 0)

WebUI.enhancedClick(findTestObject('Credisol/Flujo 3/select_Vencimiento'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Credisol/Flujo 3/select_Vencimiento'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(7, FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Credisol/Flujo 3/select_Cuotas'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Credisol/Flujo 3/select_Cuotas'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Credisol/Flujo 4/select_MetodoDesembolso'), 'BankTransfer', false)

WebUI.selectOptionByLabel(findTestObject('Credisol/Flujo 3/select_Banco'), 'Itaú', false)

WebUI.setText(findTestObject('Credisol/Flujo 3/input_Cuenta'), findTestData('DatosUsuario').getValue(2, 10))

WebUI.enhancedClick(findTestObject('Credisol/Flujo 3/div_Continuar-3'))

WebUI.waitForElementPresent(findTestObject('Credisol/Flujo 4/input_Direccion'), 0)

WebUI.setText(findTestObject('Credisol/Flujo 4/input_Direccion'), findTestData('DatosUsuario').getValue(2, 9))

WebUI.enhancedClick(findTestObject('Credisol/Flujo 4/input_TyC-2'))

WebUI.enhancedClick(findTestObject('Credisol/Flujo 4/div_Continuar-4'))

WebUI.waitForElementPresent(findTestObject('Credisol/Flujo 5/div_QuieroQueMeLlamen'), 0)

WebUI.enhancedClick(findTestObject('Credisol/Flujo 5/div_QuieroQueMeLlamen'))

WebUI.takeFullPageScreenshot("C:\\Users\\nicolas.aquino\\Desktop\\Trabajo\\Screenshots Katalon\\$GlobalVariable.cedulaRandom\\2_FlujoCreditoUruguayo.jpg")

WebUI.waitForElementPresent(findTestObject('Credisol/Flujo 6/div_FINALIZAR'), 0)

WebUI.enhancedClick(findTestObject('Credisol/Flujo 6/div_FINALIZAR'))

