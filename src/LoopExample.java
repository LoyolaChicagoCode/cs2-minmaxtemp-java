public class LoopExample {

    public static void main(final String[] args) {

        System.out.println("hello there!");

        System.out.println("Number of args: " + args.length);

        // counting loop: we know beforehand how many times it will repeat
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }

}
