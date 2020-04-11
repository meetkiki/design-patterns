package com.meetkiki.mario.fsm;

import com.meetkiki.mario.State;

public class SuperMario implements IMario {

    private static final SuperMario instance = new SuperMario();

    private SuperMario() {}

    public static SuperMario getInstance() {
        return instance;
    }


    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {
        // do nothing...
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(CapeMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(FireMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(SmallMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() - 100);
    }
}