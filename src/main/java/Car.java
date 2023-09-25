import enums.ScoreEnum;
import utils.RandomUtils;

public class Car {
    String name;
    int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }

    /**
     * @flow <pre>
     *     1. 랜덤횟수 생성
     *     2. 숫자 4와 비교 후 조건 성립시 position 변경
     * </pre>
     */
    public void drive() {
        int randomNumber = RandomUtils.getPositiveSingleDigitNumber(); // 랜덤횟수 생성
        if (ScoreEnum.isGo(randomNumber)) {
            _go();
        }
    }

    private void _go() {
        this.position++;
    }

    public String getResult() {
        return this.name + ":" + getHyphen();
    }

    // position 수만큼 - 생성
    public String getHyphen() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

}
