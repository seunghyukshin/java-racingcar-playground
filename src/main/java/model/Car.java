package model;


import strategy.MovingStrategy;

public class Car {
    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.isPossibleMoving()) {
            position.add();
        }
    }

    public boolean isEqualPosition(Position position) {
        return this.position.equals(position);
    }
}