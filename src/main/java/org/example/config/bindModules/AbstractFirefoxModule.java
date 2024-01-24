package org.example.config.bindModules;

import com.google.inject.AbstractModule;
import org.example.contracts.cart.Cart;
import org.example.contracts.cart.Payment;
import org.example.contracts.common.Common;
import org.example.contracts.home.Home;
import org.example.contracts.products.Products;
import org.example.contracts.signupLogin.Login;
import org.example.contracts.signupLogin.Signup;
import org.example.contracts.signupLogin.SignupForm;
import org.example.contracts.signupLogin.SignupLogin;
import org.example.pages.firefox.cart.CartWebpageFirefox;
import org.example.pages.firefox.cart.PaymentWebpageFirefox;
import org.example.pages.firefox.commonUses.CommonWebpageFirefox;
import org.example.pages.firefox.home.HomeWebpageFirefox;
import org.example.pages.firefox.products.ProductsWebpageFirefox;
import org.example.pages.firefox.signupLogin.LoginWebpageFirefox;
import org.example.pages.firefox.signupLogin.SignupFormWebpageFirefox;
import org.example.pages.firefox.signupLogin.SignupLoginWebpageFirefox;
import org.example.pages.firefox.signupLogin.SignupWebpageFirefox;

public class AbstractFirefoxModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(Home.class).to(HomeWebpageFirefox.class);
        bind(SignupLogin.class).to(SignupLoginWebpageFirefox.class);
        bind(Signup.class).to(SignupWebpageFirefox.class);
        bind(SignupForm.class).to(SignupFormWebpageFirefox.class);
        bind(Common.class).to(CommonWebpageFirefox.class);
        bind(Cart.class).to(CartWebpageFirefox.class);
        bind(Payment.class).to(PaymentWebpageFirefox.class);
        bind(Login.class).to(LoginWebpageFirefox.class);
        bind(Products.class).to(ProductsWebpageFirefox.class);
    }
}
