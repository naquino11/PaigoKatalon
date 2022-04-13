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

WebUI.navigateToUrl(GlobalVariable.CreditoUruguayo)

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Inicio/a_InicioFlujo'), 0)

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Inicio/a_InicioFlujo'))

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 1/input_Cedula'), 0)

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 1/input_Cedula'), GlobalVariable.cedulaRandom)

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 1/input_Celular'), findTestData('DatosUsuario').getValue(2, 3))

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 1/input_TyC'))

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 1/button_Continuar-1'))

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 2/input_Nombre'), 0)

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 2/input_Nombre'), findTestData('DatosUsuario').getValue(2, 7))

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 2/input_Apellido'), findTestData('DatosUsuario').getValue(2, 8))

WebUI.selectOptionByValue(findTestObject('CreditoUruguayo/Flujo 2/select_Dia'), '15', false)

WebUI.selectOptionByValue(findTestObject('CreditoUruguayo/Flujo 2/select_Mes'), '10', false)

WebUI.selectOptionByValue(findTestObject('CreditoUruguayo/Flujo 2/select_Anio'), '1970', false)

WebUI.delay(0.7)

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 2/input_Email'), findTestData('DatosUsuario').getValue(2, 6))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('CreditoUruguayo/Flujo 2/emailNoValidoFocus'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('CreditoUruguayo/Flujo 2/input_Email'), Keys.chord(Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 2/input_Ingresos'), '12000')

WebUI.selectOptionByValue(findTestObject('CreditoUruguayo/Flujo 2/select_Genero'), 'Male', false)

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 2/button_Continuar-2'))

if (WebUI.verifyElementPresent(findTestObject('CreditoUruguayo/Flujo 3/div_SinOferta'), 0, FailureHandling.OPTIONAL)) {
    'Conexión a base'
    CustomKeywords.'database.query.connectDB'(GlobalVariable.DB, 'processor_uy_pago_despues', '3306', 'root', 'r{OD_XIn(Ec]')

    'Da oferta a cedulaRandom (autogenerada)'
    CustomKeywords.'database.query.execute'("UPDATE ScoringSourceQualification S INNER JOIN Client C ON C.id = S.clientId INNER JOIN Person P ON P.id = C.personId INNER JOIN Entity E ON E.id = P.id INNER JOIN Brand B ON B.id = C.brandId AND B.name = 'CreditoUruguayo' SET qualification =	(CASE	    WHEN sourceType = 'Paigo' THEN 'PAIGO_1'	    WHEN sourceType = 'Person' THEN 'M3***'	    WHEN sourceType = 'RiskCentral' THEN 'RISKCENTRAL_1'	    WHEN S.sourceType = 'Background' THEN CONCAT('PX2-' , RIGHT(S.qualification, locate('-', S.qualification,4)))	    ELSE qualification    END) WHERE E.legalId = $GlobalVariable.cedulaRandom AND S.date = DATE(NOW());")

    'Cierre de conexión a base'
    CustomKeywords.'database.query.closeDatabaseConnection'()

    WebUI.back()

    WebUI.delay(1)

    WebUI.click(findTestObject('CreditoUruguayo/Flujo 2/button_Continuar-2'))

    WebUI.delay(1)
}

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 3/select_FechaVencimiento'), 0)

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 3/select_FechaVencimiento'))

WebUI.sendKeys(findTestObject('CreditoUruguayo/Flujo 3/select_FechaVencimiento'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 3/select_Cuotas'), 0)

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 3/select_Cuotas'))

WebUI.sendKeys(findTestObject('CreditoUruguayo/Flujo 3/select_Cuotas'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 3/input_CuentaBancaria'), findTestData('DatosUsuario').getValue(2, 10))

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 3/button_Continuar-3'))

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 4/a_ConfirmarCredito'), 0)

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 4/a_ConfirmarCredito'))

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 5/input_Direccion'), 0)

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 5/input_Direccion'), findTestData('DatosUsuario').getValue(2, 9))

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 5/button_CrearContrasena'))

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 5/input_Contrasena'), findTestData('DatosUsuario').getValue(2, 11))

WebUI.setText(findTestObject('CreditoUruguayo/Flujo 5/input_ConfirmarContrasena'), findTestData('DatosUsuario').getValue(
        2, 11))

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 5/input_TyC-2'))

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 5/button_Continuar-4'))

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 6/button_QuieroQueMeLlamen'), 0)

WebUI.takeFullPageScreenshot("C:\\Users\\nicolas.aquino\\Desktop\\Trabajo\\Screenshots Katalon\\$GlobalVariable.cedulaRandom\\2_FlujoCreditoUruguayo.jpg")

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 6/button_QuieroQueMeLlamen'))

WebUI.waitForElementPresent(findTestObject('CreditoUruguayo/Flujo 7/a_Finalizar'), 0)

WebUI.enhancedClick(findTestObject('CreditoUruguayo/Flujo 7/a_Finalizar'))

