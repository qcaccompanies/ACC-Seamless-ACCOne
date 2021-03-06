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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (preprod).apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(990, 2150)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Label Lihat Profil'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Lihat Profil - ATS-16/Btn Ubah Kata Sandi'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ubah Kata Sandi - ATS-22/Field Kata Sandi Lama'), 0)

Mobile.setText(findTestObject('Ubah Kata Sandi - ATS-22/Field Kata Sandi Lama'), oldPassword, 0)

Mobile.tapAtPosition(545, 1150)

Mobile.tap(findTestObject('Ubah Kata Sandi - ATS-22/Field Kata Sandi baru'), 0)

Mobile.setText(findTestObject('Ubah Kata Sandi - ATS-22/Field Kata Sandi baru'), newPassword, 0)

Mobile.tapAtPosition(545, 1150)

Mobile.tap(findTestObject('Ubah Kata Sandi - ATS-22/Field Konfirmasi Kata Sandi Baru'), 0)

Mobile.setText(findTestObject('Ubah Kata Sandi - ATS-22/Field Konfirmasi Kata Sandi Baru'), confNewPassword, 0)

Mobile.tapAtPosition(545, 1150)

if (condition.toString() == 'oldPasswordEmpty') {
    Mobile.verifyElementAttributeValue(findTestObject('Ubah Kata Sandi - ATS-22/Btn Konfirmasi Disabled'), 'enabled', 'false', 
        0)
} else if (condition.toString() == 'newPasswordEmpty') {
    Mobile.verifyElementVisible(findTestObject('Ubah Kata Sandi - ATS-22/New Warn New Password Empty'), 0)
} else if (condition.toString() == 'confPasswordEmpty') {
    Mobile.verifyElementVisible(findTestObject('Ubah Kata Sandi - ATS-22/New Warn Confirm Password Empty'), 0)
} else if (condition.toString() == 'oldPasswordWrong') {
    Mobile.verifyElementVisible(findTestObject('Ubah Kata Sandi - ATS-22/New Warn Old Password Not Match'), 0)
} else if (condition.toString() == 'newPasswordWrong') {
    Mobile.verifyElementVisible(findTestObject('Ubah Kata Sandi - ATS-22/New Warn Format Wrong'), 0)
} else if (condition.toString() == 'confPasswordNotMatch') {
    Mobile.verifyElementVisible(findTestObject('Ubah Kata Sandi - ATS-22/New Warn Confirm New Password Not Match'), 0)
} else {
    Mobile.tap(findTestObject('Ubah Kata Sandi - ATS-22/Field Konfirmasi Kata Sandi Baru'), 0)

    Mobile.tapAtPosition(545, 1150)

    Mobile.tap(findTestObject('Ubah Kata Sandi - ATS-22/Btn Konfirmasi'), 0)

    Mobile.verifyElementVisible(findTestObject('Ubah Kata Sandi - ATS-22/Change Password Success Notification'), 0)

    Mobile.tap(findTestObject('Ubah Kata Sandi - ATS-22/Btn Okay'), 0)
}

Mobile.closeApplication()

