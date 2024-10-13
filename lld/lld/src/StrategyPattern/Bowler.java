package StrategyPattern;

import StrategyPattern.Strategy.BowlingStrategy;

public class Bowler {
    BowlingStrategy bowlingStrategy;
    Bowler(BowlingStrategy bowlingStrategy){
        this.bowlingStrategy = bowlingStrategy;
    }

    public void bowl(){
        bowlingStrategy.bowl();
    }
}
