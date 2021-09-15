package com.ericheitmuller;

public abstract class BaseGameEntity {

    private int id;

    public BaseGameEntity(int id) {
        this.id = id;
    }

    public abstract void update();
}
