package com.jcohy.sample.design_pattern.visitor;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:12:02
 * @since 2022.04.0
 */
// tag::code[]
public class ObjectStructure {

    private Visitor visitor;

    private Node node;

    private List<Node> nodes;

    public ObjectStructure() {
        nodes = new ArrayList<>();
    }

    public void action(Visitor visitor) {
        nodes.forEach(node -> node.accept(visitor));
    }

    public void add(Node node) {
        nodes.add(node);
    }
}
// end::code[]
