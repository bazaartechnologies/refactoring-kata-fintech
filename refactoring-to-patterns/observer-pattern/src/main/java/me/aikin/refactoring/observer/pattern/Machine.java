package me.aikin.refactoring.observer.pattern;

import java.util.Observer;

public abstract class Machine implements Observer {
    private Boolean status;

    protected void start() {
        this.status = true;
    }

    public Boolean getStatus() {
        return status;
    }

}
