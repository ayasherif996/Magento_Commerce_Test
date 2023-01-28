import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    private WebDriver driver ;




    public LoginPage(WebDriver driver){
        this.driver = driver;

    }


    By E_mailField = By.id("email");

    By passwordField = By.xpath("//input[@name='login[password]']");

    By  SignInButton = By.xpath("//button[@class='action login primary']");

    By ForgetPasswordButton = By.xpath("(//div/a/span[contains(text(),'Forgot Your Password?')])[1]");



    By confirmLogin = By.xpath("(//li/span[contains(text(),'Welcome, Aya Ali!')])[1]");
    public void EnterEmail(String E){
        driver.findElement(E_mailField).sendKeys(E);
    }


    public void Enterpassword(String p){
        driver.findElement(passwordField).sendKeys(p);
    }

    public void Click_On_Sign_In(){
        driver.findElement(SignInButton).click();
    }

public ForgetPasswordPage Click_On_ForgetPassword(){
        driver.findElement(ForgetPasswordButton).click();
        return new ForgetPasswordPage(driver);
}



    public  String ConfirmLogin(){
        return  driver.findElement(confirmLogin).getText();
    }

}
