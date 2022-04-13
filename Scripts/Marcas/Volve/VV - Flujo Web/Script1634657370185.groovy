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

WebUI.navigateToUrl(GlobalVariable.Volve)

WebUI.enhancedClick(findTestObject('Volve/Inicio/button_Quiero intentarlo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Volve/Inicio/button_Comenzar'))

'Comienzo Flujo 1'
WebUI.setText(findTestObject('Volve/Flujo 1/input_Cedula'), GlobalVariable.cedulaRandom)

WebUI.setText(findTestObject('Volve/Flujo 1/input_Celular'), celular)

WebUI.setText(findTestObject('Volve/Flujo 1/input_Telefono'), findTestData('DatosUsuario').getValue(2, 4))

WebUI.setText(findTestObject('Volve/Flujo 1/input_TelefonoContacto'), telefonoContacto)

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 1/select_RelacionContacto'), 'Friend', false)

WebUI.enhancedClick(findTestObject('Volve/Flujo 1/input_TyC'))

WebUI.enhancedClick(findTestObject('Volve/Flujo 1/div_Siguiente'))

WebUI.waitForElementVisible(findTestObject('Volve/Flujo 2/input_Nombre'), 0)

'Comienzo Flujo 2'
WebUI.setText(findTestObject('Volve/Flujo 2/input_Nombre'), findTestData('DatosUsuario').getValue(2, 7))

WebUI.setText(findTestObject('Volve/Flujo 2/input_Apellido'), findTestData('DatosUsuario').getValue(2, 8))

WebUI.setText(findTestObject('Volve/Flujo 2/input_Email'), findTestData('DatosUsuario').getValue(2, 6))

WebUI.delay(0.5)

WebUI.sendKeys(findTestObject('Volve/Flujo 2/input_Email'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 2/select_Dia'), '14', false)

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 2/select_Mes'), '1', false)

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 2/select_Anio'), '1970', false)

WebUI.sendKeys(findTestObject('Volve/Flujo 2/select_Anio'), Keys.chord(Keys.TAB, Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Volve/Flujo 2/select_Departamento'), Keys.chord(Keys.TAB, Keys.ARROW_DOWN))

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 2/select_Genero'), 'Male', false)

WebUI.enhancedClick(findTestObject('Volve/Flujo 2/div_Siguiente'))

'Comienzo Flujo 3'
WebUI.waitForElementVisible(findTestObject('Volve/Flujo 3/select_Ocupacion'), 0)

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 3/select_Ocupacion'), 'TrabajoJornadaCompleta', false)

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 3/select_tiempoOcupacion'), '0a3', false)

WebUI.setText(findTestObject('Volve/Flujo 3/input_Ingresos'), '5000')

WebUI.selectOptionByValue(findTestObject('Volve/Flujo 3/select_PersonasACargo'), 'false', false)

WebUI.enhancedClick(findTestObject('Volve/Flujo 3/div_Siguiente'))

'Calculo Scoring'
WebUI.waitForElementVisible(findTestObject('Volve/Flujo 4/div_Siguiente'), 0)

WebUI.enhancedClick(findTestObject('Volve/Flujo 4/div_Siguiente'))

WebUI.waitForElementVisible(findTestObject('Volve/Flujo 4/select_Vencimiento'), 0)

'Comienzo Flujo 4'
WebUI.sendKeys(findTestObject('Volve/Flujo 4/a_Preguntas frecuentes'), Keys.chord(Keys.TAB, Keys.ARROW_DOWN), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Volve/Flujo 4/select_Banco'), 0)

WebUI.sendKeys(findTestObject('Volve/Flujo 4/select_Vencimiento'), Keys.chord(Keys.TAB, Keys.ARROW_DOWN), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Volve/Flujo 4/input_CuentaBancaria'), findTestData('DatosUsuario').getValue(2, 10))

WebUI.enhancedClick(findTestObject('Volve/Flujo 4/input_TyC'))

WebUI.enhancedClick(findTestObject('Volve/Flujo 4/div_Siguiente'))

WebUI.waitForElementVisible(findTestObject('Volve/Flujo 4/a_ConfirmarCredito'), 0)

'PopUp confirmación de credito'
WebUI.enhancedClick(findTestObject('Volve/Flujo 4/a_ConfirmarCredito'))

WebUI.waitForElementVisible(findTestObject('Volve/Flujo 5/input_CodigoSMS'), 0)

'Espera para ingresar codigo SMS'
WebUI.waitForElementVisible(findTestObject('Volve/Flujo 4/div_Siguiente'), 0)

WebUI.enhancedClick(findTestObject('Volve/Flujo 4/div_Siguiente'))

WebUI.takeFullPageScreenshot("C:\\Users\\nicolas.aquino\\Desktop\\Trabajo\\Screenshots Katalon\\$GlobalVariable.cedulaRandom\\2_FlujoVolve.jpg")

