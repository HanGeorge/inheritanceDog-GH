public class testing {
    public static void main(String[] args) {
        GoldenRetriever golden = new GoldenRetriever("Buddy", 3);
        Labrador labrador = new Labrador("Max", 4);
        Poodle poodle = new Poodle("Charlie", 2);

        golden.bark();
        golden.play();
        golden.retrieve();

        labrador.bark();
        labrador.play();
        labrador.swim();

        poodle.bark();
        poodle.play();
        poodle.tricks();
    }
}
