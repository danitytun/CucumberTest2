package stepsDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pom.RegisterForm;

public class RegisterSteps {
    WebDriver driver;
    RegisterForm form;

    @Given("^The register screens is showed$")
    public void the_register_screens_is_showed() throws Throwable {
        form = new RegisterForm(this.driver);
        form.OpenLoginPage();
    }

    @When("^The user input data with (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+) and submit form$")
    public void the_user_input_data_with_and_submit_form(String username, String email, String pass, String gender, String month, String day, String year, String location, String confirm) throws Throwable {
        form.InputUsername(username);
        form.InputEmail(email);
        form.InputPassword(pass);
        form.InputGender(gender);
        form.InputLocation(location);
        form.Birthday(day,month,year);
        form.InputConfirm(confirm);
        form.AgreePolicy();
        form.Submit();
    }

    @Then("^The message \"([^\"]*)\" (.+) will be showed$")
    public void the_message_something_will_be_showed(String email, String strArg1) throws Throwable {
        String message = strArg1 + email;
        form.ShowMessage(message);
    }
}
