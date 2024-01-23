package org.example.config.bindModules;

import com.google.inject.AbstractModule;
import org.example.contracts.home.Home;
import org.example.pages.chrome.HomeWebpageChrome;

public class AbstractChromeModule extends AbstractModule {

    @Override
    protected void configure(){
        //pages
        bind(Home.class).to(HomeWebpageChrome.class);
    }
}
