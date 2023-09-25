import org.junit.jupiter.api.Test;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @Test
    public void Car_Create() {
        String strings = "pobi,crong,honux";
        String[] carStrings = StringUtils.splitByDelimiter(strings, ",");
        Car pobiCar = new Car(carStrings[0]);
        Car crongCar = new Car(carStrings[1]);
        Car honuxCar = new Car(carStrings[2]);

        // TODO : PASS해야함
        assertThat(pobiCar).isEqualTo("Car{name=pobi, position=0}");
    }

    @Test
    public void Race_Create() {
        String strings = "pobi,crong,honux";
        String[] carStrings = StringUtils.splitByDelimiter(strings, ",");
        List<Car> carList = new ArrayList<>();
        for (String carName : carStrings) {
            carList.add(new Car(carName));
        }
        Race race = new Race(carList);

        // TODO : PASS해야함
        assertThat(race).isEqualTo("Car{name=pobi, position=0}");
    }
}
