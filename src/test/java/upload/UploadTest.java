package upload;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class UploadTest extends BaseTest{
    @Test
    public void uploadFileTest(){
        var fileupload=homePage.clickTosubmit();
        fileupload.setName("lucas");
        fileupload.setEmail("kik@gmail.com");
        fileupload.setSubject("Complain");
        fileupload.setMessage("The clothes you gave me was not the one we've talke about");
        fileupload.clickToUpload();
        fileupload.clickToUploadFile("D:\\java\\Test3\\resources\\chromedriver.exe");
        var alert=fileupload.clickAlertOk();
        var success=alert.clickToSuccessfull();
        String successfulMessage=success.getFinalText();
        assertTrue(successfulMessage.contains("Success! Your details have been submitted successfully."),"file not found");
    }
}
