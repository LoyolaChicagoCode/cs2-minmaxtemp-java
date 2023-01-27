/* To run this example, open a shell and type
 * java -ea TempExample 
 * or
 * java -ea TempExample noprompt
 *
 * Then enter values separated by spaces. Line structure doesn't matter.
 * To end the input, enter Control D (EOF character).
 *
 * To read input from a file, run it like so
 * java -ea TempExample noprompt < myfile.txt
 */

import java.util.Iterator;
import java.util.Scanner;

public class TempExample {

  // purpose: determine min and max values of temperatures read from stdin

  public static void main(final String[] args) {

    var prompt = true;
    if (args.length > 0 && "noprompt".equalsIgnoreCase(args[0])) {
      prompt = false;
    }
    System.err.println("prompting: " + prompt);

    final var input = new Scanner(System.in);
     
    // invoke the actual functionality
    final var result = computeMinMax(input, prompt);

    // print result
    System.out.println(result.getCount() + " items");
    System.out.println("max = " + result.getMax());
    System.out.println("min = " + result.getMin());
    if (!result.getNonNegative()) {
      System.out.println("some items were negative");
    }
    
    // QUESTION What happens if the input is empty? Is that behavior reasonable?
  }

  public static MinMaxResult computeMinMax(final Iterator<String> input, final boolean prompt) {
    var maxTemp = -Double.MAX_VALUE;
    var minTemp = +Double.MAX_VALUE;
    var count = 0;
    var nonNegative = true;

    if (prompt) {
      System.out.print("Enter a number: ");
    }
    while (input.hasNext()) {
      // pull next string item from input
      final String item = input.next();

      count += 1;

      // convert
      final double temp = Double.parseDouble(item);

      if (temp > maxTemp) {
        maxTemp = temp;
      }
      if (temp < minTemp) {
        minTemp = temp;
      }
      if (temp < 0) {
        nonNegative = false;
      }

      
      if (prompt) {
        System.out.print("Enter a number: ");
      }
    }

    return new MinMaxResult(minTemp, maxTemp, count, nonNegative);
  }
}
