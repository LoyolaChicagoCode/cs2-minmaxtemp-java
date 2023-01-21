/** Class for representing a min/max temperature result. */
public class MinMaxResult {

  /** Constructor for initialization of instance variables. */
  public MinMaxResult(final double min, final double max) {
    this.min = min;
    this.max = max;
  }

  /** Instance variable for the minimum temperature. */
  private final double min;

  /** Instance variable for the maximum temperature. */
  private final double max;

  public double getMin() {
    return min;
  }

  public double getMax() {
    return max;
  }
}
