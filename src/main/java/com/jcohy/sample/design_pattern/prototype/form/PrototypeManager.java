package com.jcohy.sample.design_pattern.prototype.form;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:15:19
 * @since 2022.04.0
 */
// tag::code[]
public class PrototypeManager {

    private List<Prototype> objects = new ArrayList<>();

    public void add(Prototype object) {
        objects.add(object);
    }

    public Prototype get(int i) {
        return objects.get(i);
    }

    public int getSize() {
        return objects.size();
    }

}
// end::code[]
