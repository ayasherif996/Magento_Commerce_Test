import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;




//Luma website
public class TestCases {


    private WebDriver driver ;
    HomePage homepage ;
    LoginPage loginpage ;
    SignUpPage signupPage ;

    ForgetPasswordPage forgetpass;

    @BeforeTest
    public void setup(){
        driver= new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        homepage= new HomePage(driver);

    }

@Test(priority = 0)

    public void TestSignUpWithValidData() throws InterruptedException {
        signupPage =  homepage.Click_On_Sign_up();
        signupPage.EnterFirstName("Aya");
         Thread.sleep(3000);
        signupPage.EnterLastName("Ali");
          Thread.sleep(3000);
        signupPage.EnterEmail("yoyoyoyasherif@gmail.com");
         Thread.sleep(3000);
        signupPage.EnterPassword("Aya123456789?");
          Thread.sleep(3000);
        signupPage.EnterConfirmPassword("Aya123456789?");
        Thread.sleep(3000);
        signupPage.ClickOnCreateAccount();
        Thread.sleep(3000);
      //  Assert.assertEquals(signupPage.ShowError(),"Your registration completed");
    }
@Test(priority =1)
    public void TestLoginWithValidData() throws InterruptedException {
        loginpage= homepage.ClicK_On_Sign_in();
        loginpage.EnterEmail("yoyosherif@gmail.com");
       Thread.sleep(3000);
        loginpage.Enterpassword("Aya123456789?");
        Thread.sleep(3000);
        loginpage.Click_On_Sign_In();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      Assert.assertEquals(loginpage.ConfirmLogin(),"Welcome, Aya Ali!");


    }





    @Test(priority=1)

    public void TestForgetPassword(){
        forgetpass = loginpage.Click_On_ForgetPassword();

    }







    @AfterTest

    public void close(){
        driver.quit();
    }

}
