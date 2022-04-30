package com.sk;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
/*
* if we dont use proxy then we will get same jdbc connection for two PersonDAO even if jdbc is SCOPE_PROTOTYPE
* */
public class ComponentConnection {
    public ComponentConnection(){
        System.out.println("JDBC CONNECTION");
    }
}
