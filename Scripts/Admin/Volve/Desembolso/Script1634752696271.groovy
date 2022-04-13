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
WebUI.openBrowser('https://dev-admin-int.paigo.uy/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin/Logueo/input_Usuario'), findTestData('DatosUsuario').getValue(2, 1))

WebUI.setText(findTestObject('Admin/Logueo/input_Contrasena'), findTestData('DatosUsuario').getValue(2, 2))

WebUI.enhancedClick(findTestObject('Admin/Logueo/button_Ingresar'))
*/
WebUI.waitForElementPresent(findTestObject('Admin/Desembolso/p_DESEMBOLSO'), 0)

WebUI.enhancedClick(findTestObject('Admin/Desembolso/p_DESEMBOLSO'))

WebUI.selectOptionByLabel(findTestObject('Admin/Desembolso/select_Marca'), GlobalVariable.Marca_VV, false)

WebUI.enhancedClick(findTestObject('Admin/Desembolso/button_Obtener'))

WebUI.waitForElementVisible(findTestObject('Admin/Desembolso/input_FiltrarCI'), 0)

WebUI.setText(findTestObject('Admin/Desembolso/input_FiltrarCI'), GlobalVariable.cedulaRandom)

WebUI.enhancedClick(findTestObject('Admin/Desembolso/button_Desembolsar'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.ARROW_DOWN))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Admin/Desembolso/button_AceptarDesembolso'))

WebUI.delay(3)

WebUI.verifyTextPresent('✓ Transacción generada correctamente', false)

WebUI.takeFullPageScreenshot("C:\\Users\\nicolas.aquino\\Desktop\\Trabajo\\Screenshots Katalon\\$GlobalVariable.cedulaRandom\\3_Desembolso.jpg")

