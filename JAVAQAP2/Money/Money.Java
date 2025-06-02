public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return fromCents(totalCents);
    }

    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return fromCents(totalCents);
    }

    public int compareTo(Money otherObject) {
        return Long.compare(this.toCents(), otherObject.toCents());
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    private long toCents() {
        return dollars * 100 + cents;
    }

    private static Money fromCents(long totalCents) {
        long dollars = totalCents / 100;
        long cents = totalCents % 100;
        Money money = new Money(0);
        money.dollars = dollars;
        money.cents = cents;
        return money;
    }
}