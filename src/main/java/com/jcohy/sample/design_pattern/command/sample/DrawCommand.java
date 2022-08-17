package com.jcohy.sample.design_pattern.command.sample;

import java.awt.*;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:16:55
 * @since 2022.04.0
 */
// tag::code[]
public class DrawCommand implements Command {
    private Drawable drawable;

    private Point point;

    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = drawable;
        this.point = point;
    }

    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}
// end::code[]
