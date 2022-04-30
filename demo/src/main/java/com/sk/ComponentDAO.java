package com.sk;

import com.sk.ComponentConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    ComponentConnection componentConnection;

    public ComponentConnection getJdbcConnection() {
        return componentConnection;
    }

    public void setJdbcConnection(ComponentConnection componentConnection) {
        this.componentConnection = componentConnection;
    }
}
