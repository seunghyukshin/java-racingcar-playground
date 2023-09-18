import java.util.ArrayList;
import java.util.List;

public class StringAddCalculator {

//    public static int splitAndSum(String paramString) {
//        String[] splited = _split(paramString);
//        return getSum(splited);
//    }

//    private String[] _split(String paramString){
//        return paramString.split(",|:");
//    }

    List<Integer> numbers;

    public StringAddCalculator(String paramString) {
        _init(paramString);
    }

    private void _init(String paramString) {
        numbers = new ArrayList<>();
        String[] split = paramString.split(":|,");
        for (int i = 0; i < split.length; i++) {
            numbers.add(Integer.parseInt(split[i]));
        }
    }

    public int getSum() {
        return this.numbers.stream().reduce((a, b) -> a + b).get();
    }
}
