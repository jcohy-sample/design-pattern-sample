package com.jcohy.sample.design_pattern.composite.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:10:52
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {

        System.out.println("Root directory");
        Directory rootDirectory = new Directory("root");
        Directory binDirectory = new Directory("bin");
        Directory tmpDirectory = new Directory("tmp");
        Directory usrDirectory = new Directory("usr");

        rootDirectory.add(binDirectory);
        rootDirectory.add(tmpDirectory);
        rootDirectory.add(usrDirectory);

        binDirectory.add(new File("vi.txt", 100));
        binDirectory.add(new File("late.txt", 100));

        rootDirectory.printList();
        // 输出
        // Root directory
        // /root(200)
        // /root/bin(200)
        // /root/bin/vi.txt(100)
        // /root/bin/late.txt(100)
        // /root/tmp(0)
        // /root/usr(0)
    }

}
// end::code[]
