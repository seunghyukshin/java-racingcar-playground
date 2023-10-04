import model.*;
import org.junit.jupiter.api.Test;
import strategy.MovingStrategy;
import view.ResultView;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingGameTest {
    @Test
    public void Racing_getWinnerCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("pobi", new Position(5)));
        carList.add(new Car("crong", new Position(3)));
        carList.add(new Car("hunox", new Position(1)));
        RacingGame racingGame = new RacingGame(new Cars(carList));
        Cars winnerCars = racingGame.getWinnerCars();

        List<Car> carList2 = new ArrayList<>();
        carList.add(new Car("pobi", new Position(5)));
        Cars cars = new Cars(carList2);

        assertThat(winnerCars.equals(cars)).isTrue();


    }
}
