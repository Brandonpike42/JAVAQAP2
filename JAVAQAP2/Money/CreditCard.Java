public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money balance, Money creditLimit) {
        // Use copy constructors to avoid aliasing
        this.owner = new Person(owner);
        this.balance = new Money(balance);
        this.creditLimit = new Money(creditLimit);
    }

    public Person getOwner() {
        return new Person(owner);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    @Override
    public String toString() {
        return "CreditCard[" + owner + ", Balance: " + balance + ", Limit: " + creditLimit + "]";
    }
}
