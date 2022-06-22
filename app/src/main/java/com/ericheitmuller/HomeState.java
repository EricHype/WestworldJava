package com.ericheitmuller;

public class HomeState implements State<Miner>{
    @Override
    public void enter(Miner miner) {
        miner.setLocation(Location.SHACK);
    }

    @Override
    public void exit(Miner miner) {
        System.out.println("Exiting home state");
    }

    @Override
    public void execute(Miner miner) {
        if(miner.isTired()) {
            miner.rest();
            System.out.println("Miner is fully rested");
        }
        miner.changeState(new TestState1());
    }
}