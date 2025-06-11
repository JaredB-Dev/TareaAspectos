package aspectos;

import logic.ColorChangeEvent;

public aspect ClickCounterAspect {
    private static int clickCount = 0;

    after(ColorChangeEvent event): execution(ColorChangeEvent.new(..)) && this(event) {
        clickCount++;
        System.out.println("Botones clickeados: " + clickCount + " veces. Color: " + event.getColor());
    }
}
