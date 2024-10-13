package StrategyPattern;

import StrategyPattern.Strategy.LegSpinBowlingStrategy;

public class Main {
    public static void main(String[] args){
        Bowler bowler = new LeftHandedBowler(new LegSpinBowlingStrategy());
        bowler.bowl();
    }
}
