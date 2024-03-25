public class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age, "Labrador");
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}