public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.address = other.address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + " (" + address + ")";
    }
}
