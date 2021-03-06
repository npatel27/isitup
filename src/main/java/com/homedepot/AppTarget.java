package com.homedepot;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AppTarget {

    @Id
    private String appName;
    private String downMessage;
    private boolean isUp;

    public AppTarget() {};

    public AppTarget(String name, String message, boolean status) {
        setAppName(name);
        setDownMessage(message);
        setUp(status);
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDownMessage() {
        return downMessage;
    }

    public void setDownMessage(String downMessage) {
        this.downMessage = downMessage;
    }

    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean up) {
        isUp = up;
    }
}