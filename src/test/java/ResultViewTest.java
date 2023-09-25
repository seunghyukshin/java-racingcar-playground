import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResultViewTest {

    List<Car> carList;

    @BeforeEach
    public void init() {
        String strings = "pobi,crong,honux";
        String[] carStrings = StringUtils.splitByDelimiter(strings, ",");
        carList = new ArrayList<>();
        for (String carName : carStrings) {
            carList.add(new Car(carName));
        }
    }

    @Test
    public void ResultView_concatWithDelimiter() {
        String[] names = {"a", "bb", "cad"};

        String result = StringUtils.concatWithDelimiter(names, ", ");
        assertThat(result).isEqualTo("a, bb, cad");

    }
}
