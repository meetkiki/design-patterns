package com.meetkiki.mario.fsm

import com.meetkiki.mario.State
import spock.lang.Specification

class MarioTest extends Specification{


    def "given small when obtainMushRoom"(){
        given:
        def instance = SmallMario.instance
        MarioStateMachine marioStateMachine = new MarioStateMachine(instance)

        when:
        instance.obtainMushRoom(marioStateMachine)

        then:
        marioStateMachine.getCurrentState() == State.SUPER
        marioStateMachine.getScore() == 100
    }


    def "given super when obtainMushRoom"(){
        given:
        def instance = SuperMario.instance
        MarioStateMachine marioStateMachine = new MarioStateMachine(instance)

        when:
        instance.obtainMushRoom(marioStateMachine)

        then:
        marioStateMachine.getCurrentState() == State.SUPER
        marioStateMachine.getScore() == 0
    }




}
