package org.example.steps.Home;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.example.contracts.home.Home;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HomeSteps implements En {
    private final boolean expectedResult = true;
    private boolean actualResult;
    private String reasonForFailure;
    @Inject
    public HomeSteps(Home home) {
        Given("^the homepage is visible$", () -> {
            actualResult = home.isVisible();
            reasonForFailure = "home page was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });
    }
}
