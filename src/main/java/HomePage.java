import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {



    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    private WebDriver driver ;
    By RegisterButton = By.xpath("(//header /div /div /ul /li /a[contains(text(),'Create')])");
    By LoginButton = By.xpath("(//header /div /div /ul /li /a[contains(text(),'Sign In')])");






    public SignUpPage Click_On_Sign_up (){
        driver.findElement(RegisterButton).click();
        return new SignUpPage(driver);
    }

    public LoginPage ClicK_On_Sign_in(){
        driver.findElement(LoginButton).click();
        return new LoginPage(driver);
    }

}
