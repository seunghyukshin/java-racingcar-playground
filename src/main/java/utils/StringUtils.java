package utils;

public class StringUtils {
    public static String[] splitByDelimiter(String target, String delimiter) {
        return target.split(delimiter);
    }

    /***
     * @desc String 배열의 값들에 구분자를 통해 하나의 String값으로 합침
     * ex)
     * concatWithDelimiter({"a", "A", "acb"}, ";")
     * "a;A;acd"
     */
    public static String concatWithDelimiter(String[] targetArray, String delimiter) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < targetArray.length; i++) {
            sb.append(targetArray[i]);

            if (i == targetArray.length - 1) {
                continue;
            }
            sb.append(delimiter);
        }
        return sb.toString();
    }

}
