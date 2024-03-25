public class GoldenRetriever extends Dog {
    public GoldenRetriever(String name, int age) {
        super(name, age, "Golden Retriever");
    }

    public void retrieve() {
        System.out.println(getName() + " is retrieving an object.");
    }
}