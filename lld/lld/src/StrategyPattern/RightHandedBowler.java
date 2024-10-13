package StrategyPattern;

import StrategyPattern.Strategy.BowlingStrategy;

public class RightHandedBowler extends Bowler {
    RightHandedBowler(BowlingStrategy bowlingStrategy){
        super(bowlingStrategy);
    }
}
