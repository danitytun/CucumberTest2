package stepsDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pom.LoginForm;

public class LoginSteps {
    WebDriver driver;
    LoginForm form;
    @Given("^The login screen is showed$")
    public void the_login_screen_is_showed() throws Throwable {
        form = new LoginForm(this.driver);
        form.OpenLoginForm();
    }

    @When("The user try to login with {string} and {string}")
    public void the_user_try_to_login_with_and(String string, String string2) {
        form.InputUsername(string);
        form.InputPassword(string2);
        form.Submit();
    }

    @Then("^The home screen will be showed$")
    public void the_home_screen_will_be_showed() throws Throwable {
        form.ViewHomepage();
    }
}
