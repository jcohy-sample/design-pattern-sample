package com.jcohy.sample.design_pattern.facade;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/13:18:20
 * @since 2022.04.0
 */
// tag::code[]
public class Computer {

    private Cpu cpu;

    private Memory memory;

    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {
        System.out.println("computer startup");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer startup finished");

    }

    public void shutdown() {
        System.out.println("computer shutdown");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer shutdown finished");
    }

}
// end::code[]
