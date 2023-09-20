import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {


    public static int splitAndSum(String paramString) {
        if(StringUtils.isEmpty(paramString)){
            return 0;
        }

        String customDelimiter = _getCustomDelimiter(paramString);
        String targetString = _getTargetString(paramString);

        String[] split = _split(targetString, customDelimiter);
        List<Integer> numberList = _convert(split);
        _validateContainsNegative(numberList);

        return getSum(numberList);
    }


    private static String _getCustomDelimiter(String paramString) {

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(paramString);
        if (m.find()) {
            return m.group(1);
        }

        return StringUtils.EMPTY_STRING;
    }

    private static String _getTargetString(String paramString) {


        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(paramString);
        if (m.find()) {
            return m.group(2);
        }

        return paramString;
    }


    private static String[] _split(String paramString, String customDelimiter){
        String regex = "[,:" + customDelimiter + "]";

        return paramString.split(regex);
    }

    private static List<Integer> _convert(String[] array){
        List<Integer> list = new ArrayList<>();
        for (String s : array) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }


    private static void _validateContainsNegative(List<Integer> numberList) {
        if(_isContainsNegative(numberList)){
            throw new RuntimeException();
        }
    }
    private static boolean _isContainsNegative(List<Integer> numberList) {
        return numberList.stream().anyMatch(number -> number < 0);
    }

    private static int getSum(List<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).get();
    }
}
