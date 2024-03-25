public class Poodle extends Dog {


    public Poodle(String name, int age) {
        super(name, age, "Poodle");
    }

    public void tricks() {
        System.out.println(getName() + " is performing tricks!");
    }
}