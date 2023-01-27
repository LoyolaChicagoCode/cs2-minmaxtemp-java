/* To run this test, open a shell and type
 * java -ea TestTempExample
 *
 * If you make any changes, recompile the code via
 * javac *.java
 * or pressing the green Run button.
 */

import java.util.Iterator;
import java.util.List;

public class TestTempExample {

  public static void main(final String[] args) {

    // populate test data
    final var testData = List.of("3.0", "-2.5", "8.2", "5.0").iterator();
    testMinMax(testData, -2.5, 8.2, 4, false);

    // QUESTION Why do we need the MinMaxResult class?

    final var testData2 = List.of("-3.0", "-2.5", "-8.2", "-5.0").iterator();
    testMinMax(testData2, -8.2, -2.5, 4, false);

    final var testData3 = List.of("-3.0").iterator();
    testMinMax(testData3, -3.0, -3.0, 1, false);

    final var testData4 = List.of("3.0", "4.0").iterator();
    testMinMax(testData4, 3.0, 4.0, 2, true);

    System.out.println("everything appears to be OK");
  }

  public static void testMinMax(final Iterator<String> testData, final double expectedMin, final double expectedMax, final int expectedCount, final boolean expectedNonNeg) {
    // invoke the actual functionality (System Under Test = SUT)
    final var actualResult = TempExample.computeMinMax(testData, false);

    // verify result
    assert expectedMin == actualResult.getMin() : "FAIL: expected " + expectedMin + " but got " + actualResult.getMin();
    assert expectedMax == actualResult.getMax() : "FAIL: expected " + expectedMax + " but got " + actualResult.getMax();
    assert expectedCount == actualResult.getCount() : "FAIL: expected " + expectedCount + " but got " + actualResult.getCount();
    assert expectedNonNeg == actualResult.getNonNegative() : "FAIL: expected " + expectedNonNeg + " but got " + actualResult.getNonNegative();
  }

}
