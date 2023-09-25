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
            System.out.println();
        }
    }

    /***
     *한 바퀴 돌때
     * 1. Car 전진
     * 2. Car상태 출력
     * 3.
     */
    private void _turnOn() {
        carList.forEach(car -> {
            car.drive();
            ResultView.printStatus(car);
        });

        System.out.println();
    }

}
