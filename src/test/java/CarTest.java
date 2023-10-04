import model.Car;
import model.Position;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import strategy.MovingStrategy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarTest {
    @Test
    public void Car_Move() {

        Car pobiCar = new Car("pobi");
        pobiCar.move(new MovingStrategy(4));

        Car crongCar = new Car("crong");
        crongCar.move(new MovingStrategy(5));

        Position position = new Position(1);
        assertThat(pobiCar.isEqualPosition(position)).isFalse();
        assertThat(crongCar.isEqualPosition(position)).isTrue();
    }

    @Test
    public void Car_5글자초과검증() {
        assertThatThrownBy(() -> new Car("pobizzang")).isInstanceOf(RuntimeException.class);
    }

}
