package com.jcohy.sample.design_pattern.iterator;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:12:28
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Effective Java"));
        bookShelf.appendBook(new Book("Effective Python"));
        bookShelf.appendBook(new Book("Effective C++"));
        bookShelf.appendBook(new Book("Effective PHP"));
        Iterator it = bookShelf.iterator();
        while (it.hashNext()) {
            System.out.println(it.next());

        }
    }
}
// end::code[]
