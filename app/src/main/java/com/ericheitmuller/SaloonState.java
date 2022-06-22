package com.ericheitmuller;

public class SaloonState implements State<Miner>{
    @Override
    public void enter(Miner miner) {
        miner.setLocation(Location.SALOON);
    }

    @Override
    public void exit(Miner miner) {
        System.out.println("Exiting saloon state");
    }

    @Override
    public void execute(Miner miner) {
        try {
            miner.subtractMoney(1);
            miner.setThirst(0);
            System.out.println("Miner in saloon, spent 1 money and no longer thirsty");
        } catch (Error e) {
            System.out.println("Miner in saloon, cant buy water");
        }
        miner.changeState(new TestState1());
    }
}