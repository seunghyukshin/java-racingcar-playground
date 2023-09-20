import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

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

        return getSum(numberList);
    }

    private static String _getCustomDelimiter(String paramString) {

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(paramString);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens = m.group(2).split(customDelimiter);
            return customDelimiter;
        }

        return StringUtils.EMPTY_STRING;
    }

    private static String _getTargetString(String paramString) {


        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(paramString);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String token = m.group(2);
            return token;
        }

        return paramString;
    }


    private static String[] _split(String paramString, String customDelimiter){
        String regex = "[,:" + customDelimiter + "]";

        return paramString.split(regex);
    }

    private static List<Integer> _convert(String[] array){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(Integer.parseInt(array[i]));
        }
        return list;
    }

    private static int getSum(List<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).get();
    }
}
