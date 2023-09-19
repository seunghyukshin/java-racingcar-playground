import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class StringAddCalculator {

    public static int splitAndSum(String paramString) {
        if(StringUtils.isEmpty(paramString)){
            return 0;
        }

        String customDelimiter = _getCustomDelimiter(paramString);

        String[] split = _split(paramString, customDelimiter);
        List<Integer> numberList = _convert(split);

        return getSum(numberList);
    }

    private static String _getCustomDelimiter(String paramString) {
        String regex = "//.\n";

        if(!paramString.matches(regex)){
            return StringUtils.EMPTY_STRING;
        }

        String[] split = paramString.split(regex);

        System.out.println(split[0]);
        System.out.println(split[1]);
        return split[0];
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
