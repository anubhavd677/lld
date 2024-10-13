package StrategyPattern.Strategy;

public class LegSpinBowlingStrategy implements BowlingStrategy {
    @Override
    public void bowl(){
        System.out.println("Leg spin bowler");
    }
}
