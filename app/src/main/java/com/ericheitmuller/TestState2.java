package com.ericheitmuller;

public class TestState2<T> implements State<T>{
    @Override
    public void enter(T object) {
        System.out.println("Entering test 2 state");
    }

    @Override
    public void exit(T object) {
        System.out.println("Exiting test 2 state");
    }

    @Override
    public void execute(T object) {
        System.out.println("Executing test 2 state");
    }
}
