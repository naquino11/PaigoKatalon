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
WebUI.waitForElementPresent(findTestObject('Admin/SPI/Alta de cuenta - SPI/p_CuentasBancarias'), 0)

WebUI.enhancedClick(findTestObject('Admin/SPI/Alta de cuenta - SPI/p_CuentasBancarias'))

WebUI.setText(findTestObject('Admin/SPI/Alta de cuenta - SPI/input_Cedula'), GlobalVariable.cedulaRandom)

WebUI.selectOptionByLabel(findTestObject('Admin/SPI/Alta de cuenta - SPI/select_Marca'), GlobalVariable.Marca_VV, false)

WebUI.enhancedClick(findTestObject('Admin/SPI/Alta de cuenta - SPI/button_Obtener'))

WebUI.waitForElementPresent(findTestObject('Admin/SPI/Edicion de cuenta - SPI/i_EditarCuenta'), 0)

WebUI.enhancedClick(findTestObject('Admin/SPI/Edicion de cuenta - SPI/i_EditarCuenta'))

WebUI.setText(findTestObject('Admin/SPI/Edicion de cuenta - SPI/input_Cuenta'), findTestData('DatosUsuario').getValue(2, 10))

WebUI.enhancedClick(findTestObject('Admin/SPI/Edicion de cuenta - SPI/button_Guardar'))

