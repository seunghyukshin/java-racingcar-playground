import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringAddStringAddCalculatorTest {
    @Test
    public void OneCommaTwo() {
        String input = "1,2";

        StringAddCalculator stringAddCalculator = new StringAddCalculator(input);
        int result = stringAddCalculator.getSum();

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void OneCommaTwoCommaThree() {
        String input = "1,2,3";

        StringAddCalculator stringAddCalculator = new StringAddCalculator(input);
        int result = stringAddCalculator.getSum();

        assertThat(result).isEqualTo(6);
    }
    @Test
    public void OneCommaTwoColonThree() {

//        int result = StringAddCalculator.splitAndSum("1,2:3");
//        assertThat(result).isEqualTo(6);

        String input = "1,2:3";

        StringAddCalculator stringAddCalculator = new StringAddCalculator(input);
        int result = stringAddCalculator.getSum();

        assertThat(result).isEqualTo(6);
    }
}
