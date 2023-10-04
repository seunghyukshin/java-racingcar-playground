import model.Car;
import model.Cars;
import model.Position;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {
    @Test
    public void Cars_getMaxPosition() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("poni", new Position(5)));
        carList.add(new Car("horse", new Position(1)));
        carList.add(new Car("crong", new Position(8)));
        Cars cars = new Cars(carList);

        Position maxPosition = cars.getMaxPosition();
        assertThat(new Position(8).equals(maxPosition)).isTrue();
    }

    @Test
    public void Cars_getCarsHavingEqualPosition(){

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("poni", new Position(5)));
        carList.add(new Car("horse", new Position(1)));
        carList.add(new Car("crong", new Position(8)));
        Cars cars = new Cars(carList);

        Cars filteredCars = cars.getCarsHavingEqualPosition(new Position(5));

        List<Car> carList2 = new ArrayList<>();
        carList2.add(new Car("poni", new Position(5)));
        Cars cars2 = new Cars(carList2);

        assertThat(filteredCars.equals(cars2)).isTrue();
    }
}
