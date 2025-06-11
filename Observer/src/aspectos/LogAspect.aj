package aspectos;

import logic.ColorChangeEvent;

public aspect LogAspect {
    after(ColorChangeEvent event): execution(logic.ColorChangeEvent.new(..)) && this(event) {
        System.out.println("Color cambiado a: " + event.getColor());
    }
}