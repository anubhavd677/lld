package StrategyPattern.Strategy;

public class FastBowlingStrategy implements BowlingStrategy {
    @Override
    public void bowl(){
        System.out.println("Fast bowler");
    }
}
