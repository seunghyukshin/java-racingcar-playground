import org.junit.jupiter.api.Test;
import utils.StringUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @Test
    public void Car_Create() {
        String strings = "pobi,crong,honux";
        String[] carStrings = StringUtils.splitByDelimiter(strings, ",");
        Car pobiCar = new Car(carStrings[0]);

        String expected = "Car{name=pobi, position=0}";
        // TODO : PASS해야함
        assertThat(pobiCar.toString()).isEqualTo(expected);
    }

}
