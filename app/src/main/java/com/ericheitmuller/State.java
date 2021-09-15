package com.ericheitmuller;

import jdk.jshell.spi.ExecutionControl;

public interface State<T> {
    void enter(T object);
    void exit(T object);
    void execute(T object);
}
