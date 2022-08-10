package com.jcohy.sample.design_pattern.factory.abs;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:10:59
 * @since 2022.04.0
 */
// tag::code[]
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
// end::code[]
