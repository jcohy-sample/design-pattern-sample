package com.jcohy.sample.design_pattern.command.sample;

import java.util.Iterator;
import java.util.Stack;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:16:54
 * @since 2022.04.0
 */
// tag::code[]
public class MacroCommand implements Command {
    // 结合多个命令的命令的类
    private Stack<Command> commands = new Stack<Command>();

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            ((Command) it.next()).execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    // 删除最后一个命令
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
// end::code[]
