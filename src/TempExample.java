import java.util.Iterator;
import java.util.Scanner;

public class TempExample {

    // purpose: determine min and max values of temperatures read from stdin

    public static void main(final String[] args) {

        final Iterator<String> input = new Scanner(System.in);

        // invoke the actual functionality
        final var result = computeMinMax(input);

        // print result
        System.out.println("max = " + result.getMax());
        System.out.println("min = " + result.getMin());
    }

    public static MinMaxResult computeMinMax(final Iterator<String> input) {
        var maxTemp = -Double.MAX_VALUE;
        var minTemp = +Double.MAX_VALUE;

        while (input.hasNext()) {
            // pull next string item from input
            final String item = input.next();

            // convert
            final double temp = Double.parseDouble(item);

            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
        }

        return new MinMaxResult(minTemp, maxTemp);
    }
}
