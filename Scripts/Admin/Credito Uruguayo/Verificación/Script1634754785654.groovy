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

/*
WebUI.openBrowser(GlobalVariable.Admin)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin/Logueo/input_Usuario'), findTestData('DatosUsuario').getValue(2, 1))

WebUI.setText(findTestObject('Admin/Logueo/input_Contrasena'), findTestData('DatosUsuario').getValue(2, 2))

WebUI.enhancedClick(findTestObject('Admin/Logueo/button_Ingresar'))
*/
WebUI.waitForElementPresent(findTestObject('Admin/Verificacion/p_CreditosEnVerificacion'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/p_CreditosEnVerificacion'))

WebUI.waitForElementVisible(findTestObject('Admin/Verificacion/select_SeleccionarMarca'), 0)

WebUI.selectOptionByLabel(findTestObject('Admin/Verificacion/select_SeleccionarMarca'), GlobalVariable.Marca_CU, false)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_Obtener'))

WebUI.waitForElementVisible(findTestObject('Admin/Verificacion/input_FiltrarCI'), 0)

WebUI.setText(findTestObject('Admin/Verificacion/input_FiltrarCI'), GlobalVariable.cedulaRandom)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_Retomar VI'))

WebUI.waitForElementPresent(findTestObject('Admin/Verificacion/button_Subir_1'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_Subir_1'))

WebUI.uploadFile(findTestObject('Admin/Verificacion/input_File'), 'C:\\Users\\nicolas.aquino\\Desktop\\Trabajo\\TomMeme.jpg')

WebUI.waitForElementClickable(findTestObject('Admin/Verificacion/button_ConfirmarSubidaImagen_1'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_ConfirmarSubidaImagen_1'))

WebUI.check(findTestObject('Admin/Verificacion/input_ConfirmarImagen_1'))

WebUI.waitForElementVisible(findTestObject('Admin/Verificacion/button_Subir_2'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_Subir_2'))

WebUI.uploadFile(findTestObject('Admin/Verificacion/input_File'), 'C:\\Users\\nicolas.aquino\\Desktop\\Trabajo\\TomMeme.jpg')

WebUI.waitForElementClickable(findTestObject('Admin/Verificacion/button_ConfirmarSubidaImagen_2'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_ConfirmarSubidaImagen_2'))

WebUI.check(findTestObject('Admin/Verificacion/input_ConfirmarImagen_2'))

WebUI.waitForElementVisible(findTestObject('Admin/Verificacion/button_Subir_3'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_Subir_3'))

WebUI.uploadFile(findTestObject('Admin/Verificacion/input_File'), 'C:\\Users\\nicolas.aquino\\Desktop\\Trabajo\\TomMeme.jpg')

WebUI.waitForElementClickable(findTestObject('Admin/Verificacion/button_ConfirmarSubidaImagen_3'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_ConfirmarSubidaImagen_3'))

WebUI.check(findTestObject('Admin/Verificacion/input_ConfirmarImagen_3'))

WebUI.setText(findTestObject('Admin/Verificacion/input_NumeroSerieCI'), '123456')

url = WebUI.getUrl()

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_Obtener'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowUrl(url)

WebUI.sendKeys(findTestObject('Admin/Verificacion/button_Obtener'), Keys.chord(Keys.TAB, '14021970'))

WebUI.sendKeys(findTestObject('Admin/Verificacion/input_FechaNacimiento'), Keys.chord(Keys.TAB, '14022002'))

WebUI.sendKeys(findTestObject('Admin/Verificacion/input_FechaEmisionCI'), Keys.chord(Keys.TAB, '14022040'))

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_ConfirmarIdentidad'))

WebUI.waitForElementVisible(findTestObject('Admin/Verificacion/button_Confirmar'), 0)

WebUI.enhancedClick(findTestObject('Admin/Verificacion/button_Confirmar'))

WebUI.delay(3)

WebUI.verifyTextPresent('VERIFICACIÓN COMPLETADA', false)

