package upload;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class UploadTest extends BaseTest{
    @Test
    public void uploadFileTest(){
        var fileupload=homePage.clickTosubmit();
        fileupload.setName("lucas");
        fileupload.setEmail("kik@gmail.com");
        fileupload.setSubject("Complain");
        fileupload.setMessage("The clothes you gave me was not the one we've talke about");
        fileupload.clickToUpload();
        fileupload.clickToUploadFile("C:\\Users\\jluci\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-10-29 213310.png");
        var alert=fileupload.clickAlertOk();
        alert.clickOk();
    }
}
