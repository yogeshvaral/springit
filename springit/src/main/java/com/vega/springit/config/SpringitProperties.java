package com.vega.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {
    /**
     * this is our welcome message
     */

    private String welcomeMsg = "Hello World";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}
