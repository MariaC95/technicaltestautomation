package org.example.config.bindModules;

import com.google.inject.AbstractModule;
import org.example.contracts.cart.Cart;
import org.example.contracts.cart.Payment;
import org.example.contracts.common.Common;
import org.example.contracts.home.Home;
import org.example.contracts.signupLogin.Login;
import org.example.contracts.signupLogin.Signup;
import org.example.contracts.signupLogin.SignupForm;
import org.example.contracts.signupLogin.SignupLogin;
import org.example.pages.chrome.cart.CartWebpageChrome;
import org.example.pages.chrome.cart.PaymentWebpageChrome;
import org.example.pages.chrome.commonUses.CommonWebpageChrome;
import org.example.pages.chrome.home.HomeWebpageChrome;
import org.example.pages.chrome.signupLogin.LoginWebpageChrome;
import org.example.pages.chrome.signupLogin.SignupFormWebpageChrome;
import org.example.pages.chrome.signupLogin.SignupLoginWebpageChrome;
import org.example.pages.chrome.signupLogin.SignupWebpageChrome;

public class AbstractChromeModule extends AbstractModule {

    @Override
    protected void configure(){
        //pages
        bind(Home.class).to(HomeWebpageChrome.class);
        bind(SignupLogin.class).to(SignupLoginWebpageChrome.class);
        bind(Signup.class).to(SignupWebpageChrome.class);
        bind(SignupForm.class).to(SignupFormWebpageChrome.class);
        bind(Common.class).to(CommonWebpageChrome.class);
        bind(Cart.class).to(CartWebpageChrome.class);
        bind(Payment.class).to(PaymentWebpageChrome.class);
        bind(Login.class).to(LoginWebpageChrome.class);
    }
}
