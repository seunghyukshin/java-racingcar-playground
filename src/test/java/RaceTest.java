import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RaceTest {

    Race race;

    @BeforeEach
    public void init() {
        String strings = "pobi,crong,honux";
        String[] carStrings = StringUtils.splitByDelimiter(strings, ",");
        List<Car> carList = new ArrayList<>();
        for (String carName : carStrings) {
            carList.add(new Car(carName));
        }
        race = new Race(carList);
    }

    @Test
    public void Race_turnOn_1() {
        race.turnOn(1);
        ResultView.printResult(race);
    }
}
