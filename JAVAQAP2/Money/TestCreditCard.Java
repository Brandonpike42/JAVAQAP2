public class TestCreditCard {
    public static void main(String[] args) {
        Person person = new Person("Alice Johnson", "123 Main St");
        Money balance = new Money(500, 75);
        Money limit = new Money(1000, 0);

        CreditCard card = new CreditCard(person, balance, limit);
        System.out.println(card);

        // Testing Money equals and compareTo
        Money m1 = new Money(10, 50);
        Money m2 = new Money(10, 50);
        Money m3 = new Money(20, 0);

        System.out.println("m1 equals m2: " + m1.equals(m2)); // true
        System.out.println("m1 compareTo m3: " + m1.compareTo(m3)); // < 0
    }
}
