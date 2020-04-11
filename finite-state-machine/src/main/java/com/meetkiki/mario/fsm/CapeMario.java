package com.meetkiki.mario.fsm;

import com.meetkiki.mario.State;

public class CapeMario implements IMario {

    private static final CapeMario instance = new CapeMario();

    private CapeMario() {
    }

    public static CapeMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }


    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {
        // do nothing...
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        // do nothing...
    }

    @Override
    public void obtainFireFlower(MarioStateMachine marioStateMachine) {
        // do nothing...
    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(SmallMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() - 200);
    }
}
