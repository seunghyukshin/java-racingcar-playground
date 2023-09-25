import utils.StringUtils;

import java.util.List;

public class ResultView {
    public static void printResult(List<Car> winnerCarList) {
        String winnerName = StringUtils.concatWithDelimiter(_mapToCarNameArray(winnerCarList), ", ");
        System.out.println(winnerName + "가 최종 우승했습니다.");
    }

    // List<Car> to CarNameArray
    private static String[] _mapToCarNameArray(List<Car> carList) {
        return carList.stream().map(car -> car.name.toString()).toArray(String[]::new);
    }

    public static void printStatus(Car car) {
        System.out.println(car.getStatus());
    }
}
