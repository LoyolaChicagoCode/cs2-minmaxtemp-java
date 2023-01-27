// To run this example, open a shell and type
// java -ea LoopExample hello world what up

public class LoopExample {

  public static void main(final String[] args) {

    System.out.println("hello there!");

    System.out.println("Number of args: " + args.length);

    // counting loop: we know beforehand how many times it will repeat
    for (var i = 0; i < args.length; i++) {
      System.out.println("args[" + i + "] = " + args[i]);
    }

    // QUESTION What is the purpose of args? What can you do with them?

    // QUESTION What does the var keyword do?
  }
}
