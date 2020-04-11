package com.meetkiki.mario.table;

import com.meetkiki.mario.State;

public abstract class MarioStateMachine {
    protected int score;
    protected State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    /**
     * 吃了蘑菇
     */
    public abstract void obtainMushRoom();

    /**
     * 获得斗篷
     */
    public abstract void obtainCape();

    /**
     * 获得火焰
     */
    public abstract void obtainFireFlower();

    /**
     * 遇见怪物
     */
    public abstract void meetMonster();

    public State getCurrentState() {
        return currentState;
    }

    public int getScore() {
        return score;
    }
}