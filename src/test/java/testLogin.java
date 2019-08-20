import groovy.transform.ASTTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testLogin {
    @Test
    void test_customer_login(){
        FurstJavaProgram furstJavaProgram = new FurstJavaProgram();
        WebDriver webDriver = furstJavaProgram.launchBrowser();
        furstJavaProgram.inputToTextBox("username@gmail.com");
        furstJavaProgram.inputToTextBox("Password123");
        furstJavaProgram.clickSubmit();



    }
}
