package com.meetkiki.mario.table;

import com.meetkiki.mario.State;

import static com.meetkiki.mario.State.CAPE;
import static com.meetkiki.mario.State.FIRE;
import static com.meetkiki.mario.State.SMALL;
import static com.meetkiki.mario.State.SUPER;
import static com.meetkiki.mario.table.Event.GOT_CAPE;
import static com.meetkiki.mario.table.Event.GOT_FIRE;
import static com.meetkiki.mario.table.Event.GOT_MUSHROOM;
import static com.meetkiki.mario.table.Event.MET_MONSTER;

public class TableMarioStateMachine extends MarioStateMachine {

    private static final State[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
    };

    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };


    @Override
    public void obtainMushRoom() {
        executeEvent(GOT_MUSHROOM);
    }

    @Override
    public void obtainCape() {
        executeEvent(GOT_CAPE);
    }

    @Override
    public void obtainFireFlower() {
        executeEvent(GOT_FIRE);
    }

    @Override
    public void meetMonster() {
        executeEvent(MET_MONSTER);
    }


    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score = actionTable[stateValue][eventValue];
    }
}
