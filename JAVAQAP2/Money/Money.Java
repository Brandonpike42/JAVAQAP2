public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        if (cents >= 100) {
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        } else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // compareTo method
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return this.dollars - other.dollars;
        }
        return this.cents - other.cents;
    }

    // equals method
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
