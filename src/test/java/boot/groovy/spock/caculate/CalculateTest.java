package boot.groovy.spock.caculate;

import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

@SpringBootTest
public class CalculateTest {
    public static long calculate(long amount , float rate, RoundingMode roundingMode) {
        return BigDecimal.valueOf(amount * rate * 0.01)
                .setScale(0, roundingMode ).longValue();
    }
}
