package com.meetkiki.mario;

import com.meetkiki.mario.table.MarioStateMachine;
import com.meetkiki.mario.table.TableMarioStateMachine;

public class ApplicationDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new TableMarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}