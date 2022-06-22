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
            if(object.getMoney() > 0) {
                object.changeState(new SaloonState());
            }
            else {
                System.out.println("No money, cant go to saloon");
            }
        }
        if(object.isTired()) {
            object.changeState(new HomeState());
        }
    }
}
