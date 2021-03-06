package com.ericheitmuller;

public class Miner extends BaseGameEntity {
    private int comfortLevel;
    private int maxNuggets;
    private int thirstLevel;
    private int tirednessThreshold;
    private Location location;
    private int goldCarried;
    private int moneyInBank;
    private int thirst;
    private int fatigue;
    private State currentState;

    public Miner(int id, int comfortLevel, int maxNuggets,
                 int thirstLevel, int tirednessThreshold,
                 State startingState
                 ) {
        super(id);
        this.comfortLevel = comfortLevel;
        this.maxNuggets = maxNuggets;
        this.thirstLevel = thirstLevel;
        this.tirednessThreshold = tirednessThreshold;

        this.currentState = startingState;
        this.location = Location.SHACK;
        this.goldCarried = 0;
        this.moneyInBank = 0;

        // the higher the value, the thirstier the miner
        this.thirst = 0;

        //the higher the value, the more tired the miner
        this.fatigue = 0;
    }

    @Override
    public void update() {
        thirst += 1;
        if(currentState != null) {
            currentState.execute(this);
        }
    }

    public void changeState(State newState) {
        currentState.exit(this);
        currentState = newState;
        currentState.enter(this);
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
}
