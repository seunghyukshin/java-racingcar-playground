package model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public Position getMaxPosition() {
        return carList.stream().map(car -> car.getPosition()).max(Position::compareTo).get();
    }

    public Cars getCarsHavingEqualPosition(Position position) {
        List<Car> filteredCarList = this.carList.stream()
                .filter(car -> car.isEqualPosition(position))
                .collect(Collectors.toList());

        return new Cars(filteredCarList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return carList.equals(cars.carList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carList);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carList=" + carList.toString() +
                '}';
    }
}
