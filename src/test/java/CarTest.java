import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void Car_Create() {
        String strings = "pobi,crong,honux";
        String[] carStrings = StringUtils.splitByDelimiter(strings, ",");
        Race race = new Race(carStrings);
//        race.passTurn(1);

    }
}
