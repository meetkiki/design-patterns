package com.meetkiki.mario.fsm;

import com.meetkiki.mario.State;

public interface IMario {

    State getName();
    /**
     * 以下是定义的事件
     */
    void obtainMushRoom(MarioStateMachine marioStateMachine);

    void obtainCape(MarioStateMachine marioStateMachine);

    void obtainFireFlower(MarioStateMachine marioStateMachine);

    void meetMonster(MarioStateMachine marioStateMachine);

}
