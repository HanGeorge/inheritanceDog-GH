public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println(name + " is barking!");
    }

    public void play() {
        System.out.println(name + " is playing fetch!");
    }

    public void feed() {
        System.out.println(name + " is eating.");
    }
}

