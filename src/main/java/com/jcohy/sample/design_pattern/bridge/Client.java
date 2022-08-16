package com.jcohy.sample.design_pattern.bridge;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/13:18:43
 * @since 2022.04.0
 */
// tag::code[]
public class Client {
    public static void main(String[] args) {
        JDBC jdbc = new DriverManager();
        Driver mysql = new MysqlDriver();
        jdbc.setDriver(mysql);
        jdbc.connection();

        Driver oracle = new OracleDriver();
        jdbc.setDriver(oracle);
        jdbc.connection();

        Driver sqlserver = new SqlSerDriver();
        jdbc.setDriver(sqlserver);
        jdbc.connection();
    }
}
// end::code[]
