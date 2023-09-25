import java.util.ArrayList;
import java.util.List;

public class Race {
    private final List<Car> carList;

    public Race(List<Car> carList) {
        this.carList = carList;
    }

    public String toString() {
        return carList.stream().map(car -> car.name + " " + car.position).reduce((a, b) -> a + b).get();
    }

    // N바퀴
    public void turnOn(int N) {
        for (int n = 0; n < N; n++) {
            _turnOn();
        }
    }

    // 1바퀴 돌때
    private void _turnOn(){
        carList.forEach(Car::drive);
        // TPODO : car.getResult 안에 넣기
    }

}
