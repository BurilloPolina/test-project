package testproject;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertThat(Calculator.sum(2, 2)).isEqualTo(4);
    }

    @Test
    public void testSubtract() {
        assertThat(Calculator.subtract(3,2)).isEqualTo(1);
    }

    @Test
    public void testReset() {
        Aggregator agr = new Aggregator();
        double val = 7;
        agr.addValue(val);
        assertThat(agr.getSum()).isEqualTo(7);
        agr.reset();
        assertThat(agr.getSum()).isEqualTo(0);
    }
}
