package model;


import strategy.MovingStrategy;

public class Car {
    private Name name;
    private Position position;

    public Car(String name) {
        this(new Name(name), new Position());
    }
    public Car(String name, Position position) {
        this(new Name(name), position);
    }

    public Car(Name name, Position position){
        this.name = name;
        this.position = position;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.isPossibleMoving()) {
            position.add();
        }
    }

    public boolean isEqualPosition(Position position) {
        return this.position.equals(position);
    }

    public Position getPosition() {
        return position;
    }
}