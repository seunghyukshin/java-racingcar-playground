package strategy;

public class MovingStrategy {
    int number;
    final int BOUNDARY_NUMBER = 4; // 기준 숫자
    public MovingStrategy(int number) {
        this.number = number;
    }


    public boolean isPossibleMoving() {
        return this.number > BOUNDARY_NUMBER;
    }
}
