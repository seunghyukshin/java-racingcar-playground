import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("실행 결과");
        for (int n = 0; n < N; n++) {
            _turnOn();
        }
        ResultView.printResult(_getWinner());
    }


    // 한 바퀴 돌때 Car 전진 + 상태 출력
    private void _turnOn() {
        _driveCarList(); // 전진
        _printStatus(); // 상태 출력
        System.out.println(); // 다음턴 사이에 한 줄 띄어주기
    }

    // Car 전진
    private void _driveCarList() {
        carList.forEach(Car::drive);
    }

    // Car 상태 출력
    private void _printStatus() {
        carList.forEach(ResultView::printStatus);
    }

    // 가장 큰 position 과 같은 car들을 filtering 하여 반환
    private List<Car> _getWinner() {
        int maxPosition = _getMaxPosition();
        List<Car> winnerCarList = carList.stream()
                .filter(car-> car.isEqualPosition(maxPosition))
                .collect(Collectors.toList());
        return winnerCarList;
    }

    private int _getMaxPosition() {
        int maxPosition = -1;
        for (Car car : carList) {
            maxPosition = Math.max(maxPosition, car.position);
        }
        return maxPosition;
    }

}
