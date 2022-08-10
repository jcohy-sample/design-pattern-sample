package com.jcohy.sample.design_pattern.factory.abs;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:10:39
 * @since 2022.04.0
 */
// tag::code[]
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return (Shape) new Circle();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return (Shape) new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return (Shape) new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
// end::code[]
