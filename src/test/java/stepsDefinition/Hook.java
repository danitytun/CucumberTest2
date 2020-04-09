package stepsDefinition;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    WebDriver driver;
    @Before
    public void StarTest(){
        //System.setProperty("webdriver.chrome.driver","D:/AUTOTEST/Lib/chromedriver.exe");
        this.driver = new ChromeDriver();
    }
}
