import java.util.ArrayList;
import java.util.List;

public class Race {
    List<Car> carList = new ArrayList<>();
    public Race(String[] carNameArray) {

        for(String carName : carNameArray){
            Car car = new Car(carName);

            this.carList.add(car);
        }
    }
}
