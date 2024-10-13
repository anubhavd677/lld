package StrategyPattern.Strategy;

public class OffSpinBowlingStrategy implements BowlingStrategy {
    @Override
    public void bowl(){
        System.out.println("Off spin bowler");
    }
}
