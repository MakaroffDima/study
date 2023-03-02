public class Human {
    String name, address, work;
    int age, weight;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 80;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.weight = 80;
        this.age = 35;
    }

    public Human(String name, int age, int weight) {
        this(name, age);
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this(name, age);
        this.weight = 80;
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "Tom";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}