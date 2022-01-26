import java.util.Iterator;
import java.util.List;

public class TestTempExample {

    public static void main(final String[] args) {

        // populate test data

        final Iterator<String> testData = List.of("3.0", "-2.5", "8.2", "5.0").iterator();

        // define expected result

        final var expectedMax = 8.2;
        final var expectedMin = -2.5;

        // invoke the actual functionality (System Under Test = SUT)

        final var actualResult = TempExample.computeMinMax(testData);

        // verify result

        if (expectedMax == actualResult.getMax()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: expected " + expectedMax + " but got " + actualResult.getMax());
        }

        if (expectedMin == actualResult.getMin()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: expected " + expectedMin + " but got " + actualResult.getMin());
        }
    }
}
