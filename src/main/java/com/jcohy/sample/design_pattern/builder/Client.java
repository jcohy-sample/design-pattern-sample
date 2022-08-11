package com.jcohy.sample.design_pattern.builder;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:10:21
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {
        if (args.length < 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            Director director = new Director(new TextBuilder());
            String result = (String) director.construct();
            System.out.println(result);
        }
        else if (args[0].equals("html")) {
            Director director = new Director(new HtmlBuilder());
            String fileName = (String) director.construct();
            System.out.println("以产生" + fileName);
        }
        else {
            usage();
            System.exit(0);
        }

    }

    public static void usage() {
        System.out.println("Usage java Main Plain 产生一般文件格式的文件");
        System.out.println("Usage java Main Plain 产生一般HTML文件格式的文件");
    }
}
// end::code[]
