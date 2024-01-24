package org.example.steps.SignupLogin;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.example.contracts.signupLogin.Login;
import org.example.utils.Defaults;

public class LoginSteps implements En {
    @Inject
    public LoginSteps(Login login,
                      Defaults defaults) {

        And("^the user enters their email and password to login$", () -> {
            login.enterLoginDetails(defaults.getGeneratedEmail(), defaults.getGeneratedPassword());
        });
    }
}
