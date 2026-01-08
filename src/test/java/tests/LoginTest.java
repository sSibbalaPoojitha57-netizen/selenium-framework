package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        // open page
        getDriver().get("https://example.com/login");

        // use the Page Object
        new LoginPage(getDriver()).login("test", "test");
    }
}
