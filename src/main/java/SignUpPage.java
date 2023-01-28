import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
private WebDriver driver;


public SignUpPage(WebDriver driver){
    this.driver = driver ;
}

By FirstName = By.xpath("//input[@id='firstname']");
By LastName = By.xpath("//input[@id='lastname']");


By Email =By.xpath("//input[@id='email_address']");

By Password = By.xpath("//input[@id='password']");

By confirm_password = By.xpath("//input[@id='password-confirmation']");

By  CreateAnAccountButton = By.xpath("//div/button[@title='Create an Account']");


    public void EnterFirstName(String f){

        driver.findElement(FirstName).sendKeys(f);
    }
    public void EnterLastName(String l){

        driver.findElement(LastName).sendKeys(l);
    }


    public void EnterEmail(String E){

        driver.findElement(Email).sendKeys(E);
    }

    public void EnterPassword(String p){
        driver.findElement(Password).sendKeys(p);
    }

    public void  EnterConfirmPassword(String c){

        driver.findElement(confirm_password).sendKeys(c);
    }

    public void ClickOnCreateAccount(){
        driver.findElement(CreateAnAccountButton).click();
    }






}
