package base;

public enum Color {
    RED("red"),
    PINK("pink"),
    YELLOW("yellow"),
    WHITE("white");
    private String name;

    Color(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}