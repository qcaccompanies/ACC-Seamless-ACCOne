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

WebUI.callTestCase(findTestCase('Cari Dana - Pembiayaan Multiguna/Start_Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Cari Dana - Pembiayaan Multiguna/Detail Kendaraan'), [('Brand') : 'TOYOTA', ('Type') : 'AGYA'
        , ('Model') : 'T:1.0 G M/T', ('Tahun') : '2016'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Cari Dana - Pembiayaan Multiguna/Simulasi Kredit'), [('Dana') : '12000000', ('Periode') : '48'
        , ('Tujuan') : 'Pendidikan', ('AreaPengajuan') : 'Jawa Tengah dan DIY', ('CabangACC') : 'MAGELANG JAWA TENGAH'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Cari Dana - Pembiayaan Multiguna/Upload_Foto_Kendaraan'), [('Upload') : 'Galeri', ('Foto') : 'lala.jpg'], 
    FailureHandling.STOP_ON_FAILURE)

