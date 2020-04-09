package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginForm {
    WebDriver driver;
    By txtUsername = By.xpath("//input[@name='login']");
    By txtPassword = By.xpath("//input[@name='password']");
    By btnSubmit = By.xpath("//input[@class='button primary']");
    By lblMessage = By.xpath("//div[@class='errorPanel']");

    public LoginForm(WebDriver driver){
        this.driver = driver;
    }
    public void OpenLoginForm(){
        driver.get("https://forum.vietdesigner.net/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void InputUsername (String username){
        driver.findElement(txtUsername).sendKeys(username);
    }
    public void InputPassword (String password){
        driver.findElement(txtPassword).sendKeys(password);
    }
    public void Submit(){
        driver.findElement(btnSubmit).click();
    }
    public void ShowMessage (String message){
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement notify = wait.until(ExpectedConditions.visibilityOfElementLocated(lblMessage));
        Assert.assertEquals(message, notify.getText());
    }
    public void ViewHomepage(){
        driver.get("https://forum.vietdesigner.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String title = driver.getTitle();
        Assert.assertEquals("Diễn đàn Designer Việt Nam", title);
    }
}
