package StrategyPattern;

import StrategyPattern.Strategy.BowlingStrategy;

public class LeftHandedBowler extends Bowler {
    LeftHandedBowler(BowlingStrategy bowlingStrategy){
        super(bowlingStrategy);
    }
}
