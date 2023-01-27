/** Class for representing a min/max temperature result as a single object. */
public class MinMaxResult {

  /** Constructor for initialization of instance variables. */
  public MinMaxResult(
    final double min, 
    final double max, 
    final int count,
    final boolean nonNegative) 
  {
    this.min = min;
    this.max = max;
    this.count = count;
    this.nonNegative = nonNegative;
  }

  /** Instance variable for the minimum temperature. */
  private final double min;

  /** Instance variable for the maximum temperature. */
  private final double max;

  private final int count;

  private final boolean nonNegative;

  public double getMin() {
    return min;
  }

  public double getMax() {
    return max;
  }

  public int getCount() {
    return count;
  }

  public boolean getNonNegative() {
    return nonNegative;
  }
}
