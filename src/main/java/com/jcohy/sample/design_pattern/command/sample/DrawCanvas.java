package com.jcohy.sample.design_pattern.command.sample;

import java.awt.*;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:16:56
 * @since 2022.04.0
 */
// tag::code[]
public class DrawCanvas extends Canvas implements Drawable {

    private static final long serialVersionUID = 1L;

    // 颜色
    private Color color = Color.red;

    // 点的半径
    private int radius = 6;

    // 记录
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }

    // 再度绘制整个记录

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    // 绘制
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}
// end::code[]
