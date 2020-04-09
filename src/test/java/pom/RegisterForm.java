package pom;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.synth.Region;
import java.util.concurrent.TimeUnit;

public class RegisterForm {
    WebDriver driver;
    By txtUsername = By.xpath("//input[@name='c390875450cd8d2af6ac9d5e083022a2']");
    By txtEmail = By.xpath("//input[@name='351d4c923fcf0e84a0c4ba027e2c4120']");
    By txtPass = By.xpath("//input[@name='a2906ef5d6f1af5fc649afe50fb66584']");
    By txtRepass = By.xpath("//input[@name='514198452b1d4446748eb9e2a42f1b86']");
    By radFemale = By.xpath("//input[@value='female']");
    By radMale = By.xpath("//input[@value='male']");
    By opMonth = By.xpath("//select[@name='dob_month']");
    By txtDay = By.xpath("//input[@name='dob_day']");
    By txtYear = By.xpath("//input[@name='dob_year']");
    By txtLocation = By.xpath("//input[@name='location']");
    By txtConfirm = By.xpath("//input[@name='captcha_question_answer']");
    By chkAgree = By.xpath("//input[@name='agree']");
    By btnSubmit = By.xpath("//input[@id='SubmitButton']");
    By lblMessage = By.xpath("//div[@class='systemMessage']");

    //Define the method
    public RegisterForm (WebDriver driver){
        this.driver = driver;
    }
    public void OpenLoginPage(){
        driver.get("https://forum.vietdesigner.net/login/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void InputUsername(String username){
        driver.findElement(txtUsername).sendKeys(username);
    }
    public void InputEmail(String email){
        driver.findElement(txtEmail).sendKeys(email);
    }
    public void InputPassword(String pass){
        driver.findElement(txtPass).sendKeys(pass);
        driver.findElement(txtRepass).sendKeys(pass);
    }
    public void InputGender(String gender){
        if(gender.equalsIgnoreCase("0")){
            driver.findElement(radMale).click();
        }
        if(gender.equalsIgnoreCase("1")){
            driver.findElement(radFemale).click();
        }
    }
    public void Birthday (String day, String month, String year){
        Select slMonth = new Select(driver.findElement(opMonth));
        slMonth.selectByValue(month);
        driver.findElement(txtDay).sendKeys(day);
        driver.findElement(txtYear).sendKeys(year);
    }
    public void InputLocation(String location){
        driver.findElement(txtLocation).sendKeys(location);
    }
    public void InputConfirm(String confirmText){
        driver.findElement(txtConfirm).sendKeys(confirmText);
    }
    public void AgreePolicy(){
        driver.findElement(chkAgree).click();
    }
    public void Submit(){
        driver.findElement(btnSubmit).click();
    }
    public void ShowMessage (String message){
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement notify = wait.until(ExpectedConditions.visibilityOfElementLocated(lblMessage));
        Assert.assertEquals(message, notify.getText());
    }
}
