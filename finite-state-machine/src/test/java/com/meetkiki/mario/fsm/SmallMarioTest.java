package com.meetkiki.mario.fsm;

import com.meetkiki.mario.State;
import org.junit.Assert;
import org.junit.Test;

public class SmallMarioTest {

    @Test
    public void obtainMushRoom() {
        MarioStateMachine marioStateMachine = new MarioStateMachine();
        IMario mario = SmallMario.getInstance();
        mario.obtainMushRoom(marioStateMachine);

        Assert.assertEquals(marioStateMachine.getCurrentState(), State.SUPER);
        Assert.assertEquals(marioStateMachine.getScore(), 100);
    }
}