package com.meetkiki.mario.fsm;

import com.meetkiki.mario.State;

public class FireMario implements IMario {

    private static final FireMario instance = new FireMario();

    private FireMario() {}

    public static FireMario getInstance() {
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
        marioStateMachine.setScore(marioStateMachine.getScore() - 300);
    }
}
