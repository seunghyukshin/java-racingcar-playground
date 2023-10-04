package model;

public class RacingGame {
    private Cars cars;
    public RacingGame(Cars cars) {
        this.cars = cars;
    }

    public Cars getWinnerCars() {
        Position maxPosition = cars.getMaxPosition();

        return cars.getCarsHavingEqualPosition(maxPosition);
    }
}
