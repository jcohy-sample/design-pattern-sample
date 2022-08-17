package com.jcohy.sample.design_pattern.command.sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:16:57
 * @since 2022.04.0
 */
// tag::code[]
public class Client extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    // 简单的绘图软件，移动鼠标时自动绘制一个红点，按下clear 清除所有
    private MacroCommand history = new MacroCommand();// 绘制记录

    private DrawCanvas drawCanvas = new DrawCanvas(400, 400, history);// 绘制区域

    private JButton cleanButton = new JButton("clear");// 删除键

    public Client(String title) {
        super(title);
        this.addWindowListener(this);
        drawCanvas.addMouseMotionListener(this);
        cleanButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(cleanButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(drawCanvas);
        getContentPane().add(mainBox);

        pack();

        setVisible(true);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(drawCanvas, e.getPoint());

        history.append(cmd);

        cmd.execute();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cleanButton) {
            history.clear();
            drawCanvas.repaint();
        }
    }

    public static void main(String[] args) {
        new Client("Command Pattern Sample");
    }
}
// end::code[]
