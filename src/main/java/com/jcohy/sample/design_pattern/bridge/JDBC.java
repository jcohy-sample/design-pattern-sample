package com.jcohy.sample.design_pattern.bridge;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/13:18:42
 * @since 2022.04.0
 */
// tag::code[]
public abstract class JDBC {

    private Driver driver;

    public void connection() {
        driver.connection();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
// end::code[]
