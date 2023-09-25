package enums;

public enum ScoreEnum {
    FOUR(4);

    int value;

    ScoreEnum(int value) {
        this.value = value;
    }

    public static boolean isGo(int number){
        return FOUR.getValue() <= number;
    }

    public int getValue(){
        return value;
    }
}
