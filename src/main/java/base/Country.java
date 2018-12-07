package base;

public enum Country {
    TURKEY("Turkey"),
    UKRAINE("Ukraine"),
    HOLLAND("Holland");

    private String country;

    private Country(String country) {
        this.country = country;
    }

    public String getName() {
        return this.country;
    }

    public String toString() {
        return "Country{name='" + this.country + '\'' + '}';
    }
}
