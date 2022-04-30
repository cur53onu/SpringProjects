package com.sk.demo.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBuisness {
    @Inject
    CDIDao cdiDao;

    public CDIDao getCdiDao() {
        return cdiDao;
    }

    public void setCdiDao(CDIDao cdiDao) {
        this.cdiDao = cdiDao;
    }
}
