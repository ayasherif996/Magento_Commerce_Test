import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    WebDriver driver ;


    By E_mail = By.id("email_address");
    By captcha = By.id("captcha_user_forgotpassword");

    ForgetPasswordPage(WebDriver driver){
        this.driver= driver;
    }


    public void EnterEmail(String E){
        driver.findElement(E_mail).sendKeys(E);
    }


    public void Entercaptcha(String C){
        driver.findElement(captcha).sendKeys(C);
    }



}
