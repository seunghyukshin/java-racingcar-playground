package model;

import java.util.Objects;

public class Position implements Comparable<Position> {
    private int position;

    public Position(int position) {
        this.position = position;
    }

    public Position() {
        this(0);
    }

    public void add() {
        position++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "model.Position{" +
                "position=" + position +
                '}';
    }

    @Override
    public int compareTo(Position o) {
        if (o.position > this.position) {
            return -1;
        }
        if (o.position < this.position) {
            return 1;
        }
        return 0;
    }
}
