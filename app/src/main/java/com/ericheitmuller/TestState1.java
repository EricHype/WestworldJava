package com.ericheitmuller;

public class TestState1 implements State<Miner> {
    @Override
    public void enter(Miner object) {
        System.out.println("Entering test 1 state");
    }

    @Override
    public void exit(Miner object) {
        System.out.println("Exiting test 1 state");
    }

    @Override
    public void execute(Miner object) {
        System.out.println("Executing test 1 state");

        if(object.getThirst() > 5) {
            object.changeState(new TestState2());
        }
    }
}
