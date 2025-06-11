package logic;

public class ColorChangeEvent {
    private final String color;

    public ColorChangeEvent(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
